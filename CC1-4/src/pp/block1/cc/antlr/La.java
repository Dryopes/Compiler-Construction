// Generated from La.g4 by ANTLR 4.5
package pp.block1.cc.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class La extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TOKEN=1, LATOKEN=2, LALATOKEN=3, LALALALITOKEN=4;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"TOKEN", "LA", "LI", "LATOKEN", "LALATOKEN", "LALALALITOKEN"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TOKEN", "LATOKEN", "LALATOKEN", "LALALALITOKEN"
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


	public La(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "La.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\6<\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\7\2\24\n\2\f\2"+
		"\16\2\27\13\2\3\2\3\2\3\3\3\3\6\3\35\n\3\r\3\16\3\36\3\3\7\3\"\n\3\f\3"+
		"\16\3%\13\3\3\4\3\4\6\4)\n\4\r\4\16\4*\3\4\7\4.\n\4\f\4\16\4\61\13\4\3"+
		"\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\2\2\b\3\3\5\2\7\2\t\4\13\5\r\6"+
		"\3\2\3\3\2$$?\2\3\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\17\3"+
		"\2\2\2\5\32\3\2\2\2\7&\3\2\2\2\t\62\3\2\2\2\13\64\3\2\2\2\r\67\3\2\2\2"+
		"\17\25\7$\2\2\20\24\n\2\2\2\21\22\7$\2\2\22\24\7$\2\2\23\20\3\2\2\2\23"+
		"\21\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\30\3\2\2\2\27"+
		"\25\3\2\2\2\30\31\7$\2\2\31\4\3\2\2\2\32\34\7N\2\2\33\35\7c\2\2\34\33"+
		"\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37#\3\2\2\2 \"\7\""+
		"\2\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\6\3\2\2\2%#\3\2\2\2&(\7"+
		"N\2\2\')\7k\2\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+/\3\2\2\2,.\7"+
		"\"\2\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\b\3\2\2\2\61/\3"+
		"\2\2\2\62\63\5\5\3\2\63\n\3\2\2\2\64\65\5\5\3\2\65\66\5\5\3\2\66\f\3\2"+
		"\2\2\678\5\5\3\289\5\5\3\29:\5\5\3\2:;\5\7\4\2;\16\3\2\2\2\t\2\23\25\36"+
		"#*/\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}