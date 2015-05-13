// Generated from PietAttr.g4 by ANTLR 4.5
package pp.block3.cc.piet;

import pp.block3.cc.antlr.Type;

package pp.block3.cc.piet;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PietAttrParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HAT=1, PLUS=2, EQUAL=3, LPAR=4, RPAR=5, NUM=6, BOOL=7, STR=8, WS=9;
	public static final int
		RULE_piet = 0;
	public static final String[] ruleNames = {
		"piet"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'^'", "'+'", "'='", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "HAT", "PLUS", "EQUAL", "LPAR", "RPAR", "NUM", "BOOL", "STR", "WS"
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
	public String getGrammarFileName() { return "PietAttr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private int getInt(String text) {
	        return Integer.parseInt(text);
	    }
	    
	    private boolean getBool(String text) {
	    	return text.equals("true");
	    }
	    
	    private String hat(String text, int num) {
	    	String result = "";
	    	for(int i = 0; i < num; i++) result += text;
	    	return result;
	    }

	public PietAttrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PietContext extends ParserRuleContext {
		public Type type;
		public boolean bval;
		public int ival;
		public String sval;
		public PietContext p0;
		public PietContext p;
		public Token NUM;
		public Token BOOL;
		public Token STR;
		public PietContext p1;
		public TerminalNode LPAR() { return getToken(PietAttrParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PietAttrParser.RPAR, 0); }
		public List<PietContext> piet() {
			return getRuleContexts(PietContext.class);
		}
		public PietContext piet(int i) {
			return getRuleContext(PietContext.class,i);
		}
		public TerminalNode NUM() { return getToken(PietAttrParser.NUM, 0); }
		public TerminalNode BOOL() { return getToken(PietAttrParser.BOOL, 0); }
		public TerminalNode STR() { return getToken(PietAttrParser.STR, 0); }
		public TerminalNode HAT() { return getToken(PietAttrParser.HAT, 0); }
		public TerminalNode PLUS() { return getToken(PietAttrParser.PLUS, 0); }
		public TerminalNode EQUAL() { return getToken(PietAttrParser.EQUAL, 0); }
		public PietContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_piet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PietAttrListener ) ((PietAttrListener)listener).enterPiet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PietAttrListener ) ((PietAttrListener)listener).exitPiet(this);
		}
	}

	public final PietContext piet() throws RecognitionException {
		return piet(0);
	}

	private PietContext piet(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PietContext _localctx = new PietContext(_ctx, _parentState);
		PietContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_piet, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			switch (_input.LA(1)) {
			case LPAR:
				{
				setState(3);
				match(LPAR);
				setState(4);
				((PietContext)_localctx).p = piet(0);
				setState(5);
				match(RPAR);

						((PietContext)_localctx).type =  ((PietContext)_localctx).p.type;
						((PietContext)_localctx).ival =  ((PietContext)_localctx).p.ival;
						((PietContext)_localctx).bval =  ((PietContext)_localctx).p.bval;
						((PietContext)_localctx).sval =  ((PietContext)_localctx).p.sval;
					
				}
				break;
			case NUM:
				{
				setState(8);
				((PietContext)_localctx).NUM = match(NUM);
				((PietContext)_localctx).type =  Type.NUM;  ((PietContext)_localctx).ival =  getInt((((PietContext)_localctx).NUM!=null?((PietContext)_localctx).NUM.getText():null));
				}
				break;
			case BOOL:
				{
				setState(10);
				((PietContext)_localctx).BOOL = match(BOOL);
				((PietContext)_localctx).type =  Type.BOOL;  ((PietContext)_localctx).bval =  getBool((((PietContext)_localctx).BOOL!=null?((PietContext)_localctx).BOOL.getText():null));
				}
				break;
			case STR:
				{
				setState(12);
				((PietContext)_localctx).STR = match(STR);
				((PietContext)_localctx).type =  Type.STR;  ((PietContext)_localctx).sval =  (((PietContext)_localctx).STR!=null?((PietContext)_localctx).STR.getText():null);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(31);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new PietContext(_parentctx, _parentState);
						_localctx.p0 = _prevctx;
						_localctx.p0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_piet);
						setState(16);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(17);
						match(HAT);
						setState(18);
						((PietContext)_localctx).p1 = piet(8);

						          		if(((PietContext)_localctx).p0.type == Type.ERR || ((PietContext)_localctx).p1.type == Type.ERR) {
						          			((PietContext)_localctx).type =  Type.ERR;
						          		}
						          		else if(((PietContext)_localctx).p1.type == Type.NUM) {
						          			if(((PietContext)_localctx).p0.type == Type.NUM) {
						          				((PietContext)_localctx).type =  Type.NUM;
						          				((PietContext)_localctx).ival =  (int) Math.pow(((PietContext)_localctx).p0.ival, ((PietContext)_localctx).p1.ival);	
						          			}
						          			else if(((PietContext)_localctx).p0.type == Type.STR) {
						          				((PietContext)_localctx).type =  Type.STR;
						          				((PietContext)_localctx).sval =  hat(((PietContext)_localctx).p0.sval, ((PietContext)_localctx).p1.ival);
						          			}
						          			else {
						          				((PietContext)_localctx).type =  Type.ERR;
						          			}
						          		}
						          		else {
						          			((PietContext)_localctx).type =  Type.ERR;
						          		}
						          	
						}
						break;
					case 2:
						{
						_localctx = new PietContext(_parentctx, _parentState);
						_localctx.p0 = _prevctx;
						_localctx.p0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_piet);
						setState(21);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(22);
						match(PLUS);
						setState(23);
						((PietContext)_localctx).p1 = piet(7);

						          		if(((PietContext)_localctx).p0.type == Type.ERR || ((PietContext)_localctx).p1.type == Type.ERR) {
						          			((PietContext)_localctx).type =  Type.ERR;
						          		}
						          		else if(((PietContext)_localctx).p0.type == ((PietContext)_localctx).p1.type){
						          			((PietContext)_localctx).type =  ((PietContext)_localctx).p0.type;
						          			if(((PietContext)_localctx).p0.type == Type.BOOL) ((PietContext)_localctx).bval =  ((PietContext)_localctx).p0.bval || ((PietContext)_localctx).p1.bval;
						          			else if(((PietContext)_localctx).p0.type == Type.NUM) ((PietContext)_localctx).ival =  ((PietContext)_localctx).p0.ival + ((PietContext)_localctx).p1.ival;
						          			else if(((PietContext)_localctx).p0.type == Type.STR) ((PietContext)_localctx).sval =  ((PietContext)_localctx).p0.sval + ((PietContext)_localctx).p1.sval;
						          		}
						          		else {
						          			((PietContext)_localctx).type =  Type.ERR;
						          		}
						          	
						}
						break;
					case 3:
						{
						_localctx = new PietContext(_parentctx, _parentState);
						_localctx.p0 = _prevctx;
						_localctx.p0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_piet);
						setState(26);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(27);
						match(EQUAL);
						setState(28);
						((PietContext)_localctx).p1 = piet(6);

						          		if(((PietContext)_localctx).p0.type == Type.ERR || ((PietContext)_localctx).p1.type == Type.ERR) {
						          			((PietContext)_localctx).type =  Type.ERR;
						          		}
						          		else if(((PietContext)_localctx).p0.type == ((PietContext)_localctx).p1.type){
						          			((PietContext)_localctx).type =  Type.BOOL;
						          			if(((PietContext)_localctx).p0.type == Type.BOOL) ((PietContext)_localctx).bval =  ((PietContext)_localctx).p0.bval == ((PietContext)_localctx).p1.bval;
						          			else if(((PietContext)_localctx).p0.type == Type.NUM) ((PietContext)_localctx).bval =  ((PietContext)_localctx).p0.ival == ((PietContext)_localctx).p1.ival;
						          			else if(((PietContext)_localctx).p0.type == Type.STR) ((PietContext)_localctx).bval =  ((PietContext)_localctx).p0.sval.equals(((PietContext)_localctx).p1.sval);
						          		}
						          		else {
						          			((PietContext)_localctx).type =  Type.BOOL;
						          			((PietContext)_localctx).bval =  false;
						          		}
						          	
						}
						break;
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return piet_sempred((PietContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean piet_sempred(PietContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\13\'\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\21\n\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\"\n\2\f\2\16\2%\13"+
		"\2\3\2\2\3\2\3\2\2\2+\2\20\3\2\2\2\4\5\b\2\1\2\5\6\7\6\2\2\6\7\5\2\2\2"+
		"\7\b\7\7\2\2\b\t\b\2\1\2\t\21\3\2\2\2\n\13\7\b\2\2\13\21\b\2\1\2\f\r\7"+
		"\t\2\2\r\21\b\2\1\2\16\17\7\n\2\2\17\21\b\2\1\2\20\4\3\2\2\2\20\n\3\2"+
		"\2\2\20\f\3\2\2\2\20\16\3\2\2\2\21#\3\2\2\2\22\23\f\t\2\2\23\24\7\3\2"+
		"\2\24\25\5\2\2\n\25\26\b\2\1\2\26\"\3\2\2\2\27\30\f\b\2\2\30\31\7\4\2"+
		"\2\31\32\5\2\2\t\32\33\b\2\1\2\33\"\3\2\2\2\34\35\f\7\2\2\35\36\7\5\2"+
		"\2\36\37\5\2\2\b\37 \b\2\1\2 \"\3\2\2\2!\22\3\2\2\2!\27\3\2\2\2!\34\3"+
		"\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\3\3\2\2\2%#\3\2\2\2\5\20!#";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}