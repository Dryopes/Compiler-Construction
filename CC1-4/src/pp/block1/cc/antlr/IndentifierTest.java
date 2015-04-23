package pp.block1.cc.antlr;

import org.junit.Test;

public class IndentifierTest {
	private static LexerTester tester = new LexerTester(Indentifier.class);

	@Test
	public void succeedingTest() {
		tester.correct("a01234");
		tester.correct("QaWdFx");
		
		tester.yields("a01234a01234", Indentifier.TOKEN, Indentifier.TOKEN);
	}

	@Test
	public void failingDigitStart() {
		// spaces in keywords are not in the rules, so claiming it's correct
		// will fail
		tester.wrong("0dsf87");
	}
	
	@Test
	public void failingTooFew() {
		// spaces in keywords are not in the rules, so claiming it's correct
		// will fail
		tester.wrong("0324d");
	}
	
	@Test
	public void failingTooMany() {
		// spaces in keywords are not in the rules, so claiming it's correct
		// will fail
		tester.wrong("0324daa");
	}
}
