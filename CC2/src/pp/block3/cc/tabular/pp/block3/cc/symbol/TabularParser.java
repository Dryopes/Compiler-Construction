// Generated from Tabular.g4 by ANTLR 4.5
package pp.block3.cc.symbol;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TabularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LCR=1, BEGINTABLE=2, ENDTABLE=3, ENDROW=4, SEPERATEROW=5, STRING=6, COMMENT=7;
	public static final int
		RULE_table = 0, RULE_begintable = 1, RULE_endtable = 2, RULE_content = 3, 
		RULE_row = 4, RULE_entry = 5;
	public static final String[] ruleNames = {
		"table", "begintable", "endtable", "content", "row", "entry"
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

	@Override
	public String getGrammarFileName() { return "Tabular.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TabularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TableContext extends ParserRuleContext {
		public BegintableContext begintable() {
			return getRuleContext(BegintableContext.class,0);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public EndtableContext endtable() {
			return getRuleContext(EndtableContext.class,0);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabularListener ) ((TabularListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabularListener ) ((TabularListener)listener).exitTable(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			begintable();
			setState(13);
			content();
			setState(14);
			endtable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BegintableContext extends ParserRuleContext {
		public TerminalNode BEGINTABLE() { return getToken(TabularParser.BEGINTABLE, 0); }
		public TerminalNode LCR() { return getToken(TabularParser.LCR, 0); }
		public BegintableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begintable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabularListener ) ((TabularListener)listener).enterBegintable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabularListener ) ((TabularListener)listener).exitBegintable(this);
		}
	}

	public final BegintableContext begintable() throws RecognitionException {
		BegintableContext _localctx = new BegintableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_begintable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(BEGINTABLE);
			setState(17);
			match(LCR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndtableContext extends ParserRuleContext {
		public TerminalNode ENDTABLE() { return getToken(TabularParser.ENDTABLE, 0); }
		public EndtableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endtable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabularListener ) ((TabularListener)listener).enterEndtable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabularListener ) ((TabularListener)listener).exitEndtable(this);
		}
	}

	public final EndtableContext endtable() throws RecognitionException {
		EndtableContext _localctx = new EndtableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_endtable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(ENDTABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContentContext extends ParserRuleContext {
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabularListener ) ((TabularListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabularListener ) ((TabularListener)listener).exitContent(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(21);
				row();
				}
				}
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowContext extends ParserRuleContext {
		public List<EntryContext> entry() {
			return getRuleContexts(EntryContext.class);
		}
		public EntryContext entry(int i) {
			return getRuleContext(EntryContext.class,i);
		}
		public TerminalNode ENDROW() { return getToken(TabularParser.ENDROW, 0); }
		public List<TerminalNode> SEPERATEROW() { return getTokens(TabularParser.SEPERATEROW); }
		public TerminalNode SEPERATEROW(int i) {
			return getToken(TabularParser.SEPERATEROW, i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabularListener ) ((TabularListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabularListener ) ((TabularListener)listener).exitRow(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_row);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(26);
					entry();
					setState(27);
					match(SEPERATEROW);
					}
					} 
				}
				setState(33);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(34);
			entry();
			setState(35);
			match(ENDROW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntryContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TabularParser.STRING, 0); }
		public EntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabularListener ) ((TabularListener)listener).enterEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabularListener ) ((TabularListener)listener).exitEntry(this);
		}
	}

	public final EntryContext entry() throws RecognitionException {
		EntryContext _localctx = new EntryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\t*\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4"+
		"\3\5\6\5\31\n\5\r\5\16\5\32\3\6\3\6\3\6\7\6 \n\6\f\6\16\6#\13\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2%\2\16\3\2\2\2\4\22\3\2\2\2\6"+
		"\25\3\2\2\2\b\30\3\2\2\2\n!\3\2\2\2\f\'\3\2\2\2\16\17\5\4\3\2\17\20\5"+
		"\b\5\2\20\21\5\6\4\2\21\3\3\2\2\2\22\23\7\4\2\2\23\24\7\3\2\2\24\5\3\2"+
		"\2\2\25\26\7\5\2\2\26\7\3\2\2\2\27\31\5\n\6\2\30\27\3\2\2\2\31\32\3\2"+
		"\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\t\3\2\2\2\34\35\5\f\7\2\35\36\7\7"+
		"\2\2\36 \3\2\2\2\37\34\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2"+
		"\2\2#!\3\2\2\2$%\5\f\7\2%&\7\6\2\2&\13\3\2\2\2\'(\7\b\2\2(\r\3\2\2\2\4"+
		"\32!";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}