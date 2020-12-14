// Generated from C:/Users/comta/OneDrive/Ambiente de Trabalho/4ano/TPGCS/GCS_Project\tpCGS.g4 by ANTLR 4.8

    import java.util.HashMap;
    import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link tpCGSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface tpCGSVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link tpCGSParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(tpCGSParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpCGSParser#jsonList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonList(tpCGSParser.JsonListContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpCGSParser#jsonObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonObject(tpCGSParser.JsonObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpCGSParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(tpCGSParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpCGSParser#resOfL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResOfL(tpCGSParser.ResOfLContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpCGSParser#pairKeyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairKeyValue(tpCGSParser.PairKeyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpCGSParser#jsonValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonValue(tpCGSParser.JsonValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpCGSParser#quotedWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedWord(tpCGSParser.QuotedWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpCGSParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(tpCGSParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpCGSParser#conc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConc(tpCGSParser.ConcContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpCGSParser#stu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStu(tpCGSParser.StuContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpCGSParser#res}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRes(tpCGSParser.ResContext ctx);
}