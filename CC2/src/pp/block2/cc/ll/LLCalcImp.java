package pp.block2.cc.ll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import pp.block2.cc.NonTerm;
import pp.block2.cc.Symbol;
import pp.block2.cc.Term;

public class LLCalcImp implements LLCalc {
	private Grammar grammar;
	
	public LLCalcImp(Grammar grammar) {
		this.grammar = grammar;
	}

	@Override
	public Map<Symbol, Set<Term>> getFirst() {
		Map<Symbol, Set<Term>> result = new HashMap<Symbol, Set<Term>>();
		Map<Symbol, Set<Term>> oldResult = new HashMap<Symbol, Set<Term>>();
		Set<NonTerm> nonterms = grammar.getNonterminals();
		Set<Term> terms = grammar.getTerminals();
		List<Rule> rules = grammar.getRules();
		
		for (Term t : terms) {
			Set<Term> set = new HashSet<Term>();
			set.add(t);
			result.put(t, set);
		}
				
		for(NonTerm nt : nonterms) {
			result.put(nt, new HashSet<Term>());
		}
		
		while(!result.equals(oldResult)) {
			// Make a deep copy of the previous result
			oldResult.clear();
			for(Entry<Symbol, Set<Term>> entry : result.entrySet()) {
				oldResult.put(entry.getKey(), new HashSet<Term>(entry.getValue()));
			}
			
			// Loop through the rulezzzz (r € R where p == A -> B)
			for( Rule r : rules) {
				Symbol left = r.getLHS();
				List<Symbol> bs = r.getRHS();
				List<Symbol> rhs = new ArrayList<Symbol>();
				rhs.addAll(result.get(bs.get(0)));
				rhs.remove(Symbol.EMPTY);
				
				int i = 1;
				for(i = 1; i < bs.size()-1 && result.get(bs.get(i)).contains(Symbol.EMPTY); i++) {
					rhs.addAll(result.get(bs.get(i)));
					rhs.remove(Symbol.EMPTY);
				}
				
				if(i == bs.size() -1 && result.get(bs.get(i)).contains(Symbol.EMPTY)) {
					rhs.add(Symbol.EMPTY);
				}
				
				for(Symbol sym : rhs) {
					result.get(left).add((Term)sym);
				}
			}
		}
		
		
		return result;
	}

	@Override
	public Map<NonTerm, Set<Term>> getFollow() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Rule, Set<Term>> getFirstp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isLL1() {
		// TODO Auto-generated method stub
		return false;
	}

}
