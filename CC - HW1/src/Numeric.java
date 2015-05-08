// Generated from Numeric.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Numeric extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BININT=1, OCTINT=2, HEXINT=3, DECINT=4, BINLONG=5, OCTLONG=6, HEXLONG=7, 
		DECLONG=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BIN", "OCT", "DEC", "DEC1", "HEX", "BININT", "OCTINT", "HEXINT", "DECINT", 
		"BINLONG", "OCTLONG", "HEXLONG", "DECLONG"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BININT", "OCTINT", "HEXINT", "DECINT", "BINLONG", "OCTLONG", "HEXLONG", 
		"DECLONG"
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


	public Numeric(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Numeric.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\n\u00a5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7/\n\7\f\7\16\7\62\13\7\3\7\3\7\5\7\66"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\7\b=\n\b\f\b\16\b@\13\b\3\b\3\b\5\bD\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\7\tM\n\t\f\t\16\tP\13\t\3\t\3\t\5\tT\n\t\3\n"+
		"\3\n\3\n\3\n\7\nZ\n\n\f\n\16\n]\13\n\3\n\3\n\5\na\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\7\13j\n\13\f\13\16\13m\13\13\3\13\3\13\5\13q\n\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\7\fz\n\f\f\f\16\f}\13\f\3\f\3\f\5\f\u0081"+
		"\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u008c\n\r\f\r\16\r\u008f"+
		"\13\r\3\r\3\r\5\r\u0093\n\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u009b\n\16"+
		"\f\16\16\16\u009e\13\16\3\16\3\16\5\16\u00a2\n\16\3\16\3\16\2\2\17\3\2"+
		"\5\2\7\2\t\2\13\2\r\3\17\4\21\5\23\6\25\7\27\b\31\t\33\n\3\2\4\4\2\62"+
		";CH\4\2NNnn\u00b7\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\37\3"+
		"\2\2\2\7!\3\2\2\2\t#\3\2\2\2\13%\3\2\2\2\r\'\3\2\2\2\17\67\3\2\2\2\21"+
		"E\3\2\2\2\23`\3\2\2\2\25b\3\2\2\2\27t\3\2\2\2\31\u0084\3\2\2\2\33\u00a1"+
		"\3\2\2\2\35\36\4\62\63\2\36\4\3\2\2\2\37 \4\629\2 \6\3\2\2\2!\"\4\62;"+
		"\2\"\b\3\2\2\2#$\4\63;\2$\n\3\2\2\2%&\t\2\2\2&\f\3\2\2\2\'(\7\62\2\2("+
		")\7d\2\2)\65\3\2\2\2*\66\5\3\2\2+\60\5\3\2\2,/\5\3\2\2-/\7a\2\2.,\3\2"+
		"\2\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62"+
		"\60\3\2\2\2\63\64\5\3\2\2\64\66\3\2\2\2\65*\3\2\2\2\65+\3\2\2\2\66\16"+
		"\3\2\2\2\67C\7\62\2\28D\5\5\3\29>\5\5\3\2:=\5\5\3\2;=\7a\2\2<:\3\2\2\2"+
		"<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\5\5\3\2"+
		"BD\3\2\2\2C8\3\2\2\2C9\3\2\2\2D\20\3\2\2\2EF\7\62\2\2FG\7z\2\2GS\3\2\2"+
		"\2HT\5\13\6\2IN\5\13\6\2JM\5\13\6\2KM\7a\2\2LJ\3\2\2\2LK\3\2\2\2MP\3\2"+
		"\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\5\13\6\2RT\3\2\2\2SH\3"+
		"\2\2\2SI\3\2\2\2T\22\3\2\2\2Ua\5\t\5\2V[\5\t\5\2WZ\5\7\4\2XZ\7a\2\2YW"+
		"\3\2\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2"+
		"^_\5\7\4\2_a\3\2\2\2`U\3\2\2\2`V\3\2\2\2a\24\3\2\2\2bc\7\62\2\2cd\7d\2"+
		"\2dp\3\2\2\2eq\5\3\2\2fk\5\3\2\2gj\5\3\2\2hj\7a\2\2ig\3\2\2\2ih\3\2\2"+
		"\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\5\3\2\2oq\3\2\2"+
		"\2pe\3\2\2\2pf\3\2\2\2qr\3\2\2\2rs\t\3\2\2s\26\3\2\2\2t\u0080\7\62\2\2"+
		"u\u0081\5\5\3\2v{\5\5\3\2wz\5\5\3\2xz\7a\2\2yw\3\2\2\2yx\3\2\2\2z}\3\2"+
		"\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\5\5\3\2\177\u0081\3"+
		"\2\2\2\u0080u\3\2\2\2\u0080v\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\t"+
		"\3\2\2\u0083\30\3\2\2\2\u0084\u0085\7\62\2\2\u0085\u0086\7z\2\2\u0086"+
		"\u0092\3\2\2\2\u0087\u0093\5\13\6\2\u0088\u008d\5\13\6\2\u0089\u008c\5"+
		"\13\6\2\u008a\u008c\7a\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c"+
		"\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u0090\u0091\5\13\6\2\u0091\u0093\3\2\2\2\u0092"+
		"\u0087\3\2\2\2\u0092\u0088\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\t\3"+
		"\2\2\u0095\32\3\2\2\2\u0096\u00a2\5\t\5\2\u0097\u009c\5\t\5\2\u0098\u009b"+
		"\5\7\4\2\u0099\u009b\7a\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b"+
		"\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\5\7\4\2\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u0096\3\2\2\2\u00a1\u0097\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\t\3"+
		"\2\2\u00a4\34\3\2\2\2\33\2.\60\65<>CLNSY[`ikpy{\u0080\u008b\u008d\u0092"+
		"\u009a\u009c\u00a1\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}