// Generated from PietAttr.g4 by ANTLR 4.5
package pp.block3.cc.piet;

import pp.block3.cc.antlr.Type;

package pp.block3.cc.piet;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PietAttrParser}.
 */
public interface PietAttrListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PietAttrParser#piet}.
	 * @param ctx the parse tree
	 */
	void enterPiet(PietAttrParser.PietContext ctx);
	/**
	 * Exit a parse tree produced by {@link PietAttrParser#piet}.
	 * @param ctx the parse tree
	 */
	void exitPiet(PietAttrParser.PietContext ctx);
}