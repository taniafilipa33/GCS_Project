// Generated from C:/Users/comta/OneDrive/Ambiente de Trabalho/4ano/TPGCS/GCS_Project\tpCGS.g4 by ANTLR 4.8

    import java.util.HashMap;
    import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tpCGSParser}.
 */
public interface tpCGSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tpCGSParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(tpCGSParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCGSParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(tpCGSParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCGSParser#jsonList}.
	 * @param ctx the parse tree
	 */
	void enterJsonList(tpCGSParser.JsonListContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCGSParser#jsonList}.
	 * @param ctx the parse tree
	 */
	void exitJsonList(tpCGSParser.JsonListContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCGSParser#jsonObject}.
	 * @param ctx the parse tree
	 */
	void enterJsonObject(tpCGSParser.JsonObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCGSParser#jsonObject}.
	 * @param ctx the parse tree
	 */
	void exitJsonObject(tpCGSParser.JsonObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCGSParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(tpCGSParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCGSParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(tpCGSParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCGSParser#resOfL}.
	 * @param ctx the parse tree
	 */
	void enterResOfL(tpCGSParser.ResOfLContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCGSParser#resOfL}.
	 * @param ctx the parse tree
	 */
	void exitResOfL(tpCGSParser.ResOfLContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCGSParser#pairKeyValue}.
	 * @param ctx the parse tree
	 */
	void enterPairKeyValue(tpCGSParser.PairKeyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCGSParser#pairKeyValue}.
	 * @param ctx the parse tree
	 */
	void exitPairKeyValue(tpCGSParser.PairKeyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCGSParser#jsonValue}.
	 * @param ctx the parse tree
	 */
	void enterJsonValue(tpCGSParser.JsonValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCGSParser#jsonValue}.
	 * @param ctx the parse tree
	 */
	void exitJsonValue(tpCGSParser.JsonValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCGSParser#quotedWord}.
	 * @param ctx the parse tree
	 */
	void enterQuotedWord(tpCGSParser.QuotedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCGSParser#quotedWord}.
	 * @param ctx the parse tree
	 */
	void exitQuotedWord(tpCGSParser.QuotedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCGSParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(tpCGSParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCGSParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(tpCGSParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCGSParser#conc}.
	 * @param ctx the parse tree
	 */
	void enterConc(tpCGSParser.ConcContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCGSParser#conc}.
	 * @param ctx the parse tree
	 */
	void exitConc(tpCGSParser.ConcContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCGSParser#stu}.
	 * @param ctx the parse tree
	 */
	void enterStu(tpCGSParser.StuContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCGSParser#stu}.
	 * @param ctx the parse tree
	 */
	void exitStu(tpCGSParser.StuContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCGSParser#res}.
	 * @param ctx the parse tree
	 */
	void enterRes(tpCGSParser.ResContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCGSParser#res}.
	 * @param ctx the parse tree
	 */
	void exitRes(tpCGSParser.ResContext ctx);
}