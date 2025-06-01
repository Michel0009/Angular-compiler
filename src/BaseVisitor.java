
import classes.*;
import classes.Class;
import gen.AngularParser;
import gen.AngularParserBaseVisitor;

import java.util.ArrayList;


public class BaseVisitor extends AngularParserBaseVisitor {

    SymbolTable symbolTable = new SymbolTable();
    ArrayList<String> scopeStack = new ArrayList<>();
    int scopeCounter = 0;

    @Override
    public StyleElementsBody visitStyleElementsBody(AngularParser.StyleElementsBodyContext ctx) {
        StyleElementsBody styleElementsBody = new StyleElementsBody();

        styleElementsBody.setStyleProperty(ctx.IDENTIFIER().get(0).getText());

        if (ctx.NUMBER_VALUE() != null) {
            styleElementsBody.setStyleValueNumber(Integer.parseInt(ctx.NUMBER_VALUE().getText()));

            if (ctx.IDENTIFIER().size() > 1) {
                styleElementsBody.setMeasure(ctx.IDENTIFIER().get(1).getText());

            }
        } else {
            styleElementsBody.setStyleValueIdentifier(ctx.IDENTIFIER().get(1).getText());
        }
        if (ctx.MODULUS() != null) {
            styleElementsBody.setMODULUS(ctx.MODULUS().getText());
        }

        return styleElementsBody;
    }


    @Override
    public HtmlBlock visitHtmlBlock(AngularParser.HtmlBlockContext ctx) {
        HtmlBlock htmlBlock = new HtmlBlock();
        for (int i = 0; i < ctx.htmlElement().size(); i++) {
            if (ctx.htmlElement().get(i) != null) {
                htmlBlock.getHtml_elements_list().add(visitHtmlElement(ctx.htmlElement().get(i)));
            }
        }
        return htmlBlock;
    }


    @Override
    public HtmlElement visitHtmlElement(AngularParser.HtmlElementContext ctx) {
        HtmlElement htmlElement = new HtmlElement();
        if (ctx.IDENTIFIER().get(0) != null) {
            htmlElement.setOpenTagName(ctx.IDENTIFIER().get(0).getText());
        }

        if (ctx.STRING_VALUE() != null) {
            htmlElement.setHtmlPropertyValue(ctx.STRING_VALUE().getText());
            if (ctx.CLASS() != null) {
                htmlElement.setHtmlClass(ctx.CLASS().getText());
            } else {
                htmlElement.setHtmlProperty(ctx.IDENTIFIER().get(1).getText());
            }
        }
        if (!ctx.htmlElementProperties().isEmpty()) {
            for (int i = 0; i < ctx.htmlElementProperties().size(); i++) {
                if (ctx.htmlElementProperties().get(i) != null) {
                    htmlElement.getHtmlElementProperties().add(visitHtmlElementProperties(ctx.htmlElementProperties().get(i)));
                }
            }
        }
        if (!ctx.forStatement().isEmpty()) {
            for (int i = 0; i < ctx.forStatement().size(); i++) {
                if (ctx.forStatement().get(i) != null) {
                    htmlElement.getForStatements().add(visitForStatement(ctx.forStatement().get(i)));
                }
            }
        }
        if (!ctx.ifStatement().isEmpty()) {
            for (int i = 0; i < ctx.ifStatement().size(); i++) {
                if (ctx.ifStatement().get(i) != null) {
                    htmlElement.getIfStatements().add(visitIfStatement(ctx.ifStatement().get(i)));
                }
            }
        }
        if (!ctx.htmlElementContent().isEmpty()) {
            for (int i = 0; i < ctx.htmlElementContent().size(); i++) {
                if (ctx.htmlElementContent().get(i) != null) {
                    htmlElement.getHtmlElementContents().add(visitHtmlElementContent(ctx.htmlElementContent().get(i)));
                }
            }
        }
        if (ctx.GREATER_THAN().size() > 1 && ctx.STRING_VALUE() != null && ctx.CLASS() == null) {
            htmlElement.setCloseTagName(ctx.IDENTIFIER().get(2).getText());

        } else if (ctx.GREATER_THAN().size() > 1 && ctx.STRING_VALUE() != null && ctx.CLASS() != null) {
            htmlElement.setCloseTagName(ctx.IDENTIFIER().get(1).getText());
        }
        return htmlElement;
    }


    @Override
    public HtmlElementProperties visitHtmlElementProperties(AngularParser.HtmlElementPropertiesContext ctx) {
        HtmlElementProperties htmlElementProperties = new HtmlElementProperties();

        htmlElementProperties.setHtmlProperty(ctx.IDENTIFIER().getText());
        htmlElementProperties.setEventPropertyValue(ctx.STRING_VALUE().getText());

        return htmlElementProperties;
    }


    @Override
    public HtmlElementContent visitHtmlElementContent(AngularParser.HtmlElementContentContext ctx) {
        HtmlElementContent htmlElementContent = new HtmlElementContent();
        if (ctx.IDENTIFIER() != null) {
            htmlElementContent.setContent(ctx.IDENTIFIER().getText());

        } else if (ctx.htmlElement() != null) {
            htmlElementContent.setHtmlElement(visitHtmlElement(ctx.htmlElement()));
        } else {
            htmlElementContent.setTsxBlock(visitTsxBlock(ctx.tsxBlock()));
        }
        return htmlElementContent;
    }


    @Override
    public TsxBlock visitTsxBlock(AngularParser.TsxBlockContext ctx) {
        TsxBlock tsxBlock = new TsxBlock();

        tsxBlock.setVariable(ctx.IDENTIFIER().get(0).getText());

        if (!ctx.DOT().isEmpty()) {
            for (int i = 1; i < ctx.IDENTIFIER().size(); i++) {
                if (ctx.IDENTIFIER().get(i) != null) {
                    tsxBlock.getReferensedVariables().add(ctx.IDENTIFIER().get(i).getText());

                }
            }
        }

        if (ctx.operation() != null) {
            tsxBlock.setOperation(visitOperation(ctx.operation()));
        }
        if (ctx.NUMBER_VALUE() != null) {
            tsxBlock.setNumber(Integer.parseInt(ctx.NUMBER_VALUE().getText()));

        }
        return tsxBlock;
    }


    @Override
    public Operation visitOperation(AngularParser.OperationContext ctx) {
        Operation operation = new Operation();

        if (ctx.PLUS() != null) {
            operation.setPlus(ctx.PLUS().getText());
        }
        if (ctx.MINUS() != null) {
            operation.setMinus(ctx.MINUS().getText());
        }
        if (ctx.MULTIPLY() != null) {
            operation.setMultiply(ctx.MULTIPLY().getText());
        }
        if (ctx.DIVIDE() != null) {
            operation.setDivide(ctx.DIVIDE().getText());
        }

        return operation;
    }


    @Override
    public ForStatement visitForStatement(AngularParser.ForStatementContext ctx) {
        ForStatement forStatement = new ForStatement();

        forStatement.setElement(ctx.IDENTIFIER().get(0).getText());
        forStatement.setElementList(ctx.IDENTIFIER().get(1).getText());
        forStatement.setTrackedElement(ctx.IDENTIFIER().get(2).getText());


        if (!ctx.htmlElement().isEmpty()) {
            for (int i = 0; i < ctx.htmlElement().size(); i++) {
                if (ctx.htmlElement().get(i) != null) {
                    forStatement.getHtml_elements_list().add(visitHtmlElement(ctx.htmlElement().get(i)));
                }
            }
        }

        return forStatement;
    }


    @Override
    public IfStatement visitIfStatement(AngularParser.IfStatementContext ctx) {
        IfStatement ifStatement = new IfStatement();

        ifStatement.setCondition(visitCondition(ctx.condition().get(0)));

        if (ctx.condition().size() > 1) {
            for (int i = 1; i < ctx.condition().size(); i++) {
                if (ctx.condition().get(i) != null) {
                    ifStatement.getConditions_list().add(visitCondition(ctx.condition().get(i)));
                }
            }
        }


        if (!ctx.htmlElement().isEmpty()) {
            for (int i = 0; i < ctx.htmlElement().size(); i++) {
                if (ctx.htmlElement().get(i) != null) {
                    ifStatement.getHtml_elements_list().add(visitHtmlElement(ctx.htmlElement().get(i)));
                }
            }
        }

        return ifStatement;
    }


    @Override
    public Class visitClass(AngularParser.ClassContext ctx) {
        String className = ctx.IDENTIFIER().get(0).getText();
        scopeStack.add(className);

        Class aClass = new Class();

        aClass.setClassName(ctx.IDENTIFIER().get(0).getText());
        Row row = new Row();
        row.setType("class name");
        row.setValue(aClass.getClassName());
        this.symbolTable.getRows().add(row);

        if (ctx.EXTENDS() != null) {
            aClass.setClassRelation(ctx.EXTENDS().getText());

        } else if (ctx.IMPLEMENTS() != null) {
            aClass.setClassRelation(ctx.IMPLEMENTS().getText());

        }
        if (ctx.IDENTIFIER().size() > 1) {
            aClass.setFatherClassName(ctx.IDENTIFIER().get(1).getText());
        }

        if (!ctx.classBody().isEmpty()) {
            for (int i = 0; i < ctx.classBody().size(); i++) {
                if (ctx.classBody().get(i) != null) {
                    aClass.getClassBodies().add(visitClassBody(ctx.classBody().get(i)));
                }
            }
        }
        scopeStack.remove(scopeStack.size() - 1);
        return aClass;
    }


    @Override
    public Return visitReturn(AngularParser.ReturnContext ctx) {
        Return return0 = new Return();
        Row row = new Row();
        Row row1 = new Row();
        if (ctx.STRING_VALUE() != null) {
            return0.setStringReturn(ctx.STRING_VALUE().getText());
            row.setType("return value");
            row.setValue(return0.getStringReturn());
            row1.setType("return type");
            row1.setValue("string");
        } else if (ctx.NUMBER_VALUE() != null) {
            return0.setNumberReturn(Integer.parseInt(ctx.NUMBER_VALUE().getText()));
            row.setType("return value");
            row.setValue(String.valueOf(return0.getNumberReturn()));
            row1.setType("return type");
            row1.setValue("number");
        } else if (ctx.BOOLEAN_VALUE() != null) {
            return0.setBooleanReturn(Boolean.parseBoolean(ctx.BOOLEAN_VALUE().getText()));
            row.setType("return value");
            row.setValue(String.valueOf(return0.isBooleanReturn()));
            row1.setType("return type");
            row1.setValue("boolean");
        }
        if (row.getType() != null) {
            symbolTable.getRows().add(row);
        }
        if (row1.getType() != null){
            symbolTable.getRows().add(row1);
        }
        return0.setReturnWord(ctx.RETURN().getText());
        return return0;
    }

    @Override
    public IfCondition visitIfCondition(AngularParser.IfConditionContext ctx) {
        scopeCounter++;
        scopeStack.add("if@" + scopeCounter);
        IfCondition ifCondition = new IfCondition();
        if (!ctx.condition().isEmpty()) {
            for (int i = 0; i < ctx.condition().size(); i++) {
                if (ctx.condition().get(i) != null) {
                    ifCondition.getConditions().add(visitCondition(ctx.condition().get(i)));
                }
            }
        }
        if (!ctx.bodyStatement().isEmpty()) {
            for (int i = 0; i < ctx.bodyStatement().size(); i++) {
                if (ctx.bodyStatement().get(i) != null) {
                    ifCondition.getBodyStatements().add(visitBodyStatement(ctx.bodyStatement().get(i)));
                }
            }
        }
        scopeStack.remove(scopeStack.size() - 1);
        return ifCondition;
    }

    @Override
    public Condition visitCondition(AngularParser.ConditionContext ctx) {
        Condition condition = new Condition();
        if (ctx.functionCall() == null) {
            condition.setConditionElement1(ctx.IDENTIFIER().get(0).getText());

        } else {
            condition.setFunctionCall(visitFunctionCall(ctx.functionCall()));
        }


        if (ctx.EQUAL() != null) {
            condition.setOperator(ctx.EQUAL().getText());
        } else if (ctx.NOT_EQUAL() != null) {
            condition.setOperator(ctx.NOT_EQUAL().getText());
        } else if (ctx.LESS_THAN() != null) {
            condition.setOperator(ctx.LESS_THAN().getText());
        } else if (ctx.GREATER_THAN() != null) {
            condition.setOperator(ctx.GREATER_THAN().getText());
        } else if (ctx.EQUALS_OR_LESS_THAN() != null) {
            condition.setOperator(ctx.EQUALS_OR_LESS_THAN().getText());
        } else if (ctx.EQAULS_OR_GREATER_THAN() != null) {
            condition.setOperator(ctx.EQAULS_OR_GREATER_THAN().getText());
        }


        if (ctx.STRING_VALUE() != null) {
            condition.setConditionString(ctx.STRING_VALUE().getText());

        } else if (ctx.NUMBER_VALUE() != null) {
            condition.setConditionNumber(Integer.parseInt(ctx.NUMBER_VALUE().getText()));
        } else if (ctx.BOOLEAN_VALUE() != null) {
            condition.setConditionBoolean(Boolean.parseBoolean(ctx.BOOLEAN_VALUE().getText()));
        }
        if (ctx.NOT_EQUAL() != null || ctx.NOT_EQUAL() != null || ctx.LESS_THAN() != null || ctx.GREATER_THAN() != null || ctx.EQUALS_OR_LESS_THAN() != null || ctx.EQAULS_OR_GREATER_THAN() != null) {
            if (ctx.BOOLEAN_VALUE() == null && ctx.NUMBER_VALUE() == null && ctx.STRING_VALUE() == null) {
                if (ctx.functionCall() != null) {
                    condition.setConditionElement2(ctx.IDENTIFIER().get(0).getText());
                } else {
                    condition.setConditionElement2(ctx.IDENTIFIER().get(1).getText());

                }
            }
        }

        return condition;
    }

    @Override
    public MultiOperation visitMultiOperation(AngularParser.MultiOperationContext ctx) {
        MultiOperation multiOperation = new MultiOperation();
        if (ctx.INCREASE() != null) {
            multiOperation.setOperation1(ctx.INCREASE().getText());
        } else if (ctx.DECREASE() != null) {
            multiOperation.setOperation1(ctx.DECREASE().getText());
        } else {
            if (ctx.MULTIPLICATION_ASSIGNMENT() != null) {
                multiOperation.setOperation2(ctx.MULTIPLICATION_ASSIGNMENT().getText());
            } else if (ctx.DIVISION_ASSIGNMENT() != null) {
                multiOperation.setOperation2(ctx.DIVISION_ASSIGNMENT().getText());
            } else if (ctx.ADDITION_ASSIGNMENT() != null) {
                multiOperation.setOperation2(ctx.ADDITION_ASSIGNMENT().getText());
            } else {
                multiOperation.setOperation2(ctx.SUBTRACTION_ASSIGNMENT().getText());
            }

            if (ctx.NUMBER_VALUE() != null) {
                multiOperation.setOperationNumber(Integer.parseInt(ctx.NUMBER_VALUE().getText()));
            } else {
                multiOperation.setOperationVariable(ctx.IDENTIFIER().getText());
            }
        }

        return multiOperation;
    }

    @Override
    public Console visitConsole(AngularParser.ConsoleContext ctx) {
        Console console = new Console();
        if (ctx.PLUS().isEmpty()) {
            if (!ctx.STRING_VALUE().isEmpty()) {
                console.getStringStatements().add(ctx.STRING_VALUE().get(0).getText());

            } else if (!ctx.functionCall().isEmpty()) {
                console.getFunctionCalls().add(visitFunctionCall(ctx.functionCall().get(0)));
            } else {
                console.getVariableStatements().add(ctx.IDENTIFIER().get(0).getText());

            }
        } else {
            console.setPlus(ctx.PLUS().get(0).getText());
            for (int i = 0; i < ctx.STRING_VALUE().size(); i++) {
                if (ctx.STRING_VALUE().get(i) != null) {
                    console.getStringStatements().add(ctx.STRING_VALUE().get(i).getText());

                }
            }
            for (int i = 0; i < ctx.functionCall().size(); i++) {
                if (ctx.functionCall().get(i) != null) {
                    console.getFunctionCalls().add(visitFunctionCall(ctx.functionCall().get(i)));
                }
            }
            for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
                if (ctx.IDENTIFIER().get(i) != null) {
                    console.getVariableStatements().add(ctx.IDENTIFIER().get(i).getText());

                }
            }
        }

        return console;
    }

    @Override
    public Modifiers visitModifiers(AngularParser.ModifiersContext ctx) {
        Modifiers modifiers = new Modifiers();
        if (ctx.PUBLIC() != null) {
            modifiers.setModifier(ctx.PUBLIC().getText());
        } else if (ctx.PRIVATE() != null) {
            modifiers.setModifier(ctx.PRIVATE().getText());
        } else if (ctx.PROTECTED() != null) {
            modifiers.setModifier(ctx.PROTECTED().getText());
        } else {
            modifiers.setModifier(ctx.READ_ONLY().getText());
        }

        return modifiers;
    }

    @Override
    public Constructor visitConstructor(AngularParser.ConstructorContext ctx) {
        scopeStack.add("Constructor");
        Constructor constructor = new Constructor();
        if (!ctx.parameter().isEmpty()) {
            for (int i = 0; i < ctx.parameter().size(); i++) {
                if (ctx.parameter().get(i) != null) {
                    constructor.getParameters().add(visitParameter(ctx.parameter().get(i)));
                }
            }
        }
        if (!ctx.constructorBody().isEmpty()) {
            for (int i = 0; i < ctx.constructorBody().size(); i++) {
                if (ctx.parameter().get(i) != null) {
                    constructor.getConstructorBodies().add(visitConstructorBody(ctx.constructorBody().get(i)));
                }
            }
        }
        scopeStack.remove(scopeStack.size() - 1);
        return constructor;
    }

    @Override
    public ConstructorBody visitConstructorBody(AngularParser.ConstructorBodyContext ctx) {
        Row row = new Row();
        Row row1 = new Row();
        Row row2 = new Row();
        String currentScope = String.join(".", scopeStack);
        ConstructorBody constructorBody = new ConstructorBody();
        if (ctx.ASSIGN() != null) {
            constructorBody.setAssignOperator(ctx.ASSIGN().getText());
            constructorBody.setVariable(ctx.IDENTIFIER().getText());
            row.setType("variable modification");
            row.setScope(currentScope);
            row.setValue(constructorBody.getVariable());
            if (ctx.STRING_VALUE() != null) {
                constructorBody.setStringAssignment(ctx.STRING_VALUE().getText());
                row1.setType("variable value");
                row1.setValue(constructorBody.getStringAssignment());
            } else if (ctx.BOOLEAN_VALUE() != null) {
                constructorBody.setBooleanAssignment(Boolean.parseBoolean(ctx.BOOLEAN_VALUE().getText()));
                row1.setType("variable value");
                row1.setValue(String.valueOf(constructorBody.getBooleanAssignment()));
            } else if (ctx.NUMBER_VALUE() != null) {
                constructorBody.setNumberAssignment(Integer.parseInt(ctx.NUMBER_VALUE().getText()));
                row1.setType("variable value");
                row1.setValue(String.valueOf(constructorBody.getNumberAssignment()));
            } else {
                constructorBody.setFunctionCallAssignment(visitFunctionCall(ctx.functionCall()));
            }
        } else if (ctx.multiOperation() != null) {
            constructorBody.setVariable(ctx.IDENTIFIER().getText());
            row2.setType("variable modification");
            row2.setValue(constructorBody.getVariable());
            symbolTable.getRows().add(row2);
            constructorBody.setMultiOperation(visitMultiOperation(ctx.multiOperation()));

        } else if (ctx.array() != null) {
            constructorBody.setArray(visitArray(ctx.array()));
        } else if (ctx.var() != null) {
            constructorBody.setVar(visitVar(ctx.var()));
        } else if (ctx.functionCall() != null) {
            constructorBody.setFunctionCallAssignment(visitFunctionCall(ctx.functionCall()));
        } else if (ctx.forLoop() != null) {
            constructorBody.setForLoop(visitForLoop(ctx.forLoop()));
        } else if (ctx.ifCondition() != null) {
            constructorBody.setIfCondition(visitIfCondition(ctx.ifCondition()));
        } else {
            constructorBody.setConsole(visitConsole(ctx.console()));
        }
        if (row.getType() != null) {
            symbolTable.getRows().add(row);
        }
        if (row1.getType() != null) {
            symbolTable.getRows().add(row1);
        }
        return constructorBody;
    }

    @Override
    public StringVar visitStringVar(AngularParser.StringVarContext ctx) {
        StringVar stringVar = new StringVar();
        String currentScope = String.join(".", scopeStack);

        Row row1 = new Row();

        if (ctx.CONST() != null) {
            stringVar.setVariableType(ctx.CONST().getText());
        } else if (ctx.LET() != null) {
            stringVar.setVariableType(ctx.LET().getText());
        } else if (ctx.VAR() != null) {
            stringVar.setVariableType(ctx.VAR().getText());
        }


        stringVar.setVariableName(ctx.IDENTIFIER().getText());
        row1.setType("variable name");
        row1.setValue(stringVar.getVariableName());
        row1.setScope(currentScope);
        symbolTable.getRows().add(row1);

        return stringVar;
    }

    @Override
    public BoolVar visitBoolVar(AngularParser.BoolVarContext ctx) {
        BoolVar boolVar = new BoolVar();
        String currentScope = String.join(".", scopeStack);

        Row row1 = new Row();

        if (ctx.CONST() != null) {
            boolVar.setVariableType(ctx.CONST().getText());
        } else if (ctx.LET() != null) {
            boolVar.setVariableType(ctx.LET().getText());
        } else if (ctx.VAR() != null) {
            boolVar.setVariableType(ctx.VAR().getText());
        }


        boolVar.setVariableName(ctx.IDENTIFIER().getText());
        row1.setType("variable name");
        row1.setValue(boolVar.getVariableName());
        row1.setScope(currentScope);
        symbolTable.getRows().add(row1);

        return boolVar;
    }

    @Override
    public NumVar visitNumVar(AngularParser.NumVarContext ctx) {
        NumVar numVar = new NumVar();
        String currentScope = String.join(".", scopeStack);

        Row row1 = new Row();

        if (ctx.CONST() != null) {
            numVar.setVariableType(ctx.CONST().getText());
        } else if (ctx.LET() != null) {
            numVar.setVariableType(ctx.LET().getText());
        } else if (ctx.VAR() != null) {
            numVar.setVariableType(ctx.VAR().getText());
        }

        numVar.setVariableName(ctx.IDENTIFIER().getText());
        row1.setType("variable name");
        row1.setValue(numVar.getVariableName());
        row1.setScope(currentScope);

        symbolTable.getRows().add(row1);

        return numVar;
    }

    @Override
    public AnyVar visitAnyVar(AngularParser.AnyVarContext ctx) {
        AnyVar anyVar = new AnyVar();
        String currentScope = String.join(".", scopeStack);

        Row row1 = new Row();  // variable name

        // variable type
        if (ctx.CONST() != null) {
            anyVar.setVariableType(ctx.CONST().getText());
        } else if (ctx.LET() != null) {
            anyVar.setVariableType(ctx.LET().getText());
        } else if (ctx.VAR() != null) {
            anyVar.setVariableType(ctx.VAR().getText());
        }

        // variable name
        String varName = ctx.IDENTIFIER().getText();
        anyVar.setVariableName(varName);

        row1.setType("variable name");
        row1.setValue(anyVar.getVariableName());
        row1.setScope(currentScope);
        symbolTable.getRows().add(row1);

        // variable value
        if (ctx.STRING_VALUE() != null) {
            anyVar.setVariableStringValue(ctx.STRING_VALUE().getText());

        } else if (ctx.BOOLEAN_VALUE() != null) {
            anyVar.setVariableBooleanValue(Boolean.parseBoolean(ctx.BOOLEAN_VALUE().getText()));

        } else if (ctx.NUMBER_VALUE() != null) {
            anyVar.setVariableNumberValue(Integer.parseInt(ctx.NUMBER_VALUE().getText()));

        } else if (ctx.NULL() != null) {
            anyVar.setVariableNullValue(ctx.NULL().getText());

        }


        return anyVar;
    }


    @Override
    public Function visitFunction(AngularParser.FunctionContext ctx) {
        Function function = new Function();
        String functionName = ctx.IDENTIFIER().getText();

        String currentScope = String.join(".", scopeStack);
        scopeStack.add(functionName);

        function.setFunctionName(ctx.IDENTIFIER().getText());
        Row row = new Row();
        Row row1 = new Row();
        row.setType("function");
        row.setValue(function.getFunctionName());
        row.setScope(currentScope);
        symbolTable.getRows().add(row);
        if (!ctx.parameter().isEmpty()) {
            for (int i = 0; i < ctx.parameter().size(); i++) {
                if (ctx.parameter().get(i) != null) {
                    function.getParameters().add(visitParameter(ctx.parameter().get(i)));
                }
            }
        }

        if (ctx.dataType() != null) {
            function.setReturnType(visitDataType(ctx.dataType()));
        }
        if (ctx.VOID()!=null){
            function.setVoidType(ctx.VOID().getText());
            row1.setType("data type");
            row1.setValue(function.getVoidType());
            symbolTable.getRows().add(row1);
        }
        if (!ctx.bodyStatement().isEmpty()) {
            for (int i = 0; i < ctx.bodyStatement().size(); i++) {
                if (ctx.bodyStatement().get(i) != null) {
                    function.getBodyStatements().add(visitBodyStatement(ctx.bodyStatement().get(i)));
                }
            }
        }

        scopeStack.remove(scopeStack.size() - 1);


        return function;
    }

    @Override
    public Parameter visitParameter(AngularParser.ParameterContext ctx) {
        Parameter parameter = new Parameter();
        String currentScope = String.join(".", scopeStack);

        parameter.setParameterName(ctx.IDENTIFIER().getText());

        Row row = new Row();
        row.setType("parameter");
        row.setValue(parameter.getParameterName());
        row.setScope(currentScope);
        symbolTable.getRows().add(row);

        parameter.setDataType(visitDataType(ctx.dataType()));

        return parameter;
    }

    @Override
    public DataType visitDataType(AngularParser.DataTypeContext ctx) {
        DataType dataType = new DataType();
        Row row = new Row();

        if (ctx.STRING() != null) {
            dataType.setDataTypeName(ctx.STRING().getText());
        } else if (ctx.BOOLEAN() != null) {
            dataType.setDataTypeName(ctx.BOOLEAN().getText());
        } else if (ctx.NUMBER() != null) {
            dataType.setDataTypeName(ctx.NUMBER().getText());
        } else if (ctx.ANY() != null) {
            dataType.setDataTypeName(ctx.ANY().getText());
        }

        if (dataType.getDataTypeName() != null) {
            row.setType("data type");
            row.setValue(dataType.getDataTypeName());
            symbolTable.getRows().add(row);
        }

        return dataType;
    }

    @Override
    public BodyStatement visitBodyStatement(AngularParser.BodyStatementContext ctx) {
        BodyStatement bodyStatement = new BodyStatement();
        String currentScope = String.join(".", scopeStack);

        Row row = new Row();
        if (ctx.ASSIGN() != null) {
            bodyStatement.setAssign(ctx.ASSIGN().getText());
        }
        if (!ctx.IDENTIFIER().isEmpty()) {
            bodyStatement.setVariableName(ctx.IDENTIFIER().get(0).getText());
            row.setType("variable modification");
            row.setValue(bodyStatement.getVariableName());
            row.setScope(currentScope);
            symbolTable.getRows().add(row);

            if (ctx.IDENTIFIER().size() > 1) {
                bodyStatement.setSecondVariable(ctx.IDENTIFIER().get(1).getText());

            } else if (ctx.NUMBER_VALUE() != null) {
                bodyStatement.setVariableNumberValue(Integer.parseInt(ctx.NUMBER_VALUE().getText()));

            } else if (ctx.BOOLEAN_VALUE() != null) {
                bodyStatement.setVariableBooleanValue(Boolean.parseBoolean(ctx.BOOLEAN_VALUE().getText()));

            } else if (ctx.STRING_VALUE() != null) {
                bodyStatement.setVariableStringValue(ctx.STRING_VALUE().getText());

            } else {
                bodyStatement.setMultiOperation(visitMultiOperation(ctx.multiOperation()));
            }
        } else if (ctx.array() != null) {
            bodyStatement.setArray(visitArray(ctx.array()));
        } else if (ctx.var() != null) {
            bodyStatement.setVar(visitVar(ctx.var()));
        } else if (ctx.forLoop() != null) {
            bodyStatement.setForLoop(visitForLoop(ctx.forLoop()));
        } else if (ctx.ifCondition() != null) {
            bodyStatement.setIfCondition(visitIfCondition(ctx.ifCondition()));
        } else if (ctx.console() != null) {
            bodyStatement.setConsole(visitConsole(ctx.console()));
        } else if (ctx.functionCall() != null) {
            bodyStatement.setFunctionCall(visitFunctionCall(ctx.functionCall()));
        } else if (ctx.return_() != null) {
            bodyStatement.setReturn0(visitReturn(ctx.return_()));
        }
        return bodyStatement;
    }
    @Override

    public ClassBody visitClassBody(AngularParser.ClassBodyContext ctx) {
        ClassBody classBody = new ClassBody();

        if (ctx.modifiers()!=null) {
            classBody.setModifiers(visitModifiers(ctx.modifiers()));
        }
        if (ctx.array()!=null) {
            classBody.setArray(visitArray(ctx.array()));
        }
        if (ctx.var() !=null) {
            classBody.setVar(visitVar(ctx.var()));
        }
        if (ctx.function() !=null) {
            classBody.setFunction(visitFunction(ctx.function()));
        }
        if (ctx.constructor() !=null) {
            classBody.setConstructor(visitConstructor(ctx.constructor()));
        }

        return classBody;
    }

    @Override
    public Array visitArray(AngularParser.ArrayContext ctx) {
        Array array = new Array();
        Row row = new Row();
        String currentScope = String.join(".", scopeStack);
        array.setArrayName(ctx.IDENTIFIER().getText());


        if (ctx.CONST() != null) {
            array.setVariableType(ctx.CONST().getText());

        }
        if (ctx.LET() != null) {
            array.setVariableType(ctx.LET().getText());

        }
        if (ctx.VAR() != null) {
            array.setVariableType(ctx.VAR().getText());

        }

        row.setType("array name");
        row.setValue(array.getArrayName());
        row.setScope(currentScope);
        symbolTable.getRows().add(row);

        if (ctx.arrayMethod() != null) {
            array.setArrayMethod(visitArrayMethod(ctx.arrayMethod()));
        }
        array.setArrayBody(visitArrayBody(ctx.arrayBody()));


        return array;
    }
    @Override

    public ArrayMethod visitArrayMethod(AngularParser.ArrayMethodContext ctx) {
        classes.ArrayMethod arrayMethod = new ArrayMethod();

        if (ctx.SQUARE_OPEN_BRACKET() != null) {
            arrayMethod.setDataType(visitDataType(ctx.dataType().get(0)));
        }
        else if (ctx.ARRAY() != null) {
            arrayMethod.setDataType(visitDataType(ctx.dataType().get(0)));
            arrayMethod.setArray(ctx.ARRAY().getText());

        }
        else{
            for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
                if(ctx.IDENTIFIER().get(i)!=null){
                    String identifier = ctx.IDENTIFIER().get(i).getText();

                    DataType type = visitDataType(ctx.dataType().get(i));

                    arrayMethod.getArrayObjectElementList().add(identifier);
                    arrayMethod.getArrayObjectElementListType().add(type);
                }
            }
        }
        return arrayMethod;
    }


    @Override
    public ArrayBody visitArrayBody(AngularParser.ArrayBodyContext ctx) {
        ArrayBody arrayBody = new ArrayBody();

        if (!ctx.NUMBER_VALUE().isEmpty()) {
            for (int i = 0; i < ctx.NUMBER_VALUE().size(); i++) {
                if (ctx.NUMBER_VALUE().get(i) != null) {
                    int number = Integer.parseInt(ctx.NUMBER_VALUE(i).getText());
                    arrayBody.getNumberValues().add(number);

                }
            }
        } else if (!ctx.STRING_VALUE().isEmpty()) {
            for (int i = 0; i < ctx.STRING_VALUE().size(); i++) {
                if (ctx.STRING_VALUE().get(i) != null) {
                    String strValue = ctx.STRING_VALUE(i).getText();
                    arrayBody.getStringValues().add(strValue);

                }
            }
        } else if (!ctx.BOOLEAN_VALUE().isEmpty()) {
            for (int i = 0; i < ctx.BOOLEAN_VALUE().size(); i++) {
                if (ctx.BOOLEAN_VALUE().get(i) != null) {
                    boolean boolValue = Boolean.parseBoolean(ctx.BOOLEAN_VALUE(i).getText());
                    arrayBody.getBooleanValues().add(boolValue);

                }
            }
        }   else {
            for (int i = 0; i < ctx.object().size(); i++) {
                if (ctx.object().get(i) != null) {
                    arrayBody.getObjectValues().add(visitObject(ctx.object().get(i)));
                }
            }
        }
        return arrayBody;
    }

    @Override
    public classes.Object visitObject(AngularParser.ObjectContext ctx) {
        classes.Object object = new classes.Object();

        if (!ctx.objectBody().isEmpty()) {
            for (int i = 0; i < ctx.objectBody().size(); i++) {
                if (ctx.objectBody().get(i) != null) {
                    object.getObjectBodyList().add(visitObjectBody(ctx.objectBody().get(i)));
                }
            }
        }

        return  object;
    }

    @Override
    public ObjectBody visitObjectBody(AngularParser.ObjectBodyContext ctx) {
        ObjectBody objectBody = new ObjectBody();

        String objectElement = ctx.IDENTIFIER().getText();
        objectBody.setObjectElement(objectElement);


        if (ctx.STRING_VALUE()!=null) {
            objectBody.setStringObjectElementValue(ctx.STRING_VALUE().getText());

        }
        if (ctx.NUMBER_VALUE() != null) {
            objectBody.setNumberObjectElementValue(Integer.parseInt(ctx.NUMBER_VALUE().getText()));

        }
        if (ctx.arrayBody()!=null) {
            objectBody.setArrayBody(visitArrayBody(ctx.arrayBody()));
        }
        if (ctx.BOOLEAN_VALUE() !=null) {
            objectBody.setBooleanObjectElementValue(Boolean.parseBoolean(ctx.BOOLEAN_VALUE().getText()));

        }
        return  objectBody;
    }


    @Override
    public Var visitVar(AngularParser.VarContext ctx) {
        Var var = new Var();

        if (ctx.stringVar() !=null) {
            var.setStringVar(visitStringVar(ctx.stringVar()));
        }
        if (ctx.boolVar() !=null) {
            var.setBoolVar(visitBoolVar(ctx.boolVar()));
        }
        if (ctx.numVar() !=null) {
            var.setNumVar(visitNumVar(ctx.numVar()));
        }
        if (ctx.anyVar() !=null) {
            var.setAnyVar(visitAnyVar(ctx.anyVar()));
        }

        return var;
    }
    @Override

    public Page visitPage(AngularParser.PageContext ctx) {
        Page page = new Page();
        for (int i=0;i<ctx.imports().size(); i++){
            if (ctx.imports().get(i)!= null){
                page.getImports().add(visitImports(ctx.imports(i)));
            }
        }
        for (int i=0;i<ctx.component().size(); i++){
            if (ctx.component().get(i)!= null){
                page.getComponents().add(visitComponent(ctx.component(i)));
            }
        }
        for (int i=0;i<ctx.class_().size(); i++){
            if (ctx.class_().get(i)!= null){
                page.getClasses().add(visitClass(ctx.class_(i)));
            }
        }
        this.symbolTable.print();
        SemanticCheck semanticCheck = new SemanticCheck();
        semanticCheck.setSymbolTable(this.symbolTable);
        semanticCheck.check();
        System.out.println("\n\n----------------------- AST TREE -----------------------\n\n");
        return page;
    }

    @Override
    public Import visitImports(AngularParser.ImportsContext ctx) {
        Import import1 = new Import();

        if(ctx.COMPONENT() != null){
            import1.setComponent(ctx.COMPONENT().getText());
        }
        else {
            import1.setIdentifier(ctx.IDENTIFIER().get(0).getText());
        }

        if (ctx.COMPONENT()!=null){
            if(!ctx.IDENTIFIER().isEmpty()){
                for (int i=0;i<ctx.IDENTIFIER().size(); i++){
                    if (ctx.IDENTIFIER().get(i)!= null){
                        import1.getIdentifierList().add(ctx.IDENTIFIER(i).getText());
                    }
                }
            }
        }else {
            if(ctx.IDENTIFIER().size() > 1){
                for (int i=1;i<ctx.IDENTIFIER().size(); i++){
                    if (ctx.IDENTIFIER().get(i)!= null){
                        import1.getIdentifierList().add(ctx.IDENTIFIER(i).getText());
                    }
                }
            }
        }
        import1.setName(ctx.STRING_VALUE().getText());

        if(ctx.COMPONENT() != null) {
            Row row1 = new Row();
            row1.setType("element");
            row1.setValue(import1.getComponent());
            symbolTable.getRows().add(row1);

            if (!ctx.IDENTIFIER().isEmpty()) {
                for (int i = 0; i < import1.getIdentifierList().size(); i++) {
                    Row row2 = new Row();
                    row2.setType("element");
                    row2.setValue(import1.getIdentifierList().get(i));
                    symbolTable.getRows().add(row2);
                }
            }

        }
        else {
            Row row1 = new Row();
            row1.setType("element");
            row1.setValue(import1.getIdentifier());
            symbolTable.getRows().add(row1);

            if (ctx.IDENTIFIER().size() > 1) {
                for (int i = 0; i < import1.getIdentifierList().size(); i++) {
                    Row row2 = new Row();
                    row2.setType("element");
                    row2.setValue(import1.getIdentifierList().get(i));
                    symbolTable.getRows().add(row2);
                }
            }
        }
        Row row3 = new Row();
        row3.setType("library");
        row3.setValue(import1.getName());
        symbolTable.getRows().add(row3);

        return import1;
    }

    @Override
    public Component visitComponent(AngularParser.ComponentContext ctx) {
        Component component = new Component();
        component.setComponentBodies(visitComponentBody(ctx.componentBody()));
        return component;
    }

    @Override
    public ComponentBody visitComponentBody(AngularParser.ComponentBodyContext ctx) {
        ComponentBody componentBody = new ComponentBody();
        componentBody.setIdentifier(ctx.IDENTIFIER().get(0).getText());
        componentBody.setStringValue(ctx.STRING_VALUE().get(0).getText());
        if(ctx.IDENTIFIER().size() > 1){
            if (!ctx.BACKTICK().isEmpty()){
                for (int i=1;i<ctx.IDENTIFIER().size()-1; i++){
                    if (ctx.IDENTIFIER().get(i)!= null){
                        componentBody.getIdentifierList().add(ctx.IDENTIFIER(i).getText());
                    }
                }
            }else {
                for (int i=1;i<ctx.IDENTIFIER().size(); i++){
                    if (ctx.IDENTIFIER().get(i)!= null){
                        componentBody.getIdentifierList().add(ctx.IDENTIFIER(i).getText());
                    }
                }
            }
        }
        if(ctx.STRING_VALUE().size() > 1){
            for (int i=1;i<ctx.STRING_VALUE().size(); i++){
                if (ctx.STRING_VALUE().get(i)!= null){
                    componentBody.getStringValueList().add(ctx.STRING_VALUE(i).getText());
                }
            }
        }

        Row row1 = new Row();
        row1.setType("componentElement");
        row1.setValue(componentBody.getIdentifier());
        symbolTable.getRows().add(row1);


        for (int i=0;i<componentBody.getIdentifierList().size(); i++){
            if (componentBody.getIdentifierList().get(i)!= null){
                Row row3 = new Row();
                row3.setType("componentElement");
                row3.setValue(componentBody.getIdentifierList().get(i));
                symbolTable.getRows().add(row3);

            }
        }

        if(ctx.htmlBlock() != null){
            componentBody.setIdentifier1(ctx.IDENTIFIER().get(ctx.IDENTIFIER().size()-1).getText());
            if(ctx.htmlBlock() != null){
                Row row5 = new Row();
                row5.setType("componentElement");
                row5.setValue(componentBody.getIdentifier1());
                symbolTable.getRows().add(row5);
            }
            componentBody.setHtmlBlock(visitHtmlBlock(ctx.htmlBlock()));
        }
        if(ctx.componentStyles() != null){
            componentBody.setComponentStyle(visitComponentStyles(ctx.componentStyles()));
        }
        if(ctx.componentImport() != null){
            componentBody.setComponentImport(visitComponentImport(ctx.componentImport()));
        }


        return componentBody;
    }


    @Override
    public ComponentStyle visitComponentStyles(AngularParser.ComponentStylesContext ctx) {
        ComponentStyle componentStyle = new ComponentStyle();

        Row row = new Row();
        row.setType("componentElement");
        row.setValue(ctx.STYLES().getText());
        symbolTable.getRows().add(row);

        for (int i=0;i<ctx.styleElements().size(); i++){
            if (ctx.styleElements().get(i)!= null){
                componentStyle.getStyleElements().add(visitStyleElements(ctx.styleElements(i)));
            }
        }

        return componentStyle;
    }

    @Override
    public ComponentImport visitComponentImport(AngularParser.ComponentImportContext ctx) {
        ComponentImport componentImport = new ComponentImport();
        if (ctx.COMPONENT()!=null){
            componentImport.getIdentifiers().add(ctx.COMPONENT().getText());
        }
        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            if (ctx.IDENTIFIER().get(i)!= null){
                componentImport.getIdentifiers().add(ctx.IDENTIFIER().get(i).getText());
            }
        }

        Row row1 = new Row();
        row1.setType("imports element");
        row1.setValue(ctx.IMPORTS().getText());
        symbolTable.getRows().add(row1);
        for (int i = 0; i < componentImport.getIdentifiers().size(); i++) {
            Row row2 = new Row();
            row2.setType("imports value");
            row2.setValue(componentImport.getIdentifiers().get(i));
            symbolTable.getRows().add(row2);
        }


        return componentImport;
    }

    @Override
    public StyleElement visitStyleElements(AngularParser.StyleElementsContext ctx) {
        StyleElement styleElement = new StyleElement();

        if (!ctx.IDENTIFIER().isEmpty()) {
            for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
                String identifier = ctx.IDENTIFIER(i).getText();
                styleElement.getIdentifiers().add(identifier);
            }
        }

        if (ctx.MULTIPLY() != null) {
            styleElement.setAll(ctx.MULTIPLY().getText());
        }

        if (ctx.styleElementsBody() != null) {
            for (AngularParser.StyleElementsBodyContext bodyCtx : ctx.styleElementsBody()) {
                styleElement.getStyleElementBodies().add(visitStyleElementsBody(bodyCtx));
            }
        }


        return styleElement;
    }

    @Override
    public ForLoop visitForLoop(AngularParser.ForLoopContext ctx) {
        ForLoop forLoop = new ForLoop();
        scopeCounter++;
        scopeStack.add("for@" + scopeCounter);
        String currentScope=String.join(".",scopeStack);

        forLoop.setIdentifier1(ctx.IDENTIFIER().get(0).getText());

        forLoop.setIdentifier2(ctx.IDENTIFIER().get(1).getText());

        forLoop.setIdentifier3(ctx.IDENTIFIER().get(2).getText());

        forLoop.setfNumber(ctx.NUMBER_VALUE().get(0).getText());

        if (ctx.EQUAL() != null) {
            forLoop.setOperation(ctx.EQUAL().getText());
        } else if (ctx.NOT_EQUAL() != null) {
            forLoop.setOperation(ctx.NOT_EQUAL().getText());
        } else if (ctx.EQUALS_OR_LESS_THAN() != null) {
            forLoop.setOperation(ctx.EQUALS_OR_LESS_THAN().getText());
        } else if (ctx.EQAULS_OR_GREATER_THAN() != null) {
            forLoop.setOperation(ctx.EQAULS_OR_GREATER_THAN().getText());
        } else if (ctx.LESS_THAN() != null) {
            forLoop.setOperation(ctx.LESS_THAN().getText());
        } else if (ctx.GREATER_THAN() != null) {
            forLoop.setOperation(ctx.GREATER_THAN().getText());
        }

        forLoop.setlNumber(ctx.NUMBER_VALUE().get(1).getText());

        forLoop.setMultiOperation(visitMultiOperation(ctx.multiOperation()));

        if (!ctx.bodyStatement().isEmpty()) {
            for (int i = 0; i < ctx.bodyStatement().size(); i++) {
                if (ctx.bodyStatement() != null) {
                    forLoop.getBodyStatementList().add(visitBodyStatement(ctx.bodyStatement(i)));
                }
            }
        }

        if (ctx.CONTINUE() != null) {
            forLoop.setClose(ctx.CONTINUE().getText());
        } else if (ctx.BREAK() != null) {
            forLoop.setClose(ctx.BREAK().getText());
        }
        scopeStack.remove(scopeStack.size() - 1);
        return forLoop;
    }


    @Override
    public FunctionCall visitFunctionCall(AngularParser.FunctionCallContext ctx) {
        FunctionCall functionCall = new FunctionCall();
        Row row = new Row();
        functionCall.setIdentifier(ctx.IDENTIFIER(0).getText());
        row.setType("function call name");
        row.setValue(functionCall.getIdentifier());
        symbolTable.getRows().add(row);
        if (ctx.IDENTIFIER().size() != 1 || !ctx.NUMBER_VALUE().isEmpty() || !ctx.STRING_VALUE().isEmpty() || ctx.BOOLEAN_VALUE().isEmpty()) {

            for (int i = 1; i < ctx.IDENTIFIER().size(); i++) {
                Row row1 = new Row();
                functionCall.getIdentifiersList().add(ctx.IDENTIFIER(i).getText());
                row1.setType("variable parameter");
                row1.setValue(functionCall.getIdentifiersList().get(i));
                symbolTable.getRows().add(row1);
            }

            for (int i = 0; i < ctx.STRING_VALUE().size(); i++) {
                Row row2 = new Row();
                functionCall.getStringValueList().add(ctx.STRING_VALUE(i).getText());
                row2.setType("String parameter");
                row2.setValue(functionCall.getStringValueList().get(i));
                symbolTable.getRows().add(row2);
            }

            for (int i = 0; i < ctx.NUMBER_VALUE().size(); i++) {
                Row row3 = new Row();
                functionCall.getNumberList().add(Integer.parseInt(ctx.NUMBER_VALUE(i).getText()));
                row3.setType("integer parameter");
                row3.setValue(String.valueOf(functionCall.getNumberList().get(i)));
                symbolTable.getRows().add(row3);
            }

            for (int i = 0; i < ctx.BOOLEAN_VALUE().size(); i++) {
                Row row4 = new Row();
                functionCall.getBooleanList().add(Boolean.parseBoolean(ctx.BOOLEAN_VALUE(i).getText()));
                row4.setType("boolean parameter");
                row4.setValue(String.valueOf(functionCall.getBooleanList().get(i)));
                symbolTable.getRows().add(row4);
            }

        }
        return functionCall;
    }
}
