package pp.block1.cc.antlr;

import org.junit.Test;

public class PLStringTest {
	private static LexerTester tester = new LexerTester(PLString.class);

	@Test
	public void succeedingTest() {
		tester.correct("\"sadkjfklsadjf\"");
		tester.correct("\"sdaf\"\"alkjdsf\"");
	}

	@Test
	public void failingSingleQuote() {
		// spaces in keywords are not in the rules, so claiming it's correct
		// will fail
		tester.wrong("\"asdjfk\"asdjfkl\"");
	}
	
}
