package pp.block2.cc.ll;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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
			for( Rule r : rules) {
				List<Symbol> right = r.getRHS();
				rhs.remove(Symbol.EMPTY);
				for(int i = 1; i < rhs.size() && result.get(rhs.get(i)).contains(Symbol.EMPTY); i++) {
					rhs
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
