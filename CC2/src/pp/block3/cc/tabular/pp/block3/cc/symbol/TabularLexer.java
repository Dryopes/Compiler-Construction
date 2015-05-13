// Generated from Tabular.g4 by ANTLR 4.5
package pp.block3.cc.symbol;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TabularLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LCR=1, BEGINTABLE=2, ENDTABLE=3, ENDROW=4, SEPERATEROW=5, STRING=6, COMMENT=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LCR", "BEGINTABLE", "ENDTABLE", "ENDROW", "SEPERATEROW", "STRING", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LCR", "BEGINTABLE", "ENDTABLE", "ENDROW", "SEPERATEROW", "STRING", 
		"COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public TabularLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tabular.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\tp\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\6\2\24\n\2\r\2"+
		"\16\2\25\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\60\n\3\f\3\16\3\63\13\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4D\n\4"+
		"\f\4\16\4G\13\4\3\5\3\5\3\5\3\5\7\5M\n\5\f\5\16\5P\13\5\3\6\3\6\7\6T\n"+
		"\6\f\6\16\6W\13\6\3\7\3\7\7\7[\n\7\f\7\16\7^\13\7\3\7\7\7a\n\7\f\7\16"+
		"\7d\13\7\3\b\3\b\7\bh\n\b\f\b\16\bk\13\b\3\b\3\b\3\b\3\b\2\2\t\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\3\2\6\5\2eenntt\5\2\13\f\17\17\"\"\5\2\62;C\\c"+
		"|\3\2\f\fx\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\3\21\3\2\2\2\5\36\3\2\2\2\7\64\3\2\2\2\tH"+
		"\3\2\2\2\13Q\3\2\2\2\r\\\3\2\2\2\17e\3\2\2\2\21\23\7}\2\2\22\24\t\2\2"+
		"\2\23\22\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\27\3\2\2"+
		"\2\27\33\7\177\2\2\30\32\t\3\2\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2"+
		"\2\2\33\34\3\2\2\2\34\4\3\2\2\2\35\33\3\2\2\2\36\37\7^\2\2\37 \7d\2\2"+
		" !\7g\2\2!\"\7i\2\2\"#\7k\2\2#$\7p\2\2$%\7}\2\2%&\7v\2\2&\'\7c\2\2\'("+
		"\7d\2\2()\7w\2\2)*\7n\2\2*+\7c\2\2+,\7t\2\2,-\7\177\2\2-\61\3\2\2\2.\60"+
		"\t\3\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\6\3\2\2"+
		"\2\63\61\3\2\2\2\64\65\7^\2\2\65\66\7g\2\2\66\67\7p\2\2\678\7f\2\289\7"+
		"}\2\29:\7v\2\2:;\7c\2\2;<\7d\2\2<=\7w\2\2=>\7n\2\2>?\7c\2\2?@\7t\2\2@"+
		"A\7\177\2\2AE\3\2\2\2BD\t\3\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2"+
		"\2F\b\3\2\2\2GE\3\2\2\2HI\7^\2\2IJ\7^\2\2JN\3\2\2\2KM\t\3\2\2LK\3\2\2"+
		"\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\n\3\2\2\2PN\3\2\2\2QU\7(\2\2RT\t\3\2"+
		"\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\f\3\2\2\2WU\3\2\2\2X[\t\4"+
		"\2\2ZX\3\2\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]b\3\2\2\2^\\"+
		"\3\2\2\2_a\t\3\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\16\3\2\2\2"+
		"db\3\2\2\2ei\7\'\2\2fh\n\5\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2"+
		"jl\3\2\2\2ki\3\2\2\2lm\7\f\2\2mn\3\2\2\2no\b\b\2\2o\20\3\2\2\2\r\2\25"+
		"\33\61ENUZ\\bi\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}