package pp.block4.cc.iloc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import pp.block4.cc.ErrorListener;
import pp.block4.cc.iloc.CalcParser.CompleteContext;
import pp.iloc.Simulator;
import pp.iloc.model.Instr;
import pp.iloc.model.Num;
import pp.iloc.model.Op;
import pp.iloc.model.OpCode;
import pp.iloc.model.OpList;
import pp.iloc.model.Operand;
import pp.iloc.model.Program;
import pp.iloc.model.Reg;
import pp.iloc.model.Str;

/** Compiler from Calc.g4 to ILOC. */
public class CalcCompiler extends CalcBaseListener {
	/** Program under construction. */
	private Program prog;
	private ParseTreeProperty<Reg> regs;
	private List<Integer> loaded;
	private Integer regCounter;
	// Attribute maps and other fields

	/** Compiles a given expression string into an ILOC program. */
	public Program compile(String text) {
		Program result = null;		
		ErrorListener listener = new ErrorListener();
		CharStream chars = new ANTLRInputStream(text);
		Lexer lexer = new CalcLexer(chars);
		lexer.removeErrorListeners();
		lexer.addErrorListener(listener);
		TokenStream tokens = new CommonTokenStream(lexer);
		CalcParser parser = new CalcParser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(listener);
		ParseTree tree = parser.complete();
		if (listener.hasErrors()) {
			System.out.printf("Parse errors in %s:%n", text);
			for (String error : listener.getErrors()) {
				System.err.println(error);
			}
		} else {
			result = compile(tree);
		}
		return result;
	}

	/** Compiles a given Calc-parse tree into an ILOC program. */
	public Program compile(ParseTree tree) {
		ParseTreeWalker walker = new ParseTreeWalker();
		regs = new ParseTreeProperty<Reg>();
		loaded = new ArrayList<Integer>();
		regCounter = 0;
		prog = new Program();
		walker.walk(this, tree);
		
		return prog;
	}
	
	@Override public void exitComplete(CalcParser.CompleteContext ctx) {
		emit(OpCode.out, new Str(""), regs.get(ctx.expr()));
	}
	
	@Override public void exitPar(CalcParser.ParContext ctx) {
		regs.put(ctx, regs.get(ctx.expr()));
	}
	

	@Override public void exitMinus(CalcParser.MinusContext ctx) { 
		Reg reg = new Reg("r_r" + regCounter++);
		this.regs.put(ctx, reg);
		
		emit(OpCode.multI, regs.get(ctx.expr()), new Num(-1), reg);		
	}
	
	@Override public void exitNumber(CalcParser.NumberContext ctx) {
		Integer number = Integer.parseInt(ctx.NUMBER().getText());
		Reg reg = new Reg("r_" + number);
		this.regs.put(ctx, reg);
		
		if(!loaded.contains(number)) {						
			this.emit(OpCode.loadI, new Num(number), reg);			
			this.loaded.add(number);
		}
	}
	
	@Override public void exitTimes(CalcParser.TimesContext ctx) {
		Reg reg = new Reg("r_r" + regCounter++);
		this.regs.put(ctx, reg);
		
		emit(OpCode.mult, regs.get(ctx.expr(0)), regs.get(ctx.expr(1)), reg);			
	}
	
	@Override public void exitPlus(CalcParser.PlusContext ctx) { 
		Reg reg = new Reg("r_r" + regCounter++);
		this.regs.put(ctx, reg);
		
		emit(OpCode.add, regs.get(ctx.expr(0)), regs.get(ctx.expr(1)), reg);		
	}	

	/** Constructs an operation from the parameters 
	 * and adds it to the program under construction. */	
	private void emit(OpCode opCode, Operand... args) {
		this.prog.addInstr(new Op(opCode, args));
	}

	/** Calls the compiler, and simulates and prints the compiled program. */
	public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("Usage: [expr]+");
			return;
		}
		CalcCompiler compiler = new CalcCompiler();
		for (String expr : args) {
			System.out.println("Processing " + expr);
			Program prog = compiler.compile(expr);
			new Simulator(prog).run();
			System.out.println(prog.prettyPrint());
		}
	}
}
