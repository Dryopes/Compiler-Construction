package pp.block2.cc.antlr;

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

public class SentenceConverter 
		extends SentenceBaseListener implements Parser {
	
	private static final NonTerm SEN = new NonTerm("Sentence");
	private static final NonTerm SUB = new NonTerm("Subject");
	private static final NonTerm MOD = new NonTerm("Modifier");
	private static final NonTerm OBJ = new NonTerm("Object");
	
	private boolean foundError;
	
	private AST resultTree;
	private ParseTreeProperty<AST> asts = new ParseTreeProperty<AST>();
	
	public SentenceConverter() {
		this.fact = new SymbolFactory(Sentence.class);
	}

	/** Factory needed to create terminals of the {@link Sentence}
	 * grammar. See {@link pp.block2.cc.ll.SentenceParser} for
	 * example usage. */
	private final SymbolFactory fact;

	@Override
	public AST parse(Lexer lexer) throws ParseException {
		foundError = false;
		
		SentenceParser parser = new SentenceParser(new CommonTokenStream(lexer));
		ParseTree tree = parser.sentence();
		new ParseTreeWalker().walk(this, tree);
		
		if(foundError) throw new ParseException("WE HAVE FOUND AN ERROR!");
		
		return resultTree;
	}
	
	// From here on overwrite the listener methods
	// Use an appropriate ParseTreeProperty to
	// store the correspondence from nodes to ASTs
	
	/**
	 * Exit a parse tree produced by {@link SentenceParser#sentence}.
	 * @param ctx the parse tree
	 */
	@Override
	public void exitSentence(SentenceParser.SentenceContext ctx) {
		AST ast = new AST(SEN);
		computeChild(ast, ctx);
		resultTree = ast;
	}
	/**
	 * Exit a parse tree produced by {@link SentenceParser#subject}.
	 * @param ctx the parse tree
	 */
	@Override
	public void exitSubject(SentenceParser.SubjectContext ctx) {
		AST ast = new AST(SUB);
		computeChild(ast, ctx);
	}
	/**
	 * Exit a parse tree produced by {@link SentenceParser#object}.
	 * @param ctx the parse tree
	 */
	@Override
	public void exitObject(SentenceParser.ObjectContext ctx) {
		AST ast = new AST(OBJ);
		computeChild(ast, ctx);
	}

	/**
	 * Exit a parse tree produced by {@link SentenceParser#modifier}.
	 * @param ctx the parse tree
	 */
	@Override
	public void exitModifier(SentenceParser.ModifierContext ctx) {
		AST ast = new AST(MOD);
		computeChild(ast, ctx);
	}
	
	@Override
	public void visitTerminal(TerminalNode node) {
		AST terminal = new AST(fact.getTerminals().get(node.getSymbol().getType()), node.getSymbol()); 
		asts.put(node,  terminal);
	}

	@Override
	public void visitErrorNode(ErrorNode node) {
		AST terminal = new AST(fact.getTerminals().get(node.getSymbol().getType()), node.getSymbol()); 
		asts.put(node,  terminal);
		foundError = true;
	}
	
	public void computeChild(AST ast, ParseTree ctx) {
		for(int child = 0; child < ctx.getChildCount(); child++) {
			ast.addChild(asts.get(ctx.getChild(child)));
		}
		asts.put(ctx, ast);
	}
}
