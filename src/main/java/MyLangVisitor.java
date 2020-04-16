// Generated from .\MyLang.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MyLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letIn}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetIn(MyLangParser.LetInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listPushId}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListPushId(MyLangParser.ListPushIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifThenElse}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElse(MyLangParser.IfThenElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listPushList}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListPushList(MyLangParser.ListPushListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code association}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociation(MyLangParser.AssociationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code substraction}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstraction(MyLangParser.SubstractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funDeclaration}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDeclaration(MyLangParser.FunDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDeclaration}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(MyLangParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pair}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(MyLangParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(MyLangParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sequence}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(MyLangParser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code application}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplication(MyLangParser.ApplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleTerm}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTerm(MyLangParser.SimpleTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(MyLangParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code let}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(MyLangParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listPopId}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListPopId(MyLangParser.ListPopIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listPopList}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListPopList(MyLangParser.ListPopListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(MyLangParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addition}
	 * labeled alternative in {@link MyLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(MyLangParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLangParser#simple_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_term(MyLangParser.Simple_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLangParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(MyLangParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLangParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(MyLangParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLangParser#list_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_elements(MyLangParser.List_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLangParser#list_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_element(MyLangParser.List_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLangParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(MyLangParser.ConstantContext ctx);
}