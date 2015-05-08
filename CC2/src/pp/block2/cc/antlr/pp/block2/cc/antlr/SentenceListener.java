// Generated from Sentence.g4 by ANTLR 4.5
package pp.block2.cc.antlr;
package pp.block2.cc.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SentenceParser}.
 */
public interface SentenceListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SentenceParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(SentenceParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SentenceParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(SentenceParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modSubject}
	 * labeled alternative in {@link SentenceParser#subject}.
	 * @param ctx the parse tree
	 */
	void enterModSubject(SentenceParser.ModSubjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modSubject}
	 * labeled alternative in {@link SentenceParser#subject}.
	 * @param ctx the parse tree
	 */
	void exitModSubject(SentenceParser.ModSubjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleSubject}
	 * labeled alternative in {@link SentenceParser#subject}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSubject(SentenceParser.SimpleSubjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleSubject}
	 * labeled alternative in {@link SentenceParser#subject}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSubject(SentenceParser.SimpleSubjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SentenceParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(SentenceParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SentenceParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(SentenceParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SentenceParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(SentenceParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SentenceParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(SentenceParser.ModifierContext ctx);
}