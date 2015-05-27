package pp.block5.cc.antlr;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import pp.block5.cc.ErrorListener;
import pp.block5.cc.ParseException;

/** Prettyprints a (number, word)-sentence and sums up the numbers. */
public class NumWordProcessor extends NumWordBaseVisitor<Integer> {
	public static void main(String[] args) {
		NumWordProcessor grouper = new NumWordProcessor();
		if (args.length == 0) {
			process(grouper, "1sock2shoes 3 holes");
			process(grouper, "3 strands 10 blocks 11 weeks 15 credits");
			process(grouper, "1 2 3");
		} else {
			for (String text : args) {
				process(grouper, text);
			}
		}
	}

	private static void process(NumWordProcessor grouper, String text) {
		try {
			System.out.printf("Processing '%s':%n", text);
			int result = grouper.group(text);
			System.out.println("Total: " + result);
		} catch (ParseException exc) {
			exc.print();
		}
	}

	/** Groups a given sentence and prints it to stdout.
	 * Returns the sum of the numbers in the sentence.
	 */
	public int group(String text) throws ParseException {
		CharStream chars = new ANTLRInputStream(text);
		ErrorListener listener = new ErrorListener();
		Lexer lexer = new NumWordLexer(chars);
		lexer.removeErrorListeners();
		lexer.addErrorListener(listener);
		TokenStream tokens = new CommonTokenStream(lexer);
		NumWordParser parser = new NumWordParser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(listener);
		ParseTree tree = parser.sentence();
		listener.throwException();
		return visit(tree);
	}

	// Override the visitor methods.
	// Each visitor method should call visit(child)
	// if and when it wants to visit that child node.
	
	@Override public Integer visitSentence(NumWordParser.SentenceContext ctx) { 
		if (ctx.number().size() - 1 == 1){
			int tmp = visitNumber(ctx.number(0));
			System.out.print(" ");
			visitWord(ctx.word(0));
			System.out.println();

			return tmp;
		}
		int result = 0;
			for (int i = 0; i < ctx.number().size()-2; i++){
				result += visitNumber(ctx.number(i));
				System.out.print(" ");
				visitWord(ctx.word(i));
				System.out.print(", ");
			}
			result += visitNumber(ctx.number(ctx.number().size()-2));
			System.out.print(" ");
			visitWord(ctx.word(ctx.word().size()-2));
			
			System.out.print(" and ");
			
			result += visitNumber(ctx.number(ctx.number().size()-1));
			System.out.print(" ");
			visitWord(ctx.word(ctx.word().size()-1));
			System.out.println();
			return result;
			
			
		}

	@Override public Integer visitNumber(NumWordParser.NumberContext ctx) { 
			System.out.print(ctx.NUMBER().getText());
			return Integer.parseInt(ctx.NUMBER().getText()); 
		}

	@Override public Integer visitWord(NumWordParser.WordContext ctx) { 
			System.out.print(ctx.WORD().getText());
			return 0; 
		}

		
	
}
