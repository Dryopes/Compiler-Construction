package pp.block5.cc.simple;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import pp.block5.cc.pascal.SimplePascalBaseVisitor;
import pp.block5.cc.pascal.SimplePascalParser;
import pp.block5.cc.pascal.SimplePascalParser.ProgramContext;
import pp.iloc.Simulator;
import pp.iloc.model.Label;
import pp.iloc.model.Num;
import pp.iloc.model.Op;
import pp.iloc.model.OpCode;
import pp.iloc.model.OpList;
import pp.iloc.model.Operand;
import pp.iloc.model.Program;
import pp.iloc.model.Reg;
import pp.iloc.model.Str;
/** Class to generate ILOC code for Simple Pascal. */
public class Generator extends SimplePascalBaseVisitor<Op> {
	/** The representation of the boolean value <code>false</code>. */
	public final static Num FALSE_VALUE = new Num(Simulator.FALSE);
	/** The representation of the boolean value <code>true</code>. */
	public final static Num TRUE_VALUE = new Num(Simulator.TRUE);

	/** The base register. */
	private Reg arp = new Reg("r_arp");
	/** The outcome of the checker phase. */
	private Result checkResult;
	/** Association of statement nodes to labels. */
	private ParseTreeProperty<Label> labels;
	/** The program being built. */
	private Program prog;
	/** Register count, used to generate fresh registers. */
	private int regCount;
	/** Association of expression and target nodes to registers. */
	private ParseTreeProperty<Reg> regs;
	private Map<String, Reg> varRegs;

	public Program generate(ParseTree tree, Result checkResult) {
		this.prog = new Program();
		this.checkResult = checkResult;
		this.regs = new ParseTreeProperty<>();
		this.varRegs = new HashMap<String, Reg>();
		this.labels = new ParseTreeProperty<>();
		this.regCount = 0;
		tree.accept(this);
		return this.prog;
	}
	/*
	 * --
	 * TOEGEVOEGD
	 * --
	 */
	
	/*
	 * PROGRAM
	 */
	
	@Override public Op visitProgram(SimplePascalParser.ProgramContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override public Op visitBody(SimplePascalParser.BodyContext ctx) { 
		return visitChildren(ctx); 
	}
	
	/*
	 * STATEMENTS
	 */
	
	@Override public Op visitAssStat(SimplePascalParser.AssStatContext ctx) { 
		visitChildren(ctx);		
		emit(OpCode.i2i, this.regs.get(ctx.expr()), this.regs.get(ctx.target()));		
		return null;
	}
	
	@Override public Op visitIdTarget(SimplePascalParser.IdTargetContext ctx) { 
		System.out.println("Id: " + ctx.ID().getText() + " and reg: " + this.varRegs.get(ctx.ID().getText()));
		this.regs.put(ctx, this.varRegs.get(ctx.ID().getText()));
		return null;
	}
	
	@Override public Op visitWhileStat(SimplePascalParser.WhileStatContext ctx) { 
		Label start = createLabel(ctx, "start");
		Label body = createLabel(ctx, "body");
		Label end = createLabel(ctx, "end");
		
		emit(start, OpCode.nop);
		visit(ctx.expr());		
		emit(OpCode.cbr, this.regs.get(ctx.expr()), body, end);
		emit(body, OpCode.nop);
		visit(ctx.stat());
		emit(OpCode.jumpI, start);
		emit(end, OpCode.nop);
		
		return null;
	}
	
	@Override public Op visitIfStat(SimplePascalParser.IfStatContext ctx) {
		Label thenL = createLabel(ctx, "then");
		Label elseL = createLabel(ctx, "else");
		Label end	= createLabel(ctx, "end");
		
		visit(ctx.expr());
		emit(OpCode.cbr, this.regs.get(ctx.expr()), thenL, elseL);
		emit(thenL, OpCode.nop);
		visit(ctx.stat(0));
		emit(OpCode.jumpI, end);
		emit(elseL, OpCode.nop);
		visit(ctx.stat(1));
		emit(end, OpCode.nop);
		
		return null;
	}
	
	@Override public Op visitInStat(SimplePascalParser.InStatContext ctx) { 
		visitChildren(ctx);
		
		String text = ctx.STR().getText();
		emit(OpCode.in, new Str(text.substring(1, text.length()-1)), this.regs.get(ctx.target()));
		return null;
	}

	@Override public Op visitOutStat(SimplePascalParser.OutStatContext ctx) {
		visitChildren(ctx);
		
		String text = ctx.STR().getText();
		emit(OpCode.out, new Str(text.substring(1, text.length()-1)), this.regs.get(ctx.expr()));
		return null;
	}
	
	/*
	 * EXPR
	 */

	@Override public Op visitPrfExpr(SimplePascalParser.PrfExprContext ctx) { 
		visitChildren(ctx);
		
		Reg resultReg = reg(ctx);
		Reg expr = regs.get(ctx.expr());
		Op result = visit(ctx.prfOp());
		
		emit(result.getOpCode(), expr, result.getOpnds().get(0), resultReg);		
		return null;
	}

	
	@Override public Op visitMultExpr(SimplePascalParser.MultExprContext ctx) { 
		visitChildren(ctx);
		
		Reg resultReg = reg(ctx);
		Reg expr1 = regs.get(ctx.expr(0));
		Reg expr2 = regs.get(ctx.expr(1));
		Op result = visit(ctx.multOp());
		
		emit(result.getOpCode(), expr1, expr2, resultReg);		
		return null;
	}

	@Override public Op visitPlusExpr(SimplePascalParser.PlusExprContext ctx) { 
		visitChildren(ctx);
		
		Reg resultReg = reg(ctx);
		Reg expr1 = regs.get(ctx.expr(0));
		Reg expr2 = regs.get(ctx.expr(1));
		Op result = visit(ctx.plusOp());
		
		emit(result.getOpCode(), expr1, expr2, resultReg);		
		return null;
	}
	
	@Override public Op visitCompExpr(SimplePascalParser.CompExprContext ctx) { 
		visitChildren(ctx);
		
		Reg resultReg = reg(ctx);
		Reg expr1 = regs.get(ctx.expr(0));
		Reg expr2 = regs.get(ctx.expr(1));
		Op result = visit(ctx.compOp());
		
		emit(result.getOpCode(), expr1, expr2, resultReg);		
		return null;
	}
	
	@Override public Op visitBoolExpr(SimplePascalParser.BoolExprContext ctx) { 
		visitChildren(ctx);
		
		Reg resultReg = reg(ctx);
		Reg expr1 = regs.get(ctx.expr(0));
		Reg expr2 = regs.get(ctx.expr(1));
		Op result = visit(ctx.boolOp());
		
		emit(result.getOpCode(), expr1, expr2, resultReg);		
		return null;
	}
	
	@Override public Op visitParExpr(SimplePascalParser.ParExprContext ctx) { 
		visitChildren(ctx);
		this.regs.put(ctx, reg(ctx.expr()));
		return null;
	}
	
	@Override public Op visitFalseExpr(SimplePascalParser.FalseExprContext ctx) { 
		emit(OpCode.loadI, FALSE_VALUE, reg(ctx));		
		return null;
	}
	
	@Override public Op visitTrueExpr(SimplePascalParser.TrueExprContext ctx) { 
		emit(OpCode.loadI, TRUE_VALUE, reg(ctx));		
		return null;
	}

	@Override public Op visitIdExpr(SimplePascalParser.IdExprContext ctx) { 
		this.regs.put(ctx, varRegs.get(ctx.ID().getText()));
		return null;
	}
	
	@Override public Op visitNumExpr(SimplePascalParser.NumExprContext ctx) { 
		emit(OpCode.loadI, new Num(Integer.parseInt(ctx.getText())), reg(ctx));	
		return null;
	}
	
	/*
	 * OPERATORS
	 */
	
	@Override public Op visitPrfOp(SimplePascalParser.PrfOpContext ctx) { 
		Op result = null;
		
		if(ctx.MINUS() != null) 	result = new Op(OpCode.multI, new Num(-1), null, null);
		else if(ctx.NOT() != null) 	result = new Op(OpCode.cmp_EQ, arp, null, null);
		
		return result;
	}

	@Override public Op visitMultOp(SimplePascalParser.MultOpContext ctx) { 
		Op result = null;	
		
		if(ctx.SLASH() != null) 	result = new Op(OpCode.div, null, null, null);
		else if(ctx.STAR() != null)	result = new Op(OpCode.mult, null, null, null);
		
		return result;
	}

	@Override public Op visitPlusOp(SimplePascalParser.PlusOpContext ctx) { 
		Op result = null;
		
		if(ctx.PLUS() != null) 			result = new Op(OpCode.add, null, null, null);
		else if(ctx.MINUS() != null) 	result = new Op(OpCode.sub, null, null, null);
		
		return result;
	}
	
	@Override public Op visitBoolOp(SimplePascalParser.BoolOpContext ctx) { 
		Op result = null;
		
		if(ctx.OR() != null) 		result = new Op(OpCode.or, null, null, null);
		else if(ctx.AND() != null) 	result = new Op(OpCode.and, null, null, null);
		
		return result;
	}
	
	@Override public Op visitCompOp(SimplePascalParser.CompOpContext ctx) {
		Op result = null;
		
		if(ctx.EQ() != null) 		result = new Op(OpCode.cmp_EQ, null, null, null);
		else if(ctx.GE() != null) 	result = new Op(OpCode.cmp_GE, null, null, null);
		else if(ctx.GT() != null) 	result = new Op(OpCode.cmp_GT, null, null, null);
		else if(ctx.LE() != null) 	result = new Op(OpCode.cmp_GE, null, null, null);
		else if(ctx.LT() != null) 	result = new Op(OpCode.cmp_LT, null, null, null);
		else if(ctx.NE() != null) 	result = new Op(OpCode.cmp_NE, null, null, null);
			
		return result;
	}
	
	/*
	 * DECLARATION
	 */
	
	public Op visitVar(SimplePascalParser.VarContext ctx) {
		for(int i = 0; i < ctx.ID().size(); i++) {
			String varName = ctx.ID(i).getText();
			this.varRegs.put(varName, new Reg("r_" + varName));
			emit(OpCode.loadI, new Num(0), this.varRegs.get(varName));
		}
		
		return null;
	}
	
	
	/*
	 * --
	 * EINDE
	 * --
	 */
	
	

	// Override the visitor methods
	/** Constructs an operation from the parameters 
	 * and adds it to the program under construction. */
	private Op emit(Label label, OpCode opCode, Operand... args) {
		Op result = new Op(label, opCode, args);
		this.prog.addInstr(result);
		return result;
	}

	/** Constructs an operation from the parameters 
	 * and adds it to the program under construction. */
	private Op emit(OpCode opCode, Operand... args) {
		return emit((Label) null, opCode, args);
	}

	/** 
	 * Looks up the label for a given parse tree node,
	 * creating it if none has been created before.
	 * The label is actually constructed from the entry node
	 * in the flow graph, as stored in the checker result.
	 */
	private Label label(ParserRuleContext node) {
		Label result = this.labels.get(node);
		if (result == null) {
			ParserRuleContext entry = this.checkResult.getEntry(node);
			result = createLabel(entry, "n");
			this.labels.put(node, result);
		}
		return result;
	}

	/** Creates a label for a given parse tree node and prefix. */
	private Label createLabel(ParserRuleContext node, String prefix) {
		Token token = node.getStart();
		int line = token.getLine();
		int column = token.getCharPositionInLine();
		String result = prefix + "_" + line + "_" + column;
		return new Label(result);
	}

	/** Retrieves the offset of a variable node from the checker result,
	 * wrapped in a {@link Num} operand. */
	private Num offset(ParseTree node) {
		return new Num(this.checkResult.getOffset(node));
	}

	/** Returns a register for a given parse tree node,
	 * creating a fresh register if there is none for that node. */
	private Reg reg(ParseTree node) {
		Reg result = this.regs.get(node);
		if (result == null) {
			result = new Reg("r_" + this.regCount);
			this.regs.put(node, result);
			this.regCount++;
		}
		return result;
	}

	/** Assigns a register to a given parse tree node. */
	private void setReg(ParseTree node, Reg reg) {
		this.regs.put(node, reg);
	}
}
