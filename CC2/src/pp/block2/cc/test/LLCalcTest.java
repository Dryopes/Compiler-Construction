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
import pp.block2.cc.ll.abc;

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
	
	@Test
	public void testIf() {
		Grammar g = Grammars.makeIf();
		//NonTerms
		NonTerm stat = g.getNonterminal("Stat");
		NonTerm elsePart = g.getNonterminal("ElsePart");
		
		//Terminals
		Term ifT = g.getTerminal(If.IF);
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
		assertEquals(set(eof, elseT), follow.get(stat));
		assertEquals(set(eof, elseT), follow.get(elsePart));
		
		//FIRST+
		Map<Rule, Set<Term>> firstPlus = calc.getFirstp();
		List<Rule> elsePartRules = g.getRules(elsePart);
		List<Rule> statRules = g.getRules(stat);
		
		assertEquals(set(elseT), firstPlus.get(elsePartRules.get(0)));
		assertEquals(set(eof, elseT, empty), firstPlus.get(elsePartRules.get(1)));
		
		assertEquals(set(assign), firstPlus.get(statRules.get(0)));
		assertEquals(set(ifT), firstPlus.get(statRules.get(1)));	
		
		//LL1
		assertFalse(calc.isLL1());
	}
	
	@Test
	public void testAbc() {
		Grammar g = Grammars.makeAbc();
		//NonTerms
		NonTerm l = g.getNonterminal("L");
		NonTerm r1 = g.getNonterminal("R1");
		NonTerm r2 = g.getNonterminal("R2");
		NonTerm q1 = g.getNonterminal("Q1");
		NonTerm q2 = g.getNonterminal("Q2");
		
		//Terminals
		Term tA = g.getTerminal(abc.A);
		Term tB = g.getTerminal(abc.B);
		Term tC = g.getTerminal(abc.C);
		Term eof = Symbol.EOF;
		Term empty = Symbol.EMPTY;
		
		LLCalc calc = createCalc(g);
		
		//FIRST
		Map<Symbol, Set<Term>> first = calc.getFirst();
		assertEquals(set(tA, tB, tC), 	first.get(l));
		assertEquals(set(tA, tC), 		first.get(r1));
		assertEquals(set(tB, empty), 	first.get(r2));
		assertEquals(set(tB), 			first.get(q1));
		assertEquals(set(tB, tC), 		first.get(q2));
		
		//FOLLOW
		Map<NonTerm, Set<Term>> follow = calc.getFollow();
		assertEquals(set(eof), 	follow.get(l));
		assertEquals(set(tA), 	follow.get(r1));
		assertEquals(set(tA), 	follow.get(r2));
		assertEquals(set(tB), 	follow.get(q1));
		assertEquals(set(tB), 	follow.get(q2));
		
		//FIRST+
		Map<Rule, Set<Term>> firstPlus = calc.getFirstp();
		List<Rule> lRules 	= g.getRules(l);
		List<Rule> r1Rules 	= g.getRules(r1);
		List<Rule> r2Rules 	= g.getRules(r2);
		List<Rule> q1Rules 	= g.getRules(q1);
		List<Rule> q2Rules 	= g.getRules(q2);
		
		assertEquals(set(tA, tC), 	firstPlus.get(lRules.get(0)));
		assertEquals(set(tB), 		firstPlus.get(lRules.get(1)));
		assertEquals(set(tA), 		firstPlus.get(r1Rules.get(0)));
		assertEquals(set(tC), 		firstPlus.get(r1Rules.get(1)));
		assertEquals(set(tB), 		firstPlus.get(r2Rules.get(0)));
		assertEquals(set(tA, empty),firstPlus.get(r2Rules.get(1)));
		assertEquals(set(tB),		firstPlus.get(q1Rules.get(0)));
		assertEquals(set(tB), 		firstPlus.get(q2Rules.get(0)));
		assertEquals(set(tC), 		firstPlus.get(q2Rules.get(1)));
		
		assertTrue(calc.isLL1());
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
