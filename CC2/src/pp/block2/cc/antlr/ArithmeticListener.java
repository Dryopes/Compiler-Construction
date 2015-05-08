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
	 * Enter a parse tree produced by the {@code op2}
	 * labeled alternative in {@link ArithmeticParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOp2(ArithmeticParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code op2}
	 * labeled alternative in {@link ArithmeticParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOp2(ArithmeticParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link ArithmeticParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ArithmeticParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link ArithmeticParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ArithmeticParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code op1}
	 * labeled alternative in {@link ArithmeticParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOp1(ArithmeticParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code op1}
	 * labeled alternative in {@link ArithmeticParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOp1(ArithmeticParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code op3}
	 * labeled alternative in {@link ArithmeticParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOp3(ArithmeticParser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code op3}
	 * labeled alternative in {@link ArithmeticParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOp3(ArithmeticParser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code negate}
	 * labeled alternative in {@link ArithmeticParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNegate(ArithmeticParser.NegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negate}
	 * labeled alternative in {@link ArithmeticParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNegate(ArithmeticParser.NegateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code brac}
	 * labeled alternative in {@link ArithmeticParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBrac(ArithmeticParser.BracContext ctx);
	/**
	 * Exit a parse tree produced by the {@code brac}
	 * labeled alternative in {@link ArithmeticParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBrac(ArithmeticParser.BracContext ctx);
}