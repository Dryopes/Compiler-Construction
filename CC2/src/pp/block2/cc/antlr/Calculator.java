package pp.block2.cc.antlr;

import java.math.BigInteger;

import org.antlr.v4.runtime.Lexer;

import pp.block2.cc.AST;
import pp.block2.cc.ParseException;
import pp.block2.cc.Parser;
import pp.block2.cc.SymbolFactory;
import pp.block2.cc.ll.Sentence;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import pp.block2.cc.NonTerm;
import sun.awt.SunHints.Value;

public class Calculator 
		extends ArithmeticBaseListener {
	
	private static final NonTerm EXP = new NonTerm("exp");	
	private ParseTreeProperty<String> solution;
	private boolean foundError;	
	private BigInteger result;

	public BigInteger calculate(Lexer lexer) {
		foundError = false;
		solution = new ParseTreeProperty<String>();
		
		ArithmeticParser parser = new ArithmeticParser(new CommonTokenStream(lexer));
		ParseTree tree = parser.exp();		
		new ParseTreeWalker().walk(this, tree);		
		
		return new BigInteger(solution.get(tree));
	}
	
	// From here on overwrite the listener methods
	// Use an appropriate ParseTreeProperty to
	// store the correspondence from nodes to ASTs
	
	@Override public void exitBrac(ArithmeticParser.BracContext ctx) {
		solution.put(ctx, solution.get(ctx.getChild(1)));
	}

	@Override public void exitOp1(ArithmeticParser.Op1Context ctx) { 
		BigInteger value1 = new BigInteger(solution.get(ctx.getChild(0)));
		BigInteger value2 = new BigInteger(solution.get(ctx.getChild(2)));
		
		solution.put(ctx, value1.pow(value2.intValue()).toString());
	}
	
	@Override public void exitOp2(ArithmeticParser.Op2Context ctx) {
		BigInteger value1 = new BigInteger(solution.get(ctx.getChild(0)));
		BigInteger value2 = new BigInteger(solution.get(ctx.getChild(2)));
		
		if(solution.get(ctx.getChild(1)).equals("*"))
			solution.put(ctx, value1.multiply(value2).toString());
		else if(solution.get(ctx.getChild(1)).equals("/"))
			solution.put(ctx, value1.divide(value2).toString());
	}

	@Override public void exitOp3(ArithmeticParser.Op3Context ctx) { 
		BigInteger value1 = new BigInteger(solution.get(ctx.getChild(0)));
		BigInteger value2 = new BigInteger(solution.get(ctx.getChild(2)));
		
		if(solution.get(ctx.getChild(1)).equals("+"))
			solution.put(ctx, value1.add(value2).toString());
		else if(solution.get(ctx.getChild(1)).equals("-"))
			solution.put(ctx, value1.subtract(value2).toString());
		else
			System.out.println("HELP! " + solution.get(ctx.getChild(1)));
	}

	@Override public void exitNegate(ArithmeticParser.NegateContext ctx) { 
		BigInteger minusOne = BigInteger.valueOf(-1);
		solution.put(ctx, new BigInteger(solution.get(ctx.getChild(1))).multiply(minusOne).toString());
	}
	
	@Override public void exitNumber(ArithmeticParser.NumberContext ctx) { 
		solution.put(ctx, solution.get(ctx.getChild(0)));
	}
	
	
	@Override
	public void visitTerminal(TerminalNode node) {
		solution.put(node, node.getText());
	}

	@Override
	public void visitErrorNode(ErrorNode node) {
		foundError = true;
	}
	
	public void computeChild(AST ast, ParseTree ctx) {
		for(int child = 0; child < ctx.getChildCount(); child++) {

		}

	}
}
