package pp.block4.cc.cfg;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Stack;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import pp.block4.cc.ErrorListener;

/** Template bottom-up CFG builder. */
public class BottomUpCFGBuilder_PTP extends FragmentBaseListener {
	/** The CFG being built. */
	private Graph graph;
	private ParseTreeProperty<Node[]> list;

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
		this.list = new ParseTreeProperty<Node[]>();
		
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(this, tree);
		
		return this.graph;
	}
	
	@Override 
	public void exitBlockStat(@NotNull FragmentParser.BlockStatContext ctx) {
		if(ctx.stat().isEmpty()) {
			list.put(ctx, new Node[]{addNode(ctx, "block")});
		}
		else {
			Node[] result = new Node[2];
			
			Node[] nodes = list.get(ctx.stat(0));
			Node end = nodes.length == 1 ? nodes[0] : nodes[1];
			
			result[0] = nodes[0];
			
			for(int i = 1; i < ctx.stat().size(); i++) {
				nodes = list.get(ctx.stat(i));
				Node start = nodes[0];
				end.addEdge(start);
				end = nodes.length == 1 ? nodes[0] : nodes[1];
			}
			
			result[1] = end;
			
			list.put(ctx, result);
		}
	}
	
	@Override public void exitProgram(@NotNull FragmentParser.ProgramContext ctx) {
		Node[] nodes = list.get(ctx.stat(0));
		Node end = nodes.length == 1 ? nodes[0] : nodes[1];
		
		for(int i = 1; i < ctx.stat().size(); i++) {
			nodes = list.get(ctx.stat(i));
			Node start = nodes[0];
			end.addEdge(start);
			end = nodes.length == 1 ? nodes[0] : nodes[1];
		}
	}
	
	@Override
	public void exitDecl(@NotNull FragmentParser.DeclContext ctx) {
		list.put(ctx, new Node[]{addNode(ctx, ctx.getText())});
	}
	
	@Override 
	public void exitAssignStat(@NotNull FragmentParser.AssignStatContext ctx) { 
		list.put(ctx, new Node[]{addNode(ctx, ctx.getText())});
	}
	
	@Override 
	public void exitWhileStat(@NotNull FragmentParser.WhileStatContext ctx) {
		Node whileNode = addNode(ctx, "");
		Node[] bodyNodes = list.get(ctx.stat());
		Node bodyStart = bodyNodes[0];
		Node bodyEnd = bodyNodes.length == 1 ? bodyNodes[0] : bodyNodes[1];
		
		list.put(ctx, new Node[]{whileNode});
		
		whileNode.addEdge(bodyStart);
		bodyEnd.addEdge(whileNode);
	}
	
	@Override
	public void exitIfStat(@NotNull FragmentParser.IfStatContext ctx) {
		Node ifStart 		= addNode(ctx, "");
		Node ifEnd	 		= addNode(ctx, "after");
		
		Node[] ifBodyNodes	= list.get(ctx.stat(0));
		Node ifBodyStart	= ifBodyNodes[0];
		Node ifBodyEnd		= ifBodyNodes.length == 1 ? ifBodyNodes[0] : ifBodyNodes[1];
		
		list.put(ctx, new Node[]{ifStart, ifEnd});
		
		ifStart.addEdge(ifBodyStart);
		ifBodyEnd.addEdge(ifEnd);
		
		if(ctx.stat().size() == 2) {
			Node[] elseBodyNodes	= list.get(ctx.stat(1));
			Node elseBodyStart		= elseBodyNodes[0];
			Node elseBodyEnd		= elseBodyNodes.length == 1 ? elseBodyNodes[0] : elseBodyNodes[1];
			
			ifStart.addEdge(elseBodyStart);
			elseBodyEnd.addEdge(ifEnd);
		}
		else {
			ifStart.addEdge(ifEnd);
		}
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
		BottomUpCFGBuilder_PTP builder = new BottomUpCFGBuilder_PTP();
		for (String filename : args) {
			File file = new File(filename);
			System.out.println(filename);
			System.out.println(builder.build(file));
		}
	}
}
