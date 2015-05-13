package pp.block3.cc.piet;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import pp.block3.cc.antlr.CalcParser.NegateContext;
import pp.block3.cc.antlr.CalcParser.NumberContext;
import pp.block3.cc.antlr.CalcParser.ParContext;
import pp.block3.cc.antlr.CalcParser.PlusContext;
import pp.block3.cc.antlr.CalcParser.TimesContext;
import pp.block3.cc.antlr.Type;

public class Pietenator extends PietBaseListener {
	
	/** Initialises the calculator before using it to walk a tree. */
	public void init() {
		type = new ParseTreeProperty<Type>();
		ival = new ParseTreeProperty<Integer>();
		bval = new ParseTreeProperty<Boolean>();
		sval = new ParseTreeProperty<String>();
	}

	@Override 
	public void exitEqual(PietParser.EqualContext ctx) {
		Type type0 = type.get(ctx.piet(0));
		Type type1 = type.get(ctx.piet(1));
		
		if((type0 == Type.ERR || type1 == Type.ERR)) {
			type.put(ctx, Type.ERR);
		}
		else if(type0 != type1) {
			type.put(ctx, Type.BOOL);
			bval.put(ctx, false);
		}
		else {
			type.put(ctx, Type.BOOL);
			if(type0 == Type.NUM) bval.put(ctx, ival.get(ctx.piet(0)) == ival.get(ctx.piet(1)));
			else if(type0 == Type.BOOL) bval.put(ctx, bval.get(ctx.piet(0)) == bval.get(ctx.piet(1)));
			else if(type0 == Type.STR) bval.put(ctx, sval.get(ctx.piet(0)).equals(sval.get(ctx.piet(1))));
		}
	}
	
	@Override 
	public void exitBracket(PietParser.BracketContext ctx) {
		Type t = type.get(ctx.piet());
		type.put(ctx, t);
		
		if(t == Type.NUM) ival.put(ctx, ival.get(ctx.piet()));
		else if(t == Type.BOOL) bval.put(ctx, bval.get(ctx.piet()));
		else if(t == Type.STR) sval.put(ctx, sval.get(ctx.piet()));
	}
	
	@Override 
	public void exitHat(PietParser.HatContext ctx) { 
		Type type0 = type.get(ctx.piet(0));
		Type type1 = type.get(ctx.piet(1));
		
		if((type0 == Type.ERR || type1 == Type.ERR) ||  (((type0 != Type.NUM && type0 != Type.STR) || type1 != Type.NUM))) {
			type.put(ctx, Type.ERR);
		}
		else {
			type.put(ctx, type0);
			if(type0 == Type.NUM) ival.put(ctx, (int) Math.pow(ival.get(ctx.piet(0)), ival.get(ctx.piet(1))));
			else if(type0 == Type.STR) sval.put(ctx, hat(sval.get(ctx.piet(0)), ival.get(ctx.piet(1))));
		}
	}
	
	@Override 
	public void exitPlus(PietParser.PlusContext ctx) { 
		Type type0 = type.get(ctx.piet(0));
		Type type1 = type.get(ctx.piet(1));
		
		if((type0 == Type.ERR || type1 == Type.ERR) || type0 != type1) {
			type.put(ctx, Type.ERR);
		}
		else {
			type.put(ctx, type0);
			if(type0 == Type.NUM) ival.put(ctx, ival.get(ctx.piet(0)) + ival.get(ctx.piet(1)));
			else if(type0 == Type.BOOL) bval.put(ctx, bval.get(ctx.piet(0)) || bval.get(ctx.piet(1)));
			else if(type0 == Type.STR) sval.put(ctx, sval.get(ctx.piet(0)) + sval.get(ctx.piet(1)));
		}
	}
	
	@Override 
	public void exitNumber(PietParser.NumberContext ctx) { 
		type.put(ctx, Type.NUM);
		ival.put(ctx, ival.get(ctx.NUM()));
	}
	
	@Override 
	public void exitBoolean(PietParser.BooleanContext ctx) { 
		type.put(ctx, Type.BOOL);
		bval.put(ctx, bval.get(ctx.BOOL()));
	}
	
	@Override 
	public void exitString(PietParser.StringContext ctx) { 
		type.put(ctx, Type.STR);
		sval.put(ctx, sval.get(ctx.STR()));
	}
	
	@Override 
	public void enterNumber(PietParser.NumberContext ctx) { 
		type.put(ctx.NUM(), Type.NUM);
	}
	
	@Override 
	public void enterBoolean(PietParser.BooleanContext ctx) { 
		type.put(ctx.BOOL(), Type.BOOL);
	}
	
	@Override 
	public void enterString(PietParser.StringContext ctx) { 
		type.put(ctx.STR(), Type.STR);
	}

	@SuppressWarnings("incomplete-switch")
	@Override 
	public void visitTerminal(TerminalNode node) {
		if(type.get(node) == null) return;
		
		switch(type.get(node)) {
			case BOOL: bval.put(node, node.getText().equals("true")); break;
			case NUM: ival.put(node, Integer.parseInt(node.getText())); break;
			case STR: sval.put(node, node.getText()); break;
		}
	}
	
	public String hat(String str, int num) {
		String result = "";
		for(int i = 0; i < num; i++)result += str;
		return result;
	}
	
	public Boolean bval(ParseTree node) {
		return bval.get(node);
	}
	
	public String sval(ParseTree node) {
		return sval.get(node);
	}
	
	public Integer ival(ParseTree node) {
		return ival.get(node);
	}
	
	public Type type(ParseTree node) {
		return type.get(node);
	}

	/** Map storing the val attribute for all parse tree nodes. */
	private ParseTreeProperty<Type> type;
	private ParseTreeProperty<Integer> ival;
	private ParseTreeProperty<Boolean> bval;
	private ParseTreeProperty<String> sval;
}
