// Generated from ArrayPascal.g4 by ANTLR 4.5
package pp.block5.cc.pascal;
package pp.block5.cc.pascal;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArrayPascalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARRAY=1, OF=2, DOTDOT=3, LSQ=4, RSQ=5, AND=6, BEGIN=7, BOOLEAN=8, INTEGER=9, 
		DO=10, ELSE=11, END=12, EXIT=13, FALSE=14, FUNC=15, IF=16, IN=17, THEN=18, 
		NOT=19, OR=20, OUT=21, PROC=22, PROGRAM=23, TRUE=24, VAR=25, WHILE=26, 
		ASS=27, COLON=28, COMMA=29, DOT=30, DQUOTE=31, EQ=32, GE=33, GT=34, LE=35, 
		LBRACE=36, LPAR=37, LT=38, MINUS=39, NE=40, PLUS=41, RBRACE=42, RPAR=43, 
		SEMI=44, SLASH=45, STAR=46, ID=47, NUM=48, STR=49, COMMENT=50, WS=51;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ARRAY", "OF", "DOTDOT", "LSQ", "RSQ", "AND", "BEGIN", "BOOLEAN", "INTEGER", 
		"DO", "ELSE", "END", "EXIT", "FALSE", "FUNC", "IF", "IN", "THEN", "NOT", 
		"OR", "OUT", "PROC", "PROGRAM", "TRUE", "VAR", "WHILE", "ASS", "COLON", 
		"COMMA", "DOT", "DQUOTE", "EQ", "GE", "GT", "LE", "LBRACE", "LPAR", "LT", 
		"MINUS", "NE", "PLUS", "RBRACE", "RPAR", "SEMI", "SLASH", "STAR", "ID", 
		"NUM", "STR", "LETTER", "DIGIT", "COMMENT", "WS", "A", "B", "C", "D", 
		"E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", 
		"S", "T", "U", "V", "W", "X", "Y", "Z"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'..'", "'['", "']'", null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "':='", "':'", "','", "'.'", "'\"'", "'='", "'>='", 
		"'>'", "'<='", "'{'", "'('", "'<'", "'-'", "'<>'", "'+'", "'}'", "')'", 
		"';'", "'/'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ARRAY", "OF", "DOTDOT", "LSQ", "RSQ", "AND", "BEGIN", "BOOLEAN", 
		"INTEGER", "DO", "ELSE", "END", "EXIT", "FALSE", "FUNC", "IF", "IN", "THEN", 
		"NOT", "OR", "OUT", "PROC", "PROGRAM", "TRUE", "VAR", "WHILE", "ASS", 
		"COLON", "COMMA", "DOT", "DQUOTE", "EQ", "GE", "GT", "LE", "LBRACE", "LPAR", 
		"LT", "MINUS", "NE", "PLUS", "RBRACE", "RPAR", "SEMI", "SLASH", "STAR", 
		"ID", "NUM", "STR", "COMMENT", "WS"
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


	public ArrayPascalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ArrayPascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\65\u01b0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3+"+
		"\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\7\60\u0152\n\60\f\60\16\60"+
		"\u0155\13\60\3\61\3\61\7\61\u0159\n\61\f\61\16\61\u015c\13\61\3\62\3\62"+
		"\7\62\u0160\n\62\f\62\16\62\u0163\13\62\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\65\3\65\7\65\u016d\n\65\f\65\16\65\u0170\13\65\3\65\3\65\3\65\3\65"+
		"\3\66\6\66\u0177\n\66\r\66\16\66\u0178\3\66\3\66\3\67\3\67\38\38\39\3"+
		"9\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3"+
		"E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3"+
		"P\4\u0161\u016e\2Q\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\2g\2i\64k\65m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085"+
		"\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097"+
		"\2\u0099\2\u009b\2\u009d\2\u009f\2\3\2\37\4\2C\\c|\3\2\62;\5\2\13\f\17"+
		"\17\"\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJ"+
		"jj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2"+
		"SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4"+
		"\2\\\\||\u0199\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\3\u00a1\3\2\2\2"+
		"\5\u00a7\3\2\2\2\7\u00aa\3\2\2\2\t\u00ad\3\2\2\2\13\u00af\3\2\2\2\r\u00b1"+
		"\3\2\2\2\17\u00b5\3\2\2\2\21\u00bb\3\2\2\2\23\u00c3\3\2\2\2\25\u00cb\3"+
		"\2\2\2\27\u00ce\3\2\2\2\31\u00d3\3\2\2\2\33\u00d7\3\2\2\2\35\u00dc\3\2"+
		"\2\2\37\u00e2\3\2\2\2!\u00eb\3\2\2\2#\u00ee\3\2\2\2%\u00f1\3\2\2\2\'\u00f6"+
		"\3\2\2\2)\u00fa\3\2\2\2+\u00fd\3\2\2\2-\u0101\3\2\2\2/\u010b\3\2\2\2\61"+
		"\u0113\3\2\2\2\63\u0118\3\2\2\2\65\u011c\3\2\2\2\67\u0122\3\2\2\29\u0125"+
		"\3\2\2\2;\u0127\3\2\2\2=\u0129\3\2\2\2?\u012b\3\2\2\2A\u012d\3\2\2\2C"+
		"\u012f\3\2\2\2E\u0132\3\2\2\2G\u0134\3\2\2\2I\u0137\3\2\2\2K\u0139\3\2"+
		"\2\2M\u013b\3\2\2\2O\u013d\3\2\2\2Q\u013f\3\2\2\2S\u0142\3\2\2\2U\u0144"+
		"\3\2\2\2W\u0146\3\2\2\2Y\u0148\3\2\2\2[\u014a\3\2\2\2]\u014c\3\2\2\2_"+
		"\u014e\3\2\2\2a\u0156\3\2\2\2c\u015d\3\2\2\2e\u0166\3\2\2\2g\u0168\3\2"+
		"\2\2i\u016a\3\2\2\2k\u0176\3\2\2\2m\u017c\3\2\2\2o\u017e\3\2\2\2q\u0180"+
		"\3\2\2\2s\u0182\3\2\2\2u\u0184\3\2\2\2w\u0186\3\2\2\2y\u0188\3\2\2\2{"+
		"\u018a\3\2\2\2}\u018c\3\2\2\2\177\u018e\3\2\2\2\u0081\u0190\3\2\2\2\u0083"+
		"\u0192\3\2\2\2\u0085\u0194\3\2\2\2\u0087\u0196\3\2\2\2\u0089\u0198\3\2"+
		"\2\2\u008b\u019a\3\2\2\2\u008d\u019c\3\2\2\2\u008f\u019e\3\2\2\2\u0091"+
		"\u01a0\3\2\2\2\u0093\u01a2\3\2\2\2\u0095\u01a4\3\2\2\2\u0097\u01a6\3\2"+
		"\2\2\u0099\u01a8\3\2\2\2\u009b\u01aa\3\2\2\2\u009d\u01ac\3\2\2\2\u009f"+
		"\u01ae\3\2\2\2\u00a1\u00a2\5m\67\2\u00a2\u00a3\5\u008fH\2\u00a3\u00a4"+
		"\5\u008fH\2\u00a4\u00a5\5m\67\2\u00a5\u00a6\5\u009dO\2\u00a6\4\3\2\2\2"+
		"\u00a7\u00a8\5\u0089E\2\u00a8\u00a9\5w<\2\u00a9\6\3\2\2\2\u00aa\u00ab"+
		"\7\60\2\2\u00ab\u00ac\7\60\2\2\u00ac\b\3\2\2\2\u00ad\u00ae\7]\2\2\u00ae"+
		"\n\3\2\2\2\u00af\u00b0\7_\2\2\u00b0\f\3\2\2\2\u00b1\u00b2\5m\67\2\u00b2"+
		"\u00b3\5\u0087D\2\u00b3\u00b4\5s:\2\u00b4\16\3\2\2\2\u00b5\u00b6\5o8\2"+
		"\u00b6\u00b7\5u;\2\u00b7\u00b8\5y=\2\u00b8\u00b9\5}?\2\u00b9\u00ba\5\u0087"+
		"D\2\u00ba\20\3\2\2\2\u00bb\u00bc\5o8\2\u00bc\u00bd\5\u0089E\2\u00bd\u00be"+
		"\5\u0089E\2\u00be\u00bf\5\u0083B\2\u00bf\u00c0\5u;\2\u00c0\u00c1\5m\67"+
		"\2\u00c1\u00c2\5\u0087D\2\u00c2\22\3\2\2\2\u00c3\u00c4\5}?\2\u00c4\u00c5"+
		"\5\u0087D\2\u00c5\u00c6\5\u0093J\2\u00c6\u00c7\5u;\2\u00c7\u00c8\5y=\2"+
		"\u00c8\u00c9\5u;\2\u00c9\u00ca\5\u008fH\2\u00ca\24\3\2\2\2\u00cb\u00cc"+
		"\5s:\2\u00cc\u00cd\5\u0089E\2\u00cd\26\3\2\2\2\u00ce\u00cf\5u;\2\u00cf"+
		"\u00d0\5\u0083B\2\u00d0\u00d1\5\u0091I\2\u00d1\u00d2\5u;\2\u00d2\30\3"+
		"\2\2\2\u00d3\u00d4\5u;\2\u00d4\u00d5\5\u0087D\2\u00d5\u00d6\5s:\2\u00d6"+
		"\32\3\2\2\2\u00d7\u00d8\5u;\2\u00d8\u00d9\5\u009bN\2\u00d9\u00da\5}?\2"+
		"\u00da\u00db\5\u0093J\2\u00db\34\3\2\2\2\u00dc\u00dd\5w<\2\u00dd\u00de"+
		"\5m\67\2\u00de\u00df\5\u0083B\2\u00df\u00e0\5\u0091I\2\u00e0\u00e1\5u"+
		";\2\u00e1\36\3\2\2\2\u00e2\u00e3\5w<\2\u00e3\u00e4\5\u0095K\2\u00e4\u00e5"+
		"\5\u0087D\2\u00e5\u00e6\5q9\2\u00e6\u00e7\5\u0093J\2\u00e7\u00e8\5}?\2"+
		"\u00e8\u00e9\5\u0089E\2\u00e9\u00ea\5\u0087D\2\u00ea \3\2\2\2\u00eb\u00ec"+
		"\5}?\2\u00ec\u00ed\5w<\2\u00ed\"\3\2\2\2\u00ee\u00ef\5}?\2\u00ef\u00f0"+
		"\5\u0087D\2\u00f0$\3\2\2\2\u00f1\u00f2\5\u0093J\2\u00f2\u00f3\5{>\2\u00f3"+
		"\u00f4\5u;\2\u00f4\u00f5\5\u0087D\2\u00f5&\3\2\2\2\u00f6\u00f7\5\u0087"+
		"D\2\u00f7\u00f8\5\u0089E\2\u00f8\u00f9\5\u0093J\2\u00f9(\3\2\2\2\u00fa"+
		"\u00fb\5\u0089E\2\u00fb\u00fc\5\u008fH\2\u00fc*\3\2\2\2\u00fd\u00fe\5"+
		"\u0089E\2\u00fe\u00ff\5\u0095K\2\u00ff\u0100\5\u0093J\2\u0100,\3\2\2\2"+
		"\u0101\u0102\5\u008bF\2\u0102\u0103\5\u008fH\2\u0103\u0104\5\u0089E\2"+
		"\u0104\u0105\5q9\2\u0105\u0106\5u;\2\u0106\u0107\5s:\2\u0107\u0108\5\u0095"+
		"K\2\u0108\u0109\5\u008fH\2\u0109\u010a\5u;\2\u010a.\3\2\2\2\u010b\u010c"+
		"\5\u008bF\2\u010c\u010d\5\u008fH\2\u010d\u010e\5\u0089E\2\u010e\u010f"+
		"\5y=\2\u010f\u0110\5\u008fH\2\u0110\u0111\5m\67\2\u0111\u0112\5\u0085"+
		"C\2\u0112\60\3\2\2\2\u0113\u0114\5\u0093J\2\u0114\u0115\5\u008fH\2\u0115"+
		"\u0116\5\u0095K\2\u0116\u0117\5u;\2\u0117\62\3\2\2\2\u0118\u0119\5\u0097"+
		"L\2\u0119\u011a\5m\67\2\u011a\u011b\5\u008fH\2\u011b\64\3\2\2\2\u011c"+
		"\u011d\5\u0099M\2\u011d\u011e\5{>\2\u011e\u011f\5}?\2\u011f\u0120\5\u0083"+
		"B\2\u0120\u0121\5u;\2\u0121\66\3\2\2\2\u0122\u0123\7<\2\2\u0123\u0124"+
		"\7?\2\2\u01248\3\2\2\2\u0125\u0126\7<\2\2\u0126:\3\2\2\2\u0127\u0128\7"+
		".\2\2\u0128<\3\2\2\2\u0129\u012a\7\60\2\2\u012a>\3\2\2\2\u012b\u012c\7"+
		"$\2\2\u012c@\3\2\2\2\u012d\u012e\7?\2\2\u012eB\3\2\2\2\u012f\u0130\7@"+
		"\2\2\u0130\u0131\7?\2\2\u0131D\3\2\2\2\u0132\u0133\7@\2\2\u0133F\3\2\2"+
		"\2\u0134\u0135\7>\2\2\u0135\u0136\7?\2\2\u0136H\3\2\2\2\u0137\u0138\7"+
		"}\2\2\u0138J\3\2\2\2\u0139\u013a\7*\2\2\u013aL\3\2\2\2\u013b\u013c\7>"+
		"\2\2\u013cN\3\2\2\2\u013d\u013e\7/\2\2\u013eP\3\2\2\2\u013f\u0140\7>\2"+
		"\2\u0140\u0141\7@\2\2\u0141R\3\2\2\2\u0142\u0143\7-\2\2\u0143T\3\2\2\2"+
		"\u0144\u0145\7\177\2\2\u0145V\3\2\2\2\u0146\u0147\7+\2\2\u0147X\3\2\2"+
		"\2\u0148\u0149\7=\2\2\u0149Z\3\2\2\2\u014a\u014b\7\61\2\2\u014b\\\3\2"+
		"\2\2\u014c\u014d\7,\2\2\u014d^\3\2\2\2\u014e\u0153\5e\63\2\u014f\u0152"+
		"\5e\63\2\u0150\u0152\5g\64\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152"+
		"\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154`\3\2\2\2"+
		"\u0155\u0153\3\2\2\2\u0156\u015a\5g\64\2\u0157\u0159\5g\64\2\u0158\u0157"+
		"\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"b\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u0161\5? \2\u015e\u0160\13\2\2\2\u015f"+
		"\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u0162\3\2\2\2\u0161\u015f\3\2"+
		"\2\2\u0162\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\5? \2\u0165d"+
		"\3\2\2\2\u0166\u0167\t\2\2\2\u0167f\3\2\2\2\u0168\u0169\t\3\2\2\u0169"+
		"h\3\2\2\2\u016a\u016e\5I%\2\u016b\u016d\13\2\2\2\u016c\u016b\3\2\2\2\u016d"+
		"\u0170\3\2\2\2\u016e\u016f\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0171\3\2"+
		"\2\2\u0170\u016e\3\2\2\2\u0171\u0172\5U+\2\u0172\u0173\3\2\2\2\u0173\u0174"+
		"\b\65\2\2\u0174j\3\2\2\2\u0175\u0177\t\4\2\2\u0176\u0175\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\3\2"+
		"\2\2\u017a\u017b\b\66\2\2\u017bl\3\2\2\2\u017c\u017d\t\5\2\2\u017dn\3"+
		"\2\2\2\u017e\u017f\t\6\2\2\u017fp\3\2\2\2\u0180\u0181\t\7\2\2\u0181r\3"+
		"\2\2\2\u0182\u0183\t\b\2\2\u0183t\3\2\2\2\u0184\u0185\t\t\2\2\u0185v\3"+
		"\2\2\2\u0186\u0187\t\n\2\2\u0187x\3\2\2\2\u0188\u0189\t\13\2\2\u0189z"+
		"\3\2\2\2\u018a\u018b\t\f\2\2\u018b|\3\2\2\2\u018c\u018d\t\r\2\2\u018d"+
		"~\3\2\2\2\u018e\u018f\t\16\2\2\u018f\u0080\3\2\2\2\u0190\u0191\t\17\2"+
		"\2\u0191\u0082\3\2\2\2\u0192\u0193\t\20\2\2\u0193\u0084\3\2\2\2\u0194"+
		"\u0195\t\21\2\2\u0195\u0086\3\2\2\2\u0196\u0197\t\22\2\2\u0197\u0088\3"+
		"\2\2\2\u0198\u0199\t\23\2\2\u0199\u008a\3\2\2\2\u019a\u019b\t\24\2\2\u019b"+
		"\u008c\3\2\2\2\u019c\u019d\t\25\2\2\u019d\u008e\3\2\2\2\u019e\u019f\t"+
		"\26\2\2\u019f\u0090\3\2\2\2\u01a0\u01a1\t\27\2\2\u01a1\u0092\3\2\2\2\u01a2"+
		"\u01a3\t\30\2\2\u01a3\u0094\3\2\2\2\u01a4\u01a5\t\31\2\2\u01a5\u0096\3"+
		"\2\2\2\u01a6\u01a7\t\32\2\2\u01a7\u0098\3\2\2\2\u01a8\u01a9\t\33\2\2\u01a9"+
		"\u009a\3\2\2\2\u01aa\u01ab\t\34\2\2\u01ab\u009c\3\2\2\2\u01ac\u01ad\t"+
		"\35\2\2\u01ad\u009e\3\2\2\2\u01ae\u01af\t\36\2\2\u01af\u00a0\3\2\2\2\t"+
		"\2\u0151\u0153\u015a\u0161\u016e\u0178\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}