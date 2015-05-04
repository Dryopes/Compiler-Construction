package pp.block2.cc.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import pp.block2.cc.NonTerm;
import pp.block2.cc.Symbol;
import pp.block2.cc.Term;
import pp.block2.cc.ll.Grammar;
import pp.block2.cc.ll.Grammars;
import pp.block2.cc.ll.If;
import pp.block2.cc.ll.LLCalc;
import pp.block2.cc.ll.LLCalcImp;
import pp.block2.cc.ll.Rule;
import pp.block2.cc.ll.Sentence;

public class LLCalcTest {
	/** Tests the LL-calculator for the Sentence grammar. */
	@Test
	public void testSentence() {
		Grammar g = Grammars.makeSentence();
		// Without the last (recursive) rule, the grammar is LL-1
		assertTrue(createCalc(g).isLL1());
		NonTerm subj = g.getNonterminal("Subject");
		NonTerm obj = g.getNonterminal("Object");
		NonTerm sent = g.getNonterminal("Sentence");
		NonTerm mod = g.getNonterminal("Modifier");
		g.addRule(mod, mod, mod);
		LLCalc calc = createCalc(g);
		// FIRST sets
		Term adj = g.getTerminal(Sentence.ADJECTIVE);
		Term noun = g.getTerminal(Sentence.NOUN);
		Term verb = g.getTerminal(Sentence.VERB);
		Term end = g.getTerminal(Sentence.ENDMARK);
		assertEquals(set(adj, noun), calc.getFirst().get(sent));
		assertEquals(set(adj, noun), calc.getFirst().get(subj));
		assertEquals(set(adj, noun), calc.getFirst().get(obj));
		assertEquals(set(adj), calc.getFirst().get(mod));
		// FOLLOW sets
		assertEquals(set(Symbol.EOF), calc.getFollow().get(sent));
		assertEquals(set(verb), calc.getFollow().get(subj));
		assertEquals(set(end), calc.getFollow().get(obj));
		assertEquals(set(noun, adj), calc.getFollow().get(mod));
		// is-LL1-test
		assertFalse(calc.isLL1());
	}
	
	public void testIf() {
		Grammar g = Grammars.makeIf();
		//NonTerms
		NonTerm stat = g.getNonterminal("Stat");
		NonTerm elsePart = g.getNonterminal("ElsePart");
		
		//Terminals
		Term ifT = g.getTerminal(If.IF);
		Term then = g.getTerminal(If.THEN);
		Term cond = g.getTerminal(If.COND);
		Term assign = g.getTerminal(If.ASSIGN);
		Term elseT = g.getTerminal(If.ELSE);
		Term eof = Symbol.EOF;
		Term empty = Symbol.EMPTY;
		
		LLCalc calc = createCalc(g);
		
		//FIRST
		Map<Symbol, Set<Term>> first = calc.getFirst();
		assertEquals(set(assign, ifT), first.get(stat));
		assertEquals(set(elseT, empty), first.get(elsePart));
		
		//FOLLOW
		Map<NonTerm, Set<Term>> follow = calc.getFollow();
		assertEquals(set(eof, elseT, empty), follow.get(stat));
		assertEquals(set(eof, elseT, empty), follow.get(elsePart));
		
		//FIRST+
		Map<Rule, Set<Term>> firstPlus = calc.getFirstp();
		List<Rule> elsePartRules = g.getRules(elsePart);
		assertEquals(set(eof), firstPlus.get(elsePartRules.get(0)));
		assertEquals(set(eof, elseT), firstPlus.get(elsePartRules.get(1)));
		
		
	}

	/** Creates an LL1-calculator for a given grammar. */
	private LLCalc createCalc(Grammar g) {
		return new LLCalcImp(g); // your implementation of LLCalc
	}

	@SuppressWarnings("unchecked")
	private <T> Set<T> set(T... elements) {
		return new HashSet<>(Arrays.asList(elements));
	}
}
