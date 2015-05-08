import org.junit.Test;

public class NumericTest {
	private static LexerTester tester = new LexerTester(Numeric.class);
	
	
	@Test
	public void testLaLa() {
		tester.correct("1");
		tester.correct("324");
		tester.correct("0237");
		tester.correct("0xF92");
		tester.correct("0b101");
		
		tester.correct("1l");
		tester.correct("324L");
		tester.correct("0237l");
		tester.correct("0237L");
		tester.correct("0xF92l");
		tester.correct("0xF92L");
		tester.correct("0b101l");
		tester.correct("0b101L");
		
		tester.correct("1__2");
		tester.correct("3_2___4");
		tester.correct("02_3__7");
		tester.correct("0xF__9__2");
		tester.correct("0b1__0____1");
		
		tester.wrong("1_");
		tester.wrong("324_");
		tester.wrong("0237_");
		tester.wrong("0xF92_");
		tester.wrong("0b101_");
		
		tester.wrong("_1");
		tester.wrong("_324");
		tester.wrong("_0237");
		tester.wrong("_0xF92");
		tester.wrong("_0b101");
		
		tester.wrong("0_237");
		tester.wrong("0_xF92");
		tester.wrong("0x_F92");
		tester.wrong("0_b101");
		tester.wrong("0b_101");
		
		tester.yields("1", Numeric.DECINT);
		tester.yields("324", Numeric.DECINT);
		tester.yields("0237", Numeric.OCTINT);
		tester.yields("0xF92", Numeric.HEXINT);
		tester.yields("0b101", Numeric.BININT);
		
		tester.yields("1l", Numeric.DECLONG);
		tester.yields("324L", Numeric.DECLONG);
		tester.yields("0237l", Numeric.OCTLONG);
		tester.yields("0237L", Numeric.OCTLONG);
		tester.yields("0xF92l", Numeric.HEXLONG);
		tester.yields("0xF92L", Numeric.HEXLONG);
		tester.yields("0b101l", Numeric.BINLONG);
		tester.yields("0b101L", Numeric.BINLONG);
		
	}
}
