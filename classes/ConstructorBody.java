package classes;

public class ConstructorBody {
    String variable;
    String assignOperator;
    FunctionCall functionCallAssignment;
    String stringAssignment;
    Integer numberAssignment;
    Boolean booleanAssignment;
    MultiOperation multiOperation;
    Array array;
    Var var;
    ForLoop forLoop;
    IfCondition ifCondition;
    Console console;

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getAssignOperator() {
        return assignOperator;
    }

    public void setAssignOperator(String assignOperator) {
        this.assignOperator = assignOperator;
    }

    public FunctionCall getFunctionCallAssignment() {
        return functionCallAssignment;
    }

    public void setFunctionCallAssignment(FunctionCall functionCallAssignment) {
        this.functionCallAssignment = functionCallAssignment;
    }

    public String getStringAssignment() {
        return stringAssignment;
    }

    public void setStringAssignment(String stringAssignment) {
        this.stringAssignment = stringAssignment;
    }

    public Integer getNumberAssignment() {
        return numberAssignment;
    }

    public void setNumberAssignment(Integer numberAssignment) {
        this.numberAssignment = numberAssignment;
    }

    public Boolean getBooleanAssignment() {
        return booleanAssignment;
    }

    public void setBooleanAssignment(Boolean booleanAssignment) {
        this.booleanAssignment = booleanAssignment;
    }

    public MultiOperation getMultiOperation() {
        return multiOperation;
    }

    public void setMultiOperation(MultiOperation multiOperation) {
        this.multiOperation = multiOperation;
    }

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    public Var getVar() {
        return var;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    public ForLoop getForLoop() {
        return forLoop;
    }

    public void setForLoop(ForLoop forLoop) {
        this.forLoop = forLoop;
    }

    public IfCondition getIfCondition() {
        return ifCondition;
    }

    public void setIfCondition(IfCondition ifCondition) {
        this.ifCondition = ifCondition;
    }

    public Console getConsole() {
        return console;
    }

    public void setConsole(Console console) {
        this.console = console;
    }

    @Override
    public String toString() {
       if (variable!=null && assignOperator!=null){
           if (stringAssignment!=null) {
               return "\nConstructorBody{" +
                       "\nvariable=" + variable +
                       "\nassignOperator=" + assignOperator +
                       "\nvalue=" + stringAssignment+
                       "\n}";
           } else if (numberAssignment!=null) {
               return "\nConstructorBody{" +
                       "\nvariable=" + variable +
                       "\nassignOperator=" + assignOperator +
                       "\nvalue=" + numberAssignment+
                       "\n}";
           } else if (booleanAssignment!=null) {
               return "\nConstructorBody{" +
                       "\nvariable=" + variable +
                       "\nassignOperator=" + assignOperator +
                       "\nvalue=" + booleanAssignment+
                       "\n}";
           }else {
               return "\nConstructorBody{" +
                       "\nvariable=" + variable +
                       "\nassignOperator=" + assignOperator +
                       "\nvalue=" + functionCallAssignment+
                       "\n}";
           }
       } else if (variable!=null && multiOperation!=null) {
            return "\nConstructorBody{" +
                   "\nvariable=" + variable +
                   "\nmultiOperation" + multiOperation+
                   "\n}";
       } else if (array!=null) {
           return "\nConstructorBody{" +
                   "\narray=" + array +
                   "\n}";
       } else if (var!=null) {
           return "\nConstructorBody{" +
                   "\nvar=" + var +
                   "\n}";
       } else if (functionCallAssignment!=null) {
           return "\nConstructorBody{" +
                   "\nfunctionCall=" + functionCallAssignment +
                   "\n}";
       } else if (forLoop!=null) {
           return "\nConstructorBody{" +
                   "\nforLoop=" + forLoop +
                   "\n}";
       } else if (ifCondition!=null) {
           return "\nConstructor{" +
                   "\nifCondition=" + ifCondition +
                   "\n}";
       }else {
           return "\nConstructor{" +
                   "\nconsole=" + console +
                   "\n}";
       }
    }
}
