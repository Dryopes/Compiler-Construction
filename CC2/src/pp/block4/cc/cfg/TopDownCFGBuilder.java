package pp.block4.cc.cfg;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Stack;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import pp.block4.cc.ErrorListener;
import pp.block4.cc.cfg.FragmentParser.ProgramContext;

/** Template top-down CFG builder. */
public class TopDownCFGBuilder extends FragmentBaseListener {
	/** The CFG being built. */
	private Graph graph;
	private Stack<Node[]> stack;

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
			ProgramContext tree = parser.program();
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
		this.stack = new Stack<Node[]>();
		
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(this, tree);
		
		return this.graph;
	}	
	
	@Override 
	public void enterProgram(FragmentParser.ProgramContext ctx) {
		Node end = null;
		for(int index = ctx.stat().size()-1; index >= 0; index--) {
			Node node = addNode(ctx.stat(index), "");
			stack.push(new Node[]{node, end});
			end = node;
		}
	}
	
	@Override 
	public void enterBlockStat(@NotNull FragmentParser.BlockStatContext ctx) {
		Node[] nodes = stack.pop();
		if(ctx.stat().isEmpty()) {
			nodes[0].setId(nodestr(ctx, "Empty Block"));
			if(nodes[1] != null)
				nodes[0].addEdge(nodes[1]);
			return;
		}
		
		Node end = nodes[1];
		for(int index = ctx.stat().size()-1; index >= 1; index--) {
			Node node = addNode(ctx.stat(index), "");
			stack.push(new Node[]{node, end});
			end = node;
		}
		stack.push(new Node[]{nodes[0], end});
		
	}
	
	@Override 
	public void enterWhileStat(@NotNull FragmentParser.WhileStatContext ctx) { 
		Node[] nodes = stack.pop();
		nodes[0].setId(nodestr(ctx, "while"));
		
		Node body = addNode(ctx.stat(), "");
		stack.push(new Node[]{body, nodes[0]});
		
		nodes[0].addEdge(body);
		if(nodes[1] != null)
			nodes[0].addEdge(nodes[1]);
		
		//System.out.println("While: " + Arrays.toString(stack.peek()));
	}
	
	@Override
	public void enterAssignStat(@NotNull FragmentParser.AssignStatContext ctx) { 
		Node[] nodes = stack.pop();
		nodes[0].setId(nodestr(ctx, "assigment"));
		
		if(nodes[1] != null)
			nodes[0].addEdge(nodes[1]);
	}
	
	@Override 
	public void enterDecl(@NotNull FragmentParser.DeclContext ctx) {
		Node[] nodes = stack.pop();
		nodes[0].setId(nodestr(ctx, "declaration"));
		
		if(nodes[1] != null)
			nodes[0].addEdge(nodes[1]);
	}

	
	@Override 
	public void enterIfStat(@NotNull FragmentParser.IfStatContext ctx) { 
		Node[] nodes = stack.pop();
		Node end = addNode(ctx, "end of if");
		
		if(ctx.stat().size() == 1) {
			nodes[0].addEdge(end);
		}
		else {
			//Else part
			Node elseNode = addNode(ctx.stat(0), "");
			nodes[0].addEdge(elseNode);
			stack.push(new Node[]{elseNode, end});
		}
		
		//If part
		Node ifNode = addNode(ctx.stat(0), "");
		nodes[0].addEdge(ifNode);
		stack.push(new Node[]{ifNode, end});
		
		if(nodes[1] != null)
			end.addEdge(nodes[1]);
	}
	
	
	

	/** Adds a node to he CGF, based on a given parse tree node.
	 * Gives the CFG node a meaningful ID, consisting of line number and 
	 * a further indicator.
	 */
	private Node addNode(ParserRuleContext node, String text) {
		return this.graph.addNode(nodestr(node, text));
	}
	
	private String nodestr(ParserRuleContext node, String text) {
		int start = node.getStart().getLine();
		int stop = node.getStop().getLine();
		
		//if(start == stop) 
			return start + ": " + text;
		//else
			//return start + "-" + stop + ": " + text;
	}

	/** Main method to build and print the CFG of a simple Java program. */
	public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("Usage: [filename]+");
			return;
		}
		TopDownCFGBuilder builder = new TopDownCFGBuilder();
		for (String filename : args) {
			File file = new File(filename);
			System.out.println(filename);
			System.out.println(builder.build(file));
		}
	}
}
