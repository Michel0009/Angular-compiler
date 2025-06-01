// Generated from C:/Users/Michael/Desktop/Compiler/AngularParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngularParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngularParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngularParser#page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage(AngularParser.PageContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(AngularParser.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(AngularParser.ComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentBody(AngularParser.ComponentBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentImport(AngularParser.ComponentImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentStyles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentStyles(AngularParser.ComponentStylesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#styleElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleElements(AngularParser.StyleElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#styleElementsBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleElementsBody(AngularParser.StyleElementsBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlBlock(AngularParser.HtmlBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlElementProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElementProperties(AngularParser.HtmlElementPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlElementContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElementContent(AngularParser.HtmlElementContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#tsxBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsxBlock(AngularParser.TsxBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(AngularParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(AngularParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(AngularParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(AngularParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayMethod(AngularParser.ArrayMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayBody(AngularParser.ArrayBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(AngularParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#objectBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectBody(AngularParser.ObjectBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(AngularParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#stringVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringVar(AngularParser.StringVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#boolVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVar(AngularParser.BoolVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#numVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumVar(AngularParser.NumVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#anyVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyVar(AngularParser.AnyVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(AngularParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(AngularParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(AngularParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#bodyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyStatement(AngularParser.BodyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(AngularParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(AngularParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ifCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCondition(AngularParser.IfConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(AngularParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#multiOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiOperation(AngularParser.MultiOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#console}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsole(AngularParser.ConsoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifiers(AngularParser.ModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(AngularParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(AngularParser.ConstructorBodyContext ctx);
}