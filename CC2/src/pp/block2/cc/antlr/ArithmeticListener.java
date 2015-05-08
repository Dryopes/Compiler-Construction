// Generated from Arithmetic.g4 by ANTLR 4.5
package pp.block2.cc.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArithmeticParser}.
 */
public interface ArithmeticListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(ArithmeticParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(ArithmeticParser.ExpContext ctx);
}