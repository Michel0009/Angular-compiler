// Generated from C:/Users/Michael/Desktop/Compiler/AngularParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularParser#page}.
	 * @param ctx the parse tree
	 */
	void enterPage(AngularParser.PageContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#page}.
	 * @param ctx the parse tree
	 */
	void exitPage(AngularParser.PageContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(AngularParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(AngularParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(AngularParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(AngularParser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void enterComponentBody(AngularParser.ComponentBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void exitComponentBody(AngularParser.ComponentBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentImport}.
	 * @param ctx the parse tree
	 */
	void enterComponentImport(AngularParser.ComponentImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentImport}.
	 * @param ctx the parse tree
	 */
	void exitComponentImport(AngularParser.ComponentImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentStyles}.
	 * @param ctx the parse tree
	 */
	void enterComponentStyles(AngularParser.ComponentStylesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentStyles}.
	 * @param ctx the parse tree
	 */
	void exitComponentStyles(AngularParser.ComponentStylesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#styleElements}.
	 * @param ctx the parse tree
	 */
	void enterStyleElements(AngularParser.StyleElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#styleElements}.
	 * @param ctx the parse tree
	 */
	void exitStyleElements(AngularParser.StyleElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#styleElementsBody}.
	 * @param ctx the parse tree
	 */
	void enterStyleElementsBody(AngularParser.StyleElementsBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#styleElementsBody}.
	 * @param ctx the parse tree
	 */
	void exitStyleElementsBody(AngularParser.StyleElementsBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlBlock}.
	 * @param ctx the parse tree
	 */
	void enterHtmlBlock(AngularParser.HtmlBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlBlock}.
	 * @param ctx the parse tree
	 */
	void exitHtmlBlock(AngularParser.HtmlBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlElementProperties}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElementProperties(AngularParser.HtmlElementPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlElementProperties}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElementProperties(AngularParser.HtmlElementPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlElementContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElementContent(AngularParser.HtmlElementContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlElementContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElementContent(AngularParser.HtmlElementContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#tsxBlock}.
	 * @param ctx the parse tree
	 */
	void enterTsxBlock(AngularParser.TsxBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#tsxBlock}.
	 * @param ctx the parse tree
	 */
	void exitTsxBlock(AngularParser.TsxBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(AngularParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(AngularParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(AngularParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(AngularParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(AngularParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(AngularParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(AngularParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(AngularParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayMethod}.
	 * @param ctx the parse tree
	 */
	void enterArrayMethod(AngularParser.ArrayMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayMethod}.
	 * @param ctx the parse tree
	 */
	void exitArrayMethod(AngularParser.ArrayMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayBody}.
	 * @param ctx the parse tree
	 */
	void enterArrayBody(AngularParser.ArrayBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayBody}.
	 * @param ctx the parse tree
	 */
	void exitArrayBody(AngularParser.ArrayBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(AngularParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(AngularParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectBody}.
	 * @param ctx the parse tree
	 */
	void enterObjectBody(AngularParser.ObjectBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectBody}.
	 * @param ctx the parse tree
	 */
	void exitObjectBody(AngularParser.ObjectBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(AngularParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(AngularParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#stringVar}.
	 * @param ctx the parse tree
	 */
	void enterStringVar(AngularParser.StringVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#stringVar}.
	 * @param ctx the parse tree
	 */
	void exitStringVar(AngularParser.StringVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#boolVar}.
	 * @param ctx the parse tree
	 */
	void enterBoolVar(AngularParser.BoolVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#boolVar}.
	 * @param ctx the parse tree
	 */
	void exitBoolVar(AngularParser.BoolVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#numVar}.
	 * @param ctx the parse tree
	 */
	void enterNumVar(AngularParser.NumVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#numVar}.
	 * @param ctx the parse tree
	 */
	void exitNumVar(AngularParser.NumVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#anyVar}.
	 * @param ctx the parse tree
	 */
	void enterAnyVar(AngularParser.AnyVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#anyVar}.
	 * @param ctx the parse tree
	 */
	void exitAnyVar(AngularParser.AnyVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(AngularParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(AngularParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(AngularParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(AngularParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(AngularParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(AngularParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#bodyStatement}.
	 * @param ctx the parse tree
	 */
	void enterBodyStatement(AngularParser.BodyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#bodyStatement}.
	 * @param ctx the parse tree
	 */
	void exitBodyStatement(AngularParser.BodyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(AngularParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(AngularParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(AngularParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(AngularParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(AngularParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(AngularParser.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(AngularParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(AngularParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#multiOperation}.
	 * @param ctx the parse tree
	 */
	void enterMultiOperation(AngularParser.MultiOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#multiOperation}.
	 * @param ctx the parse tree
	 */
	void exitMultiOperation(AngularParser.MultiOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#console}.
	 * @param ctx the parse tree
	 */
	void enterConsole(AngularParser.ConsoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#console}.
	 * @param ctx the parse tree
	 */
	void exitConsole(AngularParser.ConsoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(AngularParser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(AngularParser.ModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(AngularParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(AngularParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(AngularParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(AngularParser.ConstructorBodyContext ctx);
}