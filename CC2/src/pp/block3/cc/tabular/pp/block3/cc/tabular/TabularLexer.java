// Generated from Tabular.g4 by ANTLR 4.5
package pp.block3.cc.tabular;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ARGTYPE=8, TEXT=9, 
		WS=10, COMMENT=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "ARGTYPE", "TEXT", 
		"WS", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\\begin{'", "'}'", "'tabular'", "'{'", "'\\\\'", "'&'", "'\\end{'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "ARGTYPE", "TEXT", "WS", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\rQ\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\6\t:\n\t\r\t\16\t;\3\n\3\n\6\n@\n\n\r\n\16\nA\3\13\6\13E\n\13\r\13\16"+
		"\13F\3\13\3\13\3\f\3\f\3\f\5\fN\n\f\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\3\2\5\5\2eenntt\b\2\13\13\"\"\60\60\62"+
		";C\\c|\4\2\f\f\17\17S\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2\t+\3\2\2\2\13"+
		"-\3\2\2\2\r\60\3\2\2\2\17\62\3\2\2\2\219\3\2\2\2\23?\3\2\2\2\25D\3\2\2"+
		"\2\27J\3\2\2\2\31\32\7^\2\2\32\33\7d\2\2\33\34\7g\2\2\34\35\7i\2\2\35"+
		"\36\7k\2\2\36\37\7p\2\2\37 \7}\2\2 \4\3\2\2\2!\"\7\177\2\2\"\6\3\2\2\2"+
		"#$\7v\2\2$%\7c\2\2%&\7d\2\2&\'\7w\2\2\'(\7n\2\2()\7c\2\2)*\7t\2\2*\b\3"+
		"\2\2\2+,\7}\2\2,\n\3\2\2\2-.\7^\2\2./\7^\2\2/\f\3\2\2\2\60\61\7(\2\2\61"+
		"\16\3\2\2\2\62\63\7^\2\2\63\64\7g\2\2\64\65\7p\2\2\65\66\7f\2\2\66\67"+
		"\7}\2\2\67\20\3\2\2\28:\t\2\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2"+
		"\2<\22\3\2\2\2=@\t\3\2\2?=\3\2\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2"+
		"\2\2B\24\3\2\2\2CE\t\4\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3"+
		"\2\2\2HI\b\13\2\2I\26\3\2\2\2JM\7\'\2\2KN\5\23\n\2MK\3\2\2\2ML\3\2\2\2"+
		"NO\3\2\2\2OP\b\f\2\2P\30\3\2\2\2\b\2;?AFM\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}