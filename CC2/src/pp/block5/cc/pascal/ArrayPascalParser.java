// Generated from ArrayPascal.g4 by ANTLR 4.5
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
public class ArrayPascalParser extends Parser {
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
	public static final int
		RULE_target = 0, RULE_expr = 1, RULE_type = 2, RULE_bound = 3, RULE_program = 4, 
		RULE_body = 5, RULE_decl = 6, RULE_var = 7, RULE_block = 8, RULE_stat = 9, 
		RULE_prfOp = 10, RULE_multOp = 11, RULE_plusOp = 12, RULE_boolOp = 13, 
		RULE_compOp = 14;
	public static final String[] ruleNames = {
		"target", "expr", "type", "bound", "program", "body", "decl", "var", "block", 
		"stat", "prfOp", "multOp", "plusOp", "boolOp", "compOp"
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

	@Override
	public String getGrammarFileName() { return "ArrayPascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArrayPascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
		public TerminalNode ID() { return getToken(ArrayPascalParser.ID, 0); }
		public IdTargetContext(TargetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterIdTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitIdTarget(this);
		}
	}
	public static class ArrayTargetContext extends TargetContext {
		public TerminalNode ID() { return getToken(ArrayPascalParser.ID, 0); }
		public TerminalNode LSQ() { return getToken(ArrayPascalParser.LSQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RSQ() { return getToken(ArrayPascalParser.RSQ, 0); }
		public ArrayTargetContext(TargetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterArrayTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitArrayTarget(this);
		}
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_target);
		try {
			setState(36);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new IdTargetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ArrayTargetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(ID);
				setState(32);
				match(LSQ);
				setState(33);
				expr(0);
				setState(34);
				match(RSQ);
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
	public static class IndexExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(ArrayPascalParser.ID, 0); }
		public TerminalNode LSQ() { return getToken(ArrayPascalParser.LSQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RSQ() { return getToken(ArrayPascalParser.RSQ, 0); }
		public IndexExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterIndexExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitIndexExpr(this);
		}
	}
	public static class ParExprContext extends ExprContext {
		public TerminalNode LPAR() { return getToken(ArrayPascalParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ArrayPascalParser.RPAR, 0); }
		public ParExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitParExpr(this);
		}
	}
	public static class ArrayExprContext extends ExprContext {
		public List<TerminalNode> RSQ() { return getTokens(ArrayPascalParser.RSQ); }
		public TerminalNode RSQ(int i) {
			return getToken(ArrayPascalParser.RSQ, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ArrayPascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArrayPascalParser.COMMA, i);
		}
		public ArrayExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitArrayExpr(this);
		}
	}
	public static class TrueExprContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(ArrayPascalParser.TRUE, 0); }
		public TrueExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterTrueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitTrueExpr(this);
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
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitCompExpr(this);
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
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterPrfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitPrfExpr(this);
		}
	}
	public static class FalseExprContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(ArrayPascalParser.FALSE, 0); }
		public FalseExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterFalseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitFalseExpr(this);
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
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitBoolExpr(this);
		}
	}
	public static class NumExprContext extends ExprContext {
		public TerminalNode NUM() { return getToken(ArrayPascalParser.NUM, 0); }
		public NumExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterNumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitNumExpr(this);
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
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterPlusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitPlusExpr(this);
		}
	}
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(ArrayPascalParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitIdExpr(this);
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new PrfExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(39);
				prfOp();
				setState(40);
				expr(11);
				}
				break;
			case 2:
				{
				_localctx = new ParExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				match(LPAR);
				setState(43);
				expr(0);
				setState(44);
				match(RPAR);
				}
				break;
			case 3:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new NumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47);
				match(NUM);
				}
				break;
			case 5:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48);
				match(TRUE);
				}
				break;
			case 6:
				{
				_localctx = new FalseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				match(FALSE);
				}
				break;
			case 7:
				{
				_localctx = new IndexExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				match(ID);
				setState(51);
				match(LSQ);
				setState(52);
				expr(0);
				setState(53);
				match(RSQ);
				}
				break;
			case 8:
				{
				_localctx = new ArrayExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(RSQ);
				setState(64);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(56);
					expr(0);
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(57);
						match(COMMA);
						setState(58);
						expr(0);
						}
						}
						setState(63);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(66);
				match(RSQ);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(81);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new PlusExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(69);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(70);
						plusOp();
						setState(71);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new BoolExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(73);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(74);
						boolOp();
						setState(75);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new CompExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(77);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(78);
						compOp();
						setState(79);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
	public static class ArrayTypeContext extends TypeContext {
		public TerminalNode ARRAY() { return getToken(ArrayPascalParser.ARRAY, 0); }
		public TerminalNode LSQ() { return getToken(ArrayPascalParser.LSQ, 0); }
		public List<BoundContext> bound() {
			return getRuleContexts(BoundContext.class);
		}
		public BoundContext bound(int i) {
			return getRuleContext(BoundContext.class,i);
		}
		public TerminalNode DOTDOT() { return getToken(ArrayPascalParser.DOTDOT, 0); }
		public TerminalNode NUM() { return getToken(ArrayPascalParser.NUM, 0); }
		public TerminalNode RSQ() { return getToken(ArrayPascalParser.RSQ, 0); }
		public TerminalNode OF() { return getToken(ArrayPascalParser.OF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitArrayType(this);
		}
	}
	public static class IntTypeContext extends TypeContext {
		public TerminalNode INTEGER() { return getToken(ArrayPascalParser.INTEGER, 0); }
		public IntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitIntType(this);
		}
	}
	public static class BoolTypeContext extends TypeContext {
		public TerminalNode BOOLEAN() { return getToken(ArrayPascalParser.BOOLEAN, 0); }
		public BoolTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterBoolType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitBoolType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			setState(98);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(INTEGER);
				}
				break;
			case BOOLEAN:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(BOOLEAN);
				}
				break;
			case ARRAY:
				_localctx = new ArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(ARRAY);
				setState(89);
				match(LSQ);
				setState(90);
				bound();
				setState(91);
				match(DOTDOT);
				setState(92);
				bound();
				setState(93);
				match(NUM);
				setState(94);
				match(RSQ);
				setState(95);
				match(OF);
				setState(96);
				type();
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

	public static class BoundContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(ArrayPascalParser.NUM, 0); }
		public TerminalNode MINUS() { return getToken(ArrayPascalParser.MINUS, 0); }
		public BoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitBound(this);
		}
	}

	public final BoundContext bound() throws RecognitionException {
		BoundContext _localctx = new BoundContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(100);
				match(MINUS);
				}
			}

			setState(103);
			match(NUM);
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

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(ArrayPascalParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(ArrayPascalParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(ArrayPascalParser.SEMI, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ArrayPascalParser.DOT, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(PROGRAM);
			setState(106);
			match(ID);
			setState(107);
			match(SEMI);
			setState(108);
			body();
			setState(109);
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
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(111);
				decl();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
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
	public static class VarDeclContext extends DeclContext {
		public TerminalNode VAR() { return getToken(ArrayPascalParser.VAR, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ArrayPascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ArrayPascalParser.SEMI, i);
		}
		public VarDeclContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitVarDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decl);
		int _la;
		try {
			_localctx = new VarDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(VAR);
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120);
				var();
				setState(121);
				match(SEMI);
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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
		public List<TerminalNode> ID() { return getTokens(ArrayPascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ArrayPascalParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(ArrayPascalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ArrayPascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArrayPascalParser.COMMA, i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(ID);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(128);
				match(COMMA);
				setState(129);
				match(ID);
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			match(COLON);
			setState(136);
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
		public TerminalNode BEGIN() { return getToken(ArrayPascalParser.BEGIN, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode END() { return getToken(ArrayPascalParser.END, 0); }
		public List<TerminalNode> SEMI() { return getTokens(ArrayPascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ArrayPascalParser.SEMI, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(BEGIN);
			setState(139);
			stat();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(140);
				match(SEMI);
				setState(141);
				stat();
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
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
		public TerminalNode ASS() { return getToken(ArrayPascalParser.ASS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterAssStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitAssStat(this);
		}
	}
	public static class IfStatContext extends StatContext {
		public TerminalNode IF() { return getToken(ArrayPascalParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ArrayPascalParser.THEN, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ArrayPascalParser.ELSE, 0); }
		public IfStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitIfStat(this);
		}
	}
	public static class BlockStatContext extends StatContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterBlockStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitBlockStat(this);
		}
	}
	public static class OutStatContext extends StatContext {
		public TerminalNode OUT() { return getToken(ArrayPascalParser.OUT, 0); }
		public TerminalNode LPAR() { return getToken(ArrayPascalParser.LPAR, 0); }
		public TerminalNode STR() { return getToken(ArrayPascalParser.STR, 0); }
		public TerminalNode COMMA() { return getToken(ArrayPascalParser.COMMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ArrayPascalParser.RPAR, 0); }
		public OutStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterOutStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitOutStat(this);
		}
	}
	public static class InStatContext extends StatContext {
		public TerminalNode IN() { return getToken(ArrayPascalParser.IN, 0); }
		public TerminalNode LPAR() { return getToken(ArrayPascalParser.LPAR, 0); }
		public TerminalNode STR() { return getToken(ArrayPascalParser.STR, 0); }
		public TerminalNode COMMA() { return getToken(ArrayPascalParser.COMMA, 0); }
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ArrayPascalParser.RPAR, 0); }
		public InStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterInStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitInStat(this);
		}
	}
	public static class WhileStatContext extends StatContext {
		public TerminalNode WHILE() { return getToken(ArrayPascalParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(ArrayPascalParser.DO, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public WhileStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterWhileStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitWhileStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stat);
		try {
			setState(181);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new AssStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				target();
				setState(150);
				match(ASS);
				setState(151);
				expr(0);
				}
				break;
			case IF:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(IF);
				setState(154);
				expr(0);
				setState(155);
				match(THEN);
				setState(156);
				stat();
				setState(159);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(157);
					match(ELSE);
					setState(158);
					stat();
					}
					break;
				}
				}
				break;
			case WHILE:
				_localctx = new WhileStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(WHILE);
				setState(162);
				expr(0);
				setState(163);
				match(DO);
				setState(164);
				stat();
				}
				break;
			case BEGIN:
				_localctx = new BlockStatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				block();
				}
				break;
			case IN:
				_localctx = new InStatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(167);
				match(IN);
				setState(168);
				match(LPAR);
				setState(169);
				match(STR);
				setState(170);
				match(COMMA);
				setState(171);
				target();
				setState(172);
				match(RPAR);
				}
				break;
			case OUT:
				_localctx = new OutStatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(174);
				match(OUT);
				setState(175);
				match(LPAR);
				setState(176);
				match(STR);
				setState(177);
				match(COMMA);
				setState(178);
				expr(0);
				setState(179);
				match(RPAR);
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

	public static class PrfOpContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(ArrayPascalParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(ArrayPascalParser.NOT, 0); }
		public PrfOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prfOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterPrfOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitPrfOp(this);
		}
	}

	public final PrfOpContext prfOp() throws RecognitionException {
		PrfOpContext _localctx = new PrfOpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_prfOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
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
		public TerminalNode STAR() { return getToken(ArrayPascalParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(ArrayPascalParser.SLASH, 0); }
		public MultOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterMultOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitMultOp(this);
		}
	}

	public final MultOpContext multOp() throws RecognitionException {
		MultOpContext _localctx = new MultOpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_multOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
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
		public TerminalNode PLUS() { return getToken(ArrayPascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ArrayPascalParser.MINUS, 0); }
		public PlusOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterPlusOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitPlusOp(this);
		}
	}

	public final PlusOpContext plusOp() throws RecognitionException {
		PlusOpContext _localctx = new PlusOpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_plusOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
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
		public TerminalNode AND() { return getToken(ArrayPascalParser.AND, 0); }
		public TerminalNode OR() { return getToken(ArrayPascalParser.OR, 0); }
		public BoolOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterBoolOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitBoolOp(this);
		}
	}

	public final BoolOpContext boolOp() throws RecognitionException {
		BoolOpContext _localctx = new BoolOpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_boolOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
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
		public TerminalNode LE() { return getToken(ArrayPascalParser.LE, 0); }
		public TerminalNode LT() { return getToken(ArrayPascalParser.LT, 0); }
		public TerminalNode GE() { return getToken(ArrayPascalParser.GE, 0); }
		public TerminalNode GT() { return getToken(ArrayPascalParser.GT, 0); }
		public TerminalNode EQ() { return getToken(ArrayPascalParser.EQ, 0); }
		public TerminalNode NE() { return getToken(ArrayPascalParser.NE, 0); }
		public CompOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).enterCompOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrayPascalListener ) ((ArrayPascalListener)listener).exitCompOp(this);
		}
	}

	public final CompOpContext compOp() throws RecognitionException {
		CompOpContext _localctx = new CompOpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\65\u00c4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\5\2\'\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3>\n\3\f\3\16\3A\13\3\5\3C\n\3\3\3\5"+
		"\3F\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3T\n\3\f\3\16"+
		"\3W\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4e\n\4\3\5"+
		"\5\5h\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\7\7s\n\7\f\7\16\7v\13\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\6\b~\n\b\r\b\16\b\177\3\t\3\t\3\t\7\t\u0085\n"+
		"\t\f\t\16\t\u0088\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u0091\n\n\f\n\16"+
		"\n\u0094\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00a2\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b8\n\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\2\3\4\21\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36\2\7\4\2\25\25))\3\2/\60\4\2))++\4\2\b\b\26\26\5"+
		"\2\"%((**\u00ce\2&\3\2\2\2\4E\3\2\2\2\6d\3\2\2\2\bg\3\2\2\2\nk\3\2\2\2"+
		"\ft\3\2\2\2\16y\3\2\2\2\20\u0081\3\2\2\2\22\u008c\3\2\2\2\24\u00b7\3\2"+
		"\2\2\26\u00b9\3\2\2\2\30\u00bb\3\2\2\2\32\u00bd\3\2\2\2\34\u00bf\3\2\2"+
		"\2\36\u00c1\3\2\2\2 \'\7\61\2\2!\"\7\61\2\2\"#\7\6\2\2#$\5\4\3\2$%\7\7"+
		"\2\2%\'\3\2\2\2& \3\2\2\2&!\3\2\2\2\'\3\3\2\2\2()\b\3\1\2)*\5\26\f\2*"+
		"+\5\4\3\r+F\3\2\2\2,-\7\'\2\2-.\5\4\3\2./\7-\2\2/F\3\2\2\2\60F\7\61\2"+
		"\2\61F\7\62\2\2\62F\7\32\2\2\63F\7\20\2\2\64\65\7\61\2\2\65\66\7\6\2\2"+
		"\66\67\5\4\3\2\678\7\7\2\28F\3\2\2\29B\7\7\2\2:?\5\4\3\2;<\7\37\2\2<>"+
		"\5\4\3\2=;\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@C\3\2\2\2A?\3\2\2\2B"+
		":\3\2\2\2BC\3\2\2\2CD\3\2\2\2DF\7\7\2\2E(\3\2\2\2E,\3\2\2\2E\60\3\2\2"+
		"\2E\61\3\2\2\2E\62\3\2\2\2E\63\3\2\2\2E\64\3\2\2\2E9\3\2\2\2FU\3\2\2\2"+
		"GH\f\f\2\2HI\5\32\16\2IJ\5\4\3\rJT\3\2\2\2KL\f\13\2\2LM\5\34\17\2MN\5"+
		"\4\3\fNT\3\2\2\2OP\f\n\2\2PQ\5\36\20\2QR\5\4\3\13RT\3\2\2\2SG\3\2\2\2"+
		"SK\3\2\2\2SO\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\5\3\2\2\2WU\3\2\2"+
		"\2Xe\7\13\2\2Ye\7\n\2\2Z[\7\3\2\2[\\\7\6\2\2\\]\5\b\5\2]^\7\5\2\2^_\5"+
		"\b\5\2_`\7\62\2\2`a\7\7\2\2ab\7\4\2\2bc\5\6\4\2ce\3\2\2\2dX\3\2\2\2dY"+
		"\3\2\2\2dZ\3\2\2\2e\7\3\2\2\2fh\7)\2\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2i"+
		"j\7\62\2\2j\t\3\2\2\2kl\7\31\2\2lm\7\61\2\2mn\7.\2\2no\5\f\7\2op\7 \2"+
		"\2p\13\3\2\2\2qs\5\16\b\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3"+
		"\2\2\2vt\3\2\2\2wx\5\22\n\2x\r\3\2\2\2y}\7\33\2\2z{\5\20\t\2{|\7.\2\2"+
		"|~\3\2\2\2}z\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\17\3\2\2\2\u0081\u0086\7\61\2\2\u0082\u0083\7\37\2\2\u0083\u0085\7\61"+
		"\2\2\u0084\u0082\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7\36"+
		"\2\2\u008a\u008b\5\6\4\2\u008b\21\3\2\2\2\u008c\u008d\7\t\2\2\u008d\u0092"+
		"\5\24\13\2\u008e\u008f\7.\2\2\u008f\u0091\5\24\13\2\u0090\u008e\3\2\2"+
		"\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095"+
		"\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7\16\2\2\u0096\23\3\2\2\2\u0097"+
		"\u0098\5\2\2\2\u0098\u0099\7\35\2\2\u0099\u009a\5\4\3\2\u009a\u00b8\3"+
		"\2\2\2\u009b\u009c\7\22\2\2\u009c\u009d\5\4\3\2\u009d\u009e\7\24\2\2\u009e"+
		"\u00a1\5\24\13\2\u009f\u00a0\7\r\2\2\u00a0\u00a2\5\24\13\2\u00a1\u009f"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00b8\3\2\2\2\u00a3\u00a4\7\34\2\2"+
		"\u00a4\u00a5\5\4\3\2\u00a5\u00a6\7\f\2\2\u00a6\u00a7\5\24\13\2\u00a7\u00b8"+
		"\3\2\2\2\u00a8\u00b8\5\22\n\2\u00a9\u00aa\7\23\2\2\u00aa\u00ab\7\'\2\2"+
		"\u00ab\u00ac\7\63\2\2\u00ac\u00ad\7\37\2\2\u00ad\u00ae\5\2\2\2\u00ae\u00af"+
		"\7-\2\2\u00af\u00b8\3\2\2\2\u00b0\u00b1\7\27\2\2\u00b1\u00b2\7\'\2\2\u00b2"+
		"\u00b3\7\63\2\2\u00b3\u00b4\7\37\2\2\u00b4\u00b5\5\4\3\2\u00b5\u00b6\7"+
		"-\2\2\u00b6\u00b8\3\2\2\2\u00b7\u0097\3\2\2\2\u00b7\u009b\3\2\2\2\u00b7"+
		"\u00a3\3\2\2\2\u00b7\u00a8\3\2\2\2\u00b7\u00a9\3\2\2\2\u00b7\u00b0\3\2"+
		"\2\2\u00b8\25\3\2\2\2\u00b9\u00ba\t\2\2\2\u00ba\27\3\2\2\2\u00bb\u00bc"+
		"\t\3\2\2\u00bc\31\3\2\2\2\u00bd\u00be\t\4\2\2\u00be\33\3\2\2\2\u00bf\u00c0"+
		"\t\5\2\2\u00c0\35\3\2\2\2\u00c1\u00c2\t\6\2\2\u00c2\37\3\2\2\2\20&?BE"+
		"SUdgt\177\u0086\u0092\u00a1\u00b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}