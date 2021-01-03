// Generated from C:/Users/comta/OneDrive/Ambiente de Trabalho/4ano/TPGCS/GCS_Project\tpCGS.g4 by ANTLR 4.9

    import java.util.HashMap;
    import java.util.ArrayList;


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tpCGSParser}.
 */
public interface tpCGSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tpCGSParser#sistema}.
	 * @param ctx the parse tree
	 */
	void enterSistema(tpCGSParser.SistemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCGSParser#sistema}.
	 * @param ctx the parse tree
	 */
	void exitSistema(tpCGSParser.SistemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCGSParser#entityList}.
	 * @param ctx the parse tree
	 */
	void enterEntityList(tpCGSParser.EntityListContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCGSParser#entityList}.
	 * @param ctx the parse tree
	 */
	void exitEntityList(tpCGSParser.EntityListContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCGSParser#entityObject}.
	 * @param ctx the parse tree
	 */
	void enterEntityObject(tpCGSParser.EntityObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCGSParser#entityObject}.
	 * @param ctx the parse tree
	 */
	void exitEntityObject(tpCGSParser.EntityObjectContext ctx);
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
	 * Enter a parse tree produced by {@link tpCGSParser#entityValue}.
	 * @param ctx the parse tree
	 */
	void enterEntityValue(tpCGSParser.EntityValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCGSParser#entityValue}.
	 * @param ctx the parse tree
	 */
	void exitEntityValue(tpCGSParser.EntityValueContext ctx);
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
	 * Enter a parse tree produced by {@link tpCGSParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(tpCGSParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCGSParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(tpCGSParser.WordContext ctx);
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