// Generated from Piet.g4 by ANTLR 4.5
package pp.block3.cc.piet;
package pp.block3.cc.piet;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PietParser}.
 */
public interface PietListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code equal}
	 * labeled alternative in {@link PietParser#piet}.
	 * @param ctx the parse tree
	 */
	void enterEqual(PietParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link PietParser#piet}.
	 * @param ctx the parse tree
	 */
	void exitEqual(PietParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link PietParser#piet}.
	 * @param ctx the parse tree
	 */
	void enterNumber(PietParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link PietParser#piet}.
	 * @param ctx the parse tree
	 */
	void exitNumber(PietParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link PietParser#piet}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(PietParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link PietParser#piet}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(PietParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link PietParser#piet}.
	 * @param ctx the parse tree
	 */
	void enterString(PietParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link PietParser#piet}.
	 * @param ctx the parse tree
	 */
	void exitString(PietParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracket}
	 * labeled alternative in {@link PietParser#piet}.
	 * @param ctx the parse tree
	 */
	void enterBracket(PietParser.BracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracket}
	 * labeled alternative in {@link PietParser#piet}.
	 * @param ctx the parse tree
	 */
	void exitBracket(PietParser.BracketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hat}
	 * labeled alternative in {@link PietParser#piet}.
	 * @param ctx the parse tree
	 */
	void enterHat(PietParser.HatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hat}
	 * labeled alternative in {@link PietParser#piet}.
	 * @param ctx the parse tree
	 */
	void exitHat(PietParser.HatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plus}
	 * labeled alternative in {@link PietParser#piet}.
	 * @param ctx the parse tree
	 */
	void enterPlus(PietParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link PietParser#piet}.
	 * @param ctx the parse tree
	 */
	void exitPlus(PietParser.PlusContext ctx);
}