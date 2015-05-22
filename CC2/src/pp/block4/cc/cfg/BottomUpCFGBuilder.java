package pp.block4.cc.cfg;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import pp.block4.cc.ErrorListener;

/** Template bottom-up CFG builder. */
public class BottomUpCFGBuilder extends FragmentBaseListener {
	/** The CFG being built. */
	private Graph graph;
	
	private Stack<List<Node>> cfgs;
	
	

	@Override public void exitBlockStat(@NotNull FragmentParser.BlockStatContext ctx) {
		if(ctx.getChildCount() == 2){
			Node tmp = graph.addNode();
			ArrayList<Node> list = new ArrayList<Node>();
			list.add(tmp);
			list.add(tmp);
			cfgs.add(list);
			
		} else{
			List<Node> stackEnd = cfgs.pop();		
			for(int kids = ctx.stat().size(); kids > 0; kids--){
				List<Node> stackStart = cfgs.pop();
				stackStart.get(1).addEdge(stackEnd.get(0));
			stackEnd.remove(0);
			stackEnd.add(0, stackStart.get(0));
			}
			cfgs.add(stackEnd);
		}
	}

	@Override public void exitContStat(@NotNull FragmentParser.ContStatContext ctx) { }

	@Override public void exitDecl(@NotNull FragmentParser.DeclContext ctx) {
		Node tmp = graph.addNode();
		ArrayList<Node> list = new ArrayList<Node>();
		list.add(tmp);
		list.add(tmp);
		cfgs.add(list);
	}

	@Override public void exitPrintStat(@NotNull FragmentParser.PrintStatContext ctx) {
		Node tmp = graph.addNode();
		ArrayList<Node> list = new ArrayList<Node>();
		list.add(tmp);
		list.add(tmp);
		cfgs.add(list);
	}

	@Override public void exitProgram(@NotNull FragmentParser.ProgramContext ctx) { 
		List<Node> stackEnd = cfgs.pop();		
		for(int kids = ctx.getChildCount(); kids > 1; kids--){
			List<Node> stackStart = cfgs.pop();
			stackStart.get(1).addEdge(stackEnd.get(0));
			stackEnd.remove(0);
			stackEnd.add(0, stackStart.get(0));
		}
		cfgs.add(stackEnd);
	}


	@Override public void exitWhileStat(@NotNull FragmentParser.WhileStatContext ctx) {
		List<Node> body = cfgs.pop();
		Node cond = graph.addNode();
		cond.addEdge(body.get(0));
		body.get(1).addEdge(cond);
		ArrayList<Node> list = new ArrayList<Node>();
		list.add(cond);
		list.add(cond);
		cfgs.add(list);
		
		
	}

	@Override public void exitIfStat(@NotNull FragmentParser.IfStatContext ctx) { 
		if(ctx.stat().size() == 2){
			List<Node> elsepart = cfgs.pop();
			List<Node> thenpart = cfgs.pop();
			Node cond = graph.addNode();
			Node after = graph.addNode();
			cond.addEdge(thenpart.get(0));
			cond.addEdge(elsepart.get(0));
			elsepart.get(1).addEdge(after);
			thenpart.get(1).addEdge(after);
			List<Node> out = new ArrayList<Node>();
			out.add(cond);
			out.add(after);
			cfgs.push(out);
		} else {
			List<Node> thenpart = cfgs.pop();
			List<Node> cond = cfgs.pop();
			Node after = graph.addNode();
			cond.get(1).addEdge(thenpart.get(0));
			cond.get(1).addEdge(after);
			thenpart.get(1).addEdge(after);
			List<Node> out = new ArrayList<Node>();
			out.add(cond.get(0));
			out.add(after);
			cfgs.push(out);
		}
	}

	@Override public void exitIdTarget(@NotNull FragmentParser.IdTargetContext ctx) {
		Node tmp = graph.addNode();
		ArrayList<Node> list = new ArrayList<Node>();
		list.add(tmp);
		list.add(tmp);
		cfgs.add(list);
	}


	@Override public void exitBreakStat(@NotNull FragmentParser.BreakStatContext ctx) { }

		@Override public void exitAssignStat(@NotNull FragmentParser.AssignStatContext ctx) {
		Node tmp = graph.addNode();
		ArrayList<Node> list = new ArrayList<Node>();
		list.add(tmp);
		list.add(tmp);
		cfgs.add(list);
	}

	@Override public void exitConstExpr(@NotNull FragmentParser.ConstExprContext ctx) { }

	@Override public void exitIdExpr(@NotNull FragmentParser.IdExprContext ctx) { }

	@Override public void exitAndExpr(@NotNull FragmentParser.AndExprContext ctx) { }

	
	
	@Override public void exitEveryRule(@NotNull ParserRuleContext ctx) {
		System.out.println(ctx.getRuleContext().getText());
		System.out.println("Stack size"+ cfgs.size());
	}

	@Override public void visitTerminal(@NotNull TerminalNode node) { 
		
	}

	@Override public void visitErrorNode(@NotNull ErrorNode node) { }

	

	/** Builds the CFG for a program contained in a given file. */
	public Graph build(File file) {
		Graph result = null;
		ErrorListener listener = new ErrorListener();
		try {
			CharStream chars = new ANTLRInputStream(new FileReader(file));
			Lexer lexer = new FragmentLexer(chars);
			lexer.removeErrorListeners();
			lexer.addErrorListener(listener);
			TokenStream tokens = new CommonTokenStream(lexer);
			FragmentParser parser = new FragmentParser(tokens);
			parser.removeErrorListeners();
			parser.addErrorListener(listener);
			ParseTree tree = parser.program();
			if (listener.hasErrors()) {
				System.out.printf("Parse errors in %s:%n", file.getPath());
				for (String error : listener.getErrors()) {
					System.err.println(error);
				}
			} else {
				result = build(tree);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	/** Builds the CFG for a program given as an ANTLR parse tree. */
	public Graph build(ParseTree tree) {
		this.graph = new Graph();
		// Fill in
		cfgs = new Stack<List<Node>>();
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(this, tree);
		
		
		
		return graph;
	}

	/** Adds a node to he CGF, based on a given parse tree node.
	 * Gives the CFG node a meaningful ID, consisting of line number and 
	 * a further indicator.
	 */
	private Node addNode(ParserRuleContext node, String text) {
		return this.graph.addNode(node.getStart().getLine() + ": " + text);
	}

	/** Main method to build and print the CFG of a simple Java program. */
	public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("Usage: [filename]+");
			return;
		}
		BottomUpCFGBuilder builder = new BottomUpCFGBuilder();
		for (String filename : args) {
			File file = new File(filename);
			System.out.println(filename);
			System.out.println(builder.build(file));
		}
	}
}
