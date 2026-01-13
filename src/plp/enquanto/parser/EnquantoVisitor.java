// Generated from ./src/plp/enquanto/parser/Enquanto.g4 by ANTLR 4.13.1
package plp.enquanto.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EnquantoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EnquantoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EnquantoParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(EnquantoParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnquantoParser#seqComando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqComando(EnquantoParser.SeqComandoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atribuicao}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(EnquantoParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(EnquantoParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code se}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSe(EnquantoParser.SeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code enquanto}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnquanto(EnquantoParser.EnquantoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code escreva}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscreva(EnquantoParser.EscrevaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iteracao}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteracao(EnquantoParser.IteracaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iteracao2}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteracao2(EnquantoParser.Iteracao2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code switchcase}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchcase(EnquantoParser.SwitchcaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bloco}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(EnquantoParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exiba}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExiba(EnquantoParser.ExibaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leia}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeia(EnquantoParser.LeiaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inteiro}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteiro(EnquantoParser.InteiroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opBin}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpBin(EnquantoParser.OpBinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(EnquantoParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expPar}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPar(EnquantoParser.ExpParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eLogico}
	 * labeled alternative in {@link EnquantoParser#booleano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitELogico(EnquantoParser.ELogicoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code naoLogico}
	 * labeled alternative in {@link EnquantoParser#booleano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaoLogico(EnquantoParser.NaoLogicoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opRel}
	 * labeled alternative in {@link EnquantoParser#booleano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpRel(EnquantoParser.OpRelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xor}
	 * labeled alternative in {@link EnquantoParser#booleano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor(EnquantoParser.XorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolPar}
	 * labeled alternative in {@link EnquantoParser#booleano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolPar(EnquantoParser.BoolParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ouLogico}
	 * labeled alternative in {@link EnquantoParser#booleano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuLogico(EnquantoParser.OuLogicoContext ctx);
}