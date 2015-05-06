package pp.block2.cc.ll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;

import pp.block2.cc.AST;
import pp.block2.cc.NonTerm;
import pp.block2.cc.ParseException;
import pp.block2.cc.Parser;
import pp.block2.cc.Symbol;
import pp.block2.cc.Term;

/** Generic table-driven LL(1)-parser. */
public class GenericLLParser implements Parser {
	public GenericLLParser(Grammar g) {
		this.g = g;
		this.calc = new LLCalcImp(g); // here use your own class
	}

	private final Grammar g;
	private final LLCalc calc;

	@Override
	public AST parse(Lexer lexer) throws ParseException {
		this.tokens = lexer.getAllTokens();
		this.index = 0;
		return parse(g.getStart());
	}

	/** Parses the start of the token stream according to a given
	 * symbol. If it is a terminal, that should be the first token;
	 * otherwise, it is a non-terminal that should be expanded 
	 * according to the next token in the token stream, using the
	 * FIRST+-lookup table and recursively calling {@link #parse(Rule)}
	 * @param symb the symbol according to which the token stream 
	 * should be parsed
	 * @return the sub-AST resulting from the parsing of symb;
	 * or null if the symbol expands to the empty string
	 * @throws ParseException if the symbol cannot be parsed
	 * because the token stream does not contain the expected symbols
	 */
	private AST parse(Symbol symb) throws ParseException {

		if(symb instanceof NonTerm){
			return parse(lookup((NonTerm)symb));		
		}else{
			return new AST((Term) symb, tokens.get(index));
		}
	}

	/** Parses the start of the token stream according to a given
	 * rule, recursively calling {@link #parse(Symbol)} to process
	 * the RHS.
	 * @return the sub-AST resulting from the parsing of the rule.
	 * The top node is the node for the LHS of the rule, its direct
	 * children correspond to the symbols of the rule's RHS.
	 * @throws ParseException if the symbol cannot be parsed
	 * because the token stream does not contain the expected symbols
	 */
	private AST parse(Rule rule) throws ParseException {
		AST subtree = new AST(rule.getLHS());
		List<Symbol>rhs = rule.getRHS();
		for(Symbol s : rhs){
			if(s instanceof NonTerm){	
				subtree.addChild(parse(lookup((NonTerm) s)));
			}else if(((Term)s).getTokenType() == peek().getType()){
					subtree.addChild(new AST((Term) s, next()));
			}else{
					throw new ParseException("Unexpected token for this Rule");
				}
			}
		
		return subtree;
	}

	/** Returns the next token, without moving the token index. */
	private Token peek() throws ParseException {
		if (index >= tokens.size()) {
			throw new ParseException("Reading beyond end of input");
		}
		return tokens.get(index);
	}

	/** Returns the next token and moves up the token index. */
	private Token next() throws ParseException {
		Token result = peek();
		index++;
		return result;
	}

	private int index;
	private List<? extends Token> tokens;

	/** Uses the lookup table to look up the rule to which
	 * a given nonterminal should be expanded.
	 * The next rule is determined by the next token, using the
	 * FIRST+-set of the nonterminal.
	 * @throws ParseException if the lookup table does not 
	 * contain a rule for the nonterminal in combination with
	 * the first token in the token stream.
	 */
	private Rule lookup(NonTerm nt) throws ParseException {
		Token next = peek();
		Rule result = getLL1Table().get(nt).get(next.getType());
		if (result == null) {
			throw new ParseException(String.format(
					"Line %d:%d - no rule for '%s' on token '%s'",
					next.getLine(), next.getCharPositionInLine(),
					nt.getName(), next));
		}
		return result;
	}

	/** Lazily builds and then returns the lookup table. */
	private Map<NonTerm, List<Rule>> getLL1Table() {
		if (ll1Table == null) {
			ll1Table = calcLL1Table();
		}
		return ll1Table;
	}

	/** Constructs the {@link #ll1Table}. */
	private Map<NonTerm, List<Rule>> calcLL1Table() {
		Map<Rule, Set<Term>> firstp = calc.getFirstp();
		Map<NonTerm, List<Rule>> result = new HashMap<NonTerm, List<Rule>>();		
		
		for(NonTerm a : g.getNonterminals()) {			
			ArrayList<Rule> columns = new ArrayList<Rule>();
			for(Term w : g.getTerminals()) {
				//Add term columns
				columns.add(null);
			}
			
			//Add eof column
			columns.add(null);
			result.put(a, columns);
			
			for(Rule p : g.getRules()) {
				if(p.getLHS().equals(a)) {
					for(Term w : firstp.get(p)) {
						result.get(a).set(w.getTokenType(), p);
					}
					
					if(firstp.get(p).contains(Symbol.EOF)){
						result.get(a).set(result.get(a).size()-1, p);
					}
				}
				
			}
		}
		
		return result;

	}

	/** Map from non-terminals to lists of rules indexed by token type. */
	private Map<NonTerm, List<Rule>> ll1Table;
}
