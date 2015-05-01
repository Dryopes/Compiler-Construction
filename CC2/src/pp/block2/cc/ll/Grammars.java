/**
 * 
 */
package pp.block2.cc.ll;

import pp.block2.cc.SymbolFactory;
import pp.block2.cc.NonTerm;
import pp.block2.cc.Term;

/**
 * Class containing some example grammars.
 * @author Arend Rensink
 *
 */
public class Grammars {
	/** Returns a grammar for simple English sentences. */
	public static Grammar makeSentence() {
		// Define the non-terminals
		NonTerm sent = new NonTerm("Sentence");
		NonTerm subj = new NonTerm("Subject");
		NonTerm obj = new NonTerm("Object");
		NonTerm mod = new NonTerm("Modifier");
		// Define the terminals, using the Sentence.g4 lexer grammar
		SymbolFactory fact = new SymbolFactory(Sentence.class);
		Term noun = fact.getTerminal(Sentence.NOUN);
		Term verb = fact.getTerminal(Sentence.VERB);
		Term adj = fact.getTerminal(Sentence.ADJECTIVE);
		Term end = fact.getTerminal(Sentence.ENDMARK);
		// Build the context free grammar
		Grammar g = new Grammar(sent);
		g.addRule(sent, subj, verb, obj, end);
		g.addRule(subj, noun);
		g.addRule(subj, mod, subj);
		g.addRule(obj, noun);
		g.addRule(obj, mod, obj);
		g.addRule(mod, adj);
		return g;
	}
	
	public static Grammar makeIf() {
		// Define the non-terminals
		NonTerm stat = new NonTerm("Stat");
		NonTerm elsepart = new NonTerm("ElsePart");
		
		SymbolFactory fact = new SymbolFactory(If.class);
		Term tIF = fact.getTerminal(If.IF);
		Term tTHEN = fact.getTerminal(If.THEN);
		Term tCOND = fact.getTerminal(If.COND);
		Term tELSE = fact.getTerminal(If.ELSE);
		Term tASSIGN = fact.getTerminal(If.ASSIGN);
		
		// Build the context free grammar
		Grammar g = new Grammar(sent);
		g.addRule(stat, tASSIGN);
		g.addRule(stat, tIF, EXPR?, tTHEN, stat, elsepart);
		g.addRule(elsepart, tELSE, stat);
		g.addRule(elsepart, Term.EMPTY);
		return g;
	}
}
