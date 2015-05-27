// Generated from ProcPascal.g4 by ANTLR 4.5
package pp.block5.cc.pascal;
package pp.block5.cc.pascal;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProcPascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, BEGIN=2, BOOLEAN=3, INTEGER=4, DO=5, ELSE=6, END=7, EXIT=8, FALSE=9, 
		FUNC=10, IF=11, IN=12, THEN=13, NOT=14, OR=15, OUT=16, PROC=17, PROGRAM=18, 
		TRUE=19, VAR=20, WHILE=21, ASS=22, COLON=23, COMMA=24, DOT=25, DQUOTE=26, 
		EQ=27, GE=28, GT=29, LE=30, LBRACE=31, LPAR=32, LT=33, MINUS=34, NE=35, 
		PLUS=36, RBRACE=37, RPAR=38, SEMI=39, SLASH=40, STAR=41, ID=42, NUM=43, 
		STR=44, COMMENT=45, WS=46;
	public static final int
		RULE_decl = 0, RULE_pars = 1, RULE_stat = 2, RULE_args = 3, RULE_expr = 4, 
		RULE_program = 5, RULE_body = 6, RULE_var = 7, RULE_block = 8, RULE_target = 9, 
		RULE_prfOp = 10, RULE_multOp = 11, RULE_plusOp = 12, RULE_boolOp = 13, 
		RULE_compOp = 14, RULE_type = 15;
	public static final String[] ruleNames = {
		"decl", "pars", "stat", "args", "expr", "program", "body", "var", "block", 
		"target", "prfOp", "multOp", "plusOp", "boolOp", "compOp", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "':='", "':'", 
		"','", "'.'", "'\"'", "'='", "'>='", "'>'", "'<='", "'{'", "'('", "'<'", 
		"'-'", "'<>'", "'+'", "'}'", "')'", "';'", "'/'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "BEGIN", "BOOLEAN", "INTEGER", "DO", "ELSE", "END", "EXIT", 
		"FALSE", "FUNC", "IF", "IN", "THEN", "NOT", "OR", "OUT", "PROC", "PROGRAM", 
		"TRUE", "VAR", "WHILE", "ASS", "COLON", "COMMA", "DOT", "DQUOTE", "EQ", 
		"GE", "GT", "LE", "LBRACE", "LPAR", "LT", "MINUS", "NE", "PLUS", "RBRACE", 
		"RPAR", "SEMI", "SLASH", "STAR", "ID", "NUM", "STR", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "ProcPascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProcPascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DeclContext extends ParserRuleContext {
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	 
		public DeclContext() { }
		public void copyFrom(DeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncDeclContext extends DeclContext {
		public TerminalNode FUNC() { return getToken(ProcPascalParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(ProcPascalParser.ID, 0); }
		public TerminalNode COLON() { return getToken(ProcPascalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(ProcPascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ProcPascalParser.SEMI, i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ParsContext pars() {
			return getRuleContext(ParsContext.class,0);
		}
		public FuncDeclContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterFuncDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitFuncDecl(this);
		}
	}
	public static class ProcDeclContext extends DeclContext {
		public TerminalNode PROC() { return getToken(ProcPascalParser.PROC, 0); }
		public TerminalNode ID() { return getToken(ProcPascalParser.ID, 0); }
		public List<TerminalNode> SEMI() { return getTokens(ProcPascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ProcPascalParser.SEMI, i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ParsContext pars() {
			return getRuleContext(ParsContext.class,0);
		}
		public ProcDeclContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterProcDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitProcDecl(this);
		}
	}
	public static class VarDeclContext extends DeclContext {
		public TerminalNode VAR() { return getToken(ProcPascalParser.VAR, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ProcPascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ProcPascalParser.SEMI, i);
		}
		public VarDeclContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitVarDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_decl);
		int _la;
		try {
			setState(60);
			switch (_input.LA(1)) {
			case FUNC:
				_localctx = new FuncDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(FUNC);
				setState(33);
				match(ID);
				setState(35);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(34);
					pars();
					}
				}

				setState(37);
				match(COLON);
				setState(38);
				type();
				setState(39);
				match(SEMI);
				setState(40);
				body();
				setState(41);
				match(SEMI);
				}
				break;
			case PROC:
				_localctx = new ProcDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(PROC);
				setState(44);
				match(ID);
				setState(46);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(45);
					pars();
					}
				}

				setState(48);
				match(SEMI);
				setState(49);
				body();
				setState(50);
				match(SEMI);
				}
				break;
			case VAR:
				_localctx = new VarDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				match(VAR);
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(53);
					var();
					setState(54);
					match(SEMI);
					}
					}
					setState(58); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ParsContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(ProcPascalParser.LPAR, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(ProcPascalParser.RPAR, 0); }
		public List<TerminalNode> VAR() { return getTokens(ProcPascalParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ProcPascalParser.VAR, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ProcPascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ProcPascalParser.SEMI, i);
		}
		public ParsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterPars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitPars(this);
		}
	}

	public final ParsContext pars() throws RecognitionException {
		ParsContext _localctx = new ParsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(LPAR);
			setState(64);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(63);
				match(VAR);
				}
			}

			setState(66);
			var();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(67);
				match(SEMI);
				setState(69);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(68);
					match(VAR);
					}
				}

				setState(71);
				var();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(RPAR);
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssStatContext extends StatContext {
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public TerminalNode ASS() { return getToken(ProcPascalParser.ASS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterAssStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitAssStat(this);
		}
	}
	public static class IfStatContext extends StatContext {
		public TerminalNode IF() { return getToken(ProcPascalParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ProcPascalParser.THEN, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ProcPascalParser.ELSE, 0); }
		public IfStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitIfStat(this);
		}
	}
	public static class BlockStatContext extends StatContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterBlockStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitBlockStat(this);
		}
	}
	public static class OutStatContext extends StatContext {
		public TerminalNode OUT() { return getToken(ProcPascalParser.OUT, 0); }
		public TerminalNode LPAR() { return getToken(ProcPascalParser.LPAR, 0); }
		public TerminalNode STR() { return getToken(ProcPascalParser.STR, 0); }
		public TerminalNode COMMA() { return getToken(ProcPascalParser.COMMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ProcPascalParser.RPAR, 0); }
		public OutStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterOutStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitOutStat(this);
		}
	}
	public static class CallStatContext extends StatContext {
		public TerminalNode ID() { return getToken(ProcPascalParser.ID, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public CallStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterCallStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitCallStat(this);
		}
	}
	public static class InStatContext extends StatContext {
		public TerminalNode IN() { return getToken(ProcPascalParser.IN, 0); }
		public TerminalNode LPAR() { return getToken(ProcPascalParser.LPAR, 0); }
		public TerminalNode STR() { return getToken(ProcPascalParser.STR, 0); }
		public TerminalNode COMMA() { return getToken(ProcPascalParser.COMMA, 0); }
		public TerminalNode ID() { return getToken(ProcPascalParser.ID, 0); }
		public TerminalNode RPAR() { return getToken(ProcPascalParser.RPAR, 0); }
		public InStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterInStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitInStat(this);
		}
	}
	public static class ExitStatContext extends StatContext {
		public TerminalNode EXIT() { return getToken(ProcPascalParser.EXIT, 0); }
		public ExitStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterExitStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitExitStat(this);
		}
	}
	public static class WhileStatContext extends StatContext {
		public TerminalNode WHILE() { return getToken(ProcPascalParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(ProcPascalParser.DO, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public WhileStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterWhileStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitWhileStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		int _la;
		try {
			setState(115);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new AssStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				target();
				setState(80);
				match(ASS);
				setState(81);
				expr(0);
				}
				break;
			case 2:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(IF);
				setState(84);
				expr(0);
				setState(85);
				match(THEN);
				setState(86);
				stat();
				setState(89);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(87);
					match(ELSE);
					setState(88);
					stat();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new WhileStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				match(WHILE);
				setState(92);
				expr(0);
				setState(93);
				match(DO);
				setState(94);
				stat();
				}
				break;
			case 4:
				_localctx = new BlockStatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				block();
				}
				break;
			case 5:
				_localctx = new InStatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				match(IN);
				setState(98);
				match(LPAR);
				setState(99);
				match(STR);
				setState(100);
				match(COMMA);
				setState(101);
				match(ID);
				setState(102);
				match(RPAR);
				}
				break;
			case 6:
				_localctx = new OutStatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(103);
				match(OUT);
				setState(104);
				match(LPAR);
				setState(105);
				match(STR);
				setState(106);
				match(COMMA);
				setState(107);
				expr(0);
				setState(108);
				match(RPAR);
				}
				break;
			case 7:
				_localctx = new CallStatContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(110);
				match(ID);
				setState(112);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(111);
					args();
					}
				}

				}
				break;
			case 8:
				_localctx = new ExitStatContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(114);
				match(EXIT);
				}
				break;
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

	public static class ArgsContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(ProcPascalParser.LPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(ProcPascalParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ProcPascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProcPascalParser.COMMA, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(LPAR);
			setState(118);
			expr(0);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(119);
				match(COMMA);
				setState(120);
				expr(0);
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(RPAR);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParExprContext extends ExprContext {
		public TerminalNode LPAR() { return getToken(ProcPascalParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ProcPascalParser.RPAR, 0); }
		public ParExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitParExpr(this);
		}
	}
	public static class TrueExprContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(ProcPascalParser.TRUE, 0); }
		public TrueExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterTrueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitTrueExpr(this);
		}
	}
	public static class CompExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CompOpContext compOp() {
			return getRuleContext(CompOpContext.class,0);
		}
		public CompExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitCompExpr(this);
		}
	}
	public static class PrfExprContext extends ExprContext {
		public PrfOpContext prfOp() {
			return getRuleContext(PrfOpContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrfExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterPrfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitPrfExpr(this);
		}
	}
	public static class CallExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(ProcPascalParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(ProcPascalParser.LPAR, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ProcPascalParser.RPAR, 0); }
		public CallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitCallExpr(this);
		}
	}
	public static class FalseExprContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(ProcPascalParser.FALSE, 0); }
		public FalseExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterFalseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitFalseExpr(this);
		}
	}
	public static class BoolExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BoolOpContext boolOp() {
			return getRuleContext(BoolOpContext.class,0);
		}
		public BoolExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitBoolExpr(this);
		}
	}
	public static class NumExprContext extends ExprContext {
		public TerminalNode NUM() { return getToken(ProcPascalParser.NUM, 0); }
		public NumExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterNumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitNumExpr(this);
		}
	}
	public static class PlusExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PlusOpContext plusOp() {
			return getRuleContext(PlusOpContext.class,0);
		}
		public PlusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterPlusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitPlusExpr(this);
		}
	}
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(ProcPascalParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitIdExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new PrfExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(129);
				prfOp();
				setState(130);
				expr(10);
				}
				break;
			case 2:
				{
				_localctx = new ParExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				match(LPAR);
				setState(133);
				expr(0);
				setState(134);
				match(RPAR);
				}
				break;
			case 3:
				{
				_localctx = new CallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				match(ID);
				setState(137);
				match(LPAR);
				setState(138);
				args();
				setState(139);
				match(RPAR);
				}
				break;
			case 4:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new NumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				match(NUM);
				}
				break;
			case 6:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				match(TRUE);
				}
				break;
			case 7:
				{
				_localctx = new FalseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(159);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new PlusExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(147);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(148);
						plusOp();
						setState(149);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new BoolExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(151);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(152);
						boolOp();
						setState(153);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new CompExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(155);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(156);
						compOp();
						setState(157);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(ProcPascalParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(ProcPascalParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(ProcPascalParser.SEMI, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ProcPascalParser.DOT, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(PROGRAM);
			setState(165);
			match(ID);
			setState(166);
			match(SEMI);
			setState(167);
			body();
			setState(168);
			match(DOT);
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

	public static class BodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << PROC) | (1L << VAR))) != 0)) {
				{
				{
				setState(170);
				decl();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			block();
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

	public static class VarContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ProcPascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ProcPascalParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(ProcPascalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProcPascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProcPascalParser.COMMA, i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(ID);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(179);
				match(COMMA);
				setState(180);
				match(ID);
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			match(COLON);
			setState(187);
			type();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(ProcPascalParser.BEGIN, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode END() { return getToken(ProcPascalParser.END, 0); }
		public List<TerminalNode> SEMI() { return getTokens(ProcPascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ProcPascalParser.SEMI, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(BEGIN);
			setState(190);
			stat();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(191);
				match(SEMI);
				setState(192);
				stat();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			match(END);
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

	public static class TargetContext extends ParserRuleContext {
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
	 
		public TargetContext() { }
		public void copyFrom(TargetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdTargetContext extends TargetContext {
		public TerminalNode ID() { return getToken(ProcPascalParser.ID, 0); }
		public IdTargetContext(TargetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterIdTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitIdTarget(this);
		}
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_target);
		try {
			_localctx = new IdTargetContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(ID);
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

	public static class PrfOpContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(ProcPascalParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(ProcPascalParser.NOT, 0); }
		public PrfOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prfOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterPrfOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitPrfOp(this);
		}
	}

	public final PrfOpContext prfOp() throws RecognitionException {
		PrfOpContext _localctx = new PrfOpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_prfOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_la = _input.LA(1);
			if ( !(_la==NOT || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static class MultOpContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(ProcPascalParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(ProcPascalParser.SLASH, 0); }
		public MultOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterMultOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitMultOp(this);
		}
	}

	public final MultOpContext multOp() throws RecognitionException {
		MultOpContext _localctx = new MultOpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_multOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_la = _input.LA(1);
			if ( !(_la==SLASH || _la==STAR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static class PlusOpContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(ProcPascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ProcPascalParser.MINUS, 0); }
		public PlusOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterPlusOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitPlusOp(this);
		}
	}

	public final PlusOpContext plusOp() throws RecognitionException {
		PlusOpContext _localctx = new PlusOpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_plusOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_la = _input.LA(1);
			if ( !(_la==MINUS || _la==PLUS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static class BoolOpContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(ProcPascalParser.AND, 0); }
		public TerminalNode OR() { return getToken(ProcPascalParser.OR, 0); }
		public BoolOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterBoolOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitBoolOp(this);
		}
	}

	public final BoolOpContext boolOp() throws RecognitionException {
		BoolOpContext _localctx = new BoolOpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_boolOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static class CompOpContext extends ParserRuleContext {
		public TerminalNode LE() { return getToken(ProcPascalParser.LE, 0); }
		public TerminalNode LT() { return getToken(ProcPascalParser.LT, 0); }
		public TerminalNode GE() { return getToken(ProcPascalParser.GE, 0); }
		public TerminalNode GT() { return getToken(ProcPascalParser.GT, 0); }
		public TerminalNode EQ() { return getToken(ProcPascalParser.EQ, 0); }
		public TerminalNode NE() { return getToken(ProcPascalParser.NE, 0); }
		public CompOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterCompOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitCompOp(this);
		}
	}

	public final CompOpContext compOp() throws RecognitionException {
		CompOpContext _localctx = new CompOpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << GE) | (1L << GT) | (1L << LE) | (1L << LT) | (1L << NE))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntTypeContext extends TypeContext {
		public TerminalNode INTEGER() { return getToken(ProcPascalParser.INTEGER, 0); }
		public IntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitIntType(this);
		}
	}
	public static class BoolTypeContext extends TypeContext {
		public TerminalNode BOOLEAN() { return getToken(ProcPascalParser.BOOLEAN, 0); }
		public BoolTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).enterBoolType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProcPascalListener ) ((ProcPascalListener)listener).exitBoolType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type);
		try {
			setState(214);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(INTEGER);
				}
				break;
			case BOOLEAN:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u00db\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\5\2&\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\61\n\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\6\2;\n\2\r\2\16\2<\5\2?\n\2\3\3\3\3\5\3C\n\3\3"+
		"\3\3\3\3\3\5\3H\n\3\3\3\7\3K\n\3\f\3\16\3N\13\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\\\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4s\n\4\3\4\5\4v\n"+
		"\4\3\5\3\5\3\5\3\5\7\5|\n\5\f\5\16\5\177\13\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0094\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00a2\n\6\f\6\16\6\u00a5"+
		"\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\7\b\u00ae\n\b\f\b\16\b\u00b1\13\b\3"+
		"\b\3\b\3\t\3\t\3\t\7\t\u00b8\n\t\f\t\16\t\u00bb\13\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\7\n\u00c4\n\n\f\n\16\n\u00c7\13\n\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\5\21\u00d9\n\21\3\21"+
		"\2\3\n\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\7\4\2\20\20$$\3\2"+
		"*+\4\2$$&&\4\2\3\3\21\21\5\2\35 ##%%\u00e9\2>\3\2\2\2\4@\3\2\2\2\6u\3"+
		"\2\2\2\bw\3\2\2\2\n\u0093\3\2\2\2\f\u00a6\3\2\2\2\16\u00af\3\2\2\2\20"+
		"\u00b4\3\2\2\2\22\u00bf\3\2\2\2\24\u00ca\3\2\2\2\26\u00cc\3\2\2\2\30\u00ce"+
		"\3\2\2\2\32\u00d0\3\2\2\2\34\u00d2\3\2\2\2\36\u00d4\3\2\2\2 \u00d8\3\2"+
		"\2\2\"#\7\f\2\2#%\7,\2\2$&\5\4\3\2%$\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'(\7"+
		"\31\2\2()\5 \21\2)*\7)\2\2*+\5\16\b\2+,\7)\2\2,?\3\2\2\2-.\7\23\2\2.\60"+
		"\7,\2\2/\61\5\4\3\2\60/\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\7)\2"+
		"\2\63\64\5\16\b\2\64\65\7)\2\2\65?\3\2\2\2\66:\7\26\2\2\678\5\20\t\28"+
		"9\7)\2\29;\3\2\2\2:\67\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2"+
		">\"\3\2\2\2>-\3\2\2\2>\66\3\2\2\2?\3\3\2\2\2@B\7\"\2\2AC\7\26\2\2BA\3"+
		"\2\2\2BC\3\2\2\2CD\3\2\2\2DL\5\20\t\2EG\7)\2\2FH\7\26\2\2GF\3\2\2\2GH"+
		"\3\2\2\2HI\3\2\2\2IK\5\20\t\2JE\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2"+
		"MO\3\2\2\2NL\3\2\2\2OP\7(\2\2P\5\3\2\2\2QR\5\24\13\2RS\7\30\2\2ST\5\n"+
		"\6\2Tv\3\2\2\2UV\7\r\2\2VW\5\n\6\2WX\7\17\2\2X[\5\6\4\2YZ\7\b\2\2Z\\\5"+
		"\6\4\2[Y\3\2\2\2[\\\3\2\2\2\\v\3\2\2\2]^\7\27\2\2^_\5\n\6\2_`\7\7\2\2"+
		"`a\5\6\4\2av\3\2\2\2bv\5\22\n\2cd\7\16\2\2de\7\"\2\2ef\7.\2\2fg\7\32\2"+
		"\2gh\7,\2\2hv\7(\2\2ij\7\22\2\2jk\7\"\2\2kl\7.\2\2lm\7\32\2\2mn\5\n\6"+
		"\2no\7(\2\2ov\3\2\2\2pr\7,\2\2qs\5\b\5\2rq\3\2\2\2rs\3\2\2\2sv\3\2\2\2"+
		"tv\7\n\2\2uQ\3\2\2\2uU\3\2\2\2u]\3\2\2\2ub\3\2\2\2uc\3\2\2\2ui\3\2\2\2"+
		"up\3\2\2\2ut\3\2\2\2v\7\3\2\2\2wx\7\"\2\2x}\5\n\6\2yz\7\32\2\2z|\5\n\6"+
		"\2{y\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2"+
		"\2\2\u0080\u0081\7(\2\2\u0081\t\3\2\2\2\u0082\u0083\b\6\1\2\u0083\u0084"+
		"\5\26\f\2\u0084\u0085\5\n\6\f\u0085\u0094\3\2\2\2\u0086\u0087\7\"\2\2"+
		"\u0087\u0088\5\n\6\2\u0088\u0089\7(\2\2\u0089\u0094\3\2\2\2\u008a\u008b"+
		"\7,\2\2\u008b\u008c\7\"\2\2\u008c\u008d\5\b\5\2\u008d\u008e\7(\2\2\u008e"+
		"\u0094\3\2\2\2\u008f\u0094\7,\2\2\u0090\u0094\7-\2\2\u0091\u0094\7\25"+
		"\2\2\u0092\u0094\7\13\2\2\u0093\u0082\3\2\2\2\u0093\u0086\3\2\2\2\u0093"+
		"\u008a\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0092\3\2\2\2\u0094\u00a3\3\2\2\2\u0095\u0096\f\13\2\2\u0096"+
		"\u0097\5\32\16\2\u0097\u0098\5\n\6\f\u0098\u00a2\3\2\2\2\u0099\u009a\f"+
		"\n\2\2\u009a\u009b\5\34\17\2\u009b\u009c\5\n\6\13\u009c\u00a2\3\2\2\2"+
		"\u009d\u009e\f\t\2\2\u009e\u009f\5\36\20\2\u009f\u00a0\5\n\6\n\u00a0\u00a2"+
		"\3\2\2\2\u00a1\u0095\3\2\2\2\u00a1\u0099\3\2\2\2\u00a1\u009d\3\2\2\2\u00a2"+
		"\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\13\3\2\2"+
		"\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7\24\2\2\u00a7\u00a8\7,\2\2\u00a8\u00a9"+
		"\7)\2\2\u00a9\u00aa\5\16\b\2\u00aa\u00ab\7\33\2\2\u00ab\r\3\2\2\2\u00ac"+
		"\u00ae\5\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2"+
		"\u00b3\5\22\n\2\u00b3\17\3\2\2\2\u00b4\u00b9\7,\2\2\u00b5\u00b6\7\32\2"+
		"\2\u00b6\u00b8\7,\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00bd\7\31\2\2\u00bd\u00be\5 \21\2\u00be\21\3\2\2\2\u00bf\u00c0\7\4\2"+
		"\2\u00c0\u00c5\5\6\4\2\u00c1\u00c2\7)\2\2\u00c2\u00c4\5\6\4\2\u00c3\u00c1"+
		"\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7\t\2\2\u00c9\23\3\2\2"+
		"\2\u00ca\u00cb\7,\2\2\u00cb\25\3\2\2\2\u00cc\u00cd\t\2\2\2\u00cd\27\3"+
		"\2\2\2\u00ce\u00cf\t\3\2\2\u00cf\31\3\2\2\2\u00d0\u00d1\t\4\2\2\u00d1"+
		"\33\3\2\2\2\u00d2\u00d3\t\5\2\2\u00d3\35\3\2\2\2\u00d4\u00d5\t\6\2\2\u00d5"+
		"\37\3\2\2\2\u00d6\u00d9\7\6\2\2\u00d7\u00d9\7\5\2\2\u00d8\u00d6\3\2\2"+
		"\2\u00d8\u00d7\3\2\2\2\u00d9!\3\2\2\2\24%\60<>BGL[ru}\u0093\u00a1\u00a3"+
		"\u00af\u00b9\u00c5\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}