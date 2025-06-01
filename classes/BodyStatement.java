package classes;

public class BodyStatement {
    String variableName;
    String assign;
    String secondVariable;
    String variableStringValue;
    Integer variableNumberValue;
    Boolean variableBooleanValue;
    Array array;
    Var var;
    ForLoop forLoop;
    IfCondition ifCondition;
    Console console;
    FunctionCall functionCall;
    MultiOperation multiOperation;
    Return return0;

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public String getAssign() {
        return assign;
    }

    public void setAssign(String assign) {
        this.assign = assign;
    }

    public String getSecondVariable() {
        return secondVariable;
    }

    public void setSecondVariable(String secondVariable) {
        this.secondVariable = secondVariable;
    }

    public String getVariableStringValue() {
        return variableStringValue;
    }

    public void setVariableStringValue(String variableStringValue) {
        this.variableStringValue = variableStringValue;
    }

    public Integer getVariableNumberValue() {
        return variableNumberValue;
    }

    public void setVariableNumberValue(Integer variableNumberValue) {
        this.variableNumberValue = variableNumberValue;
    }

    public Boolean getVariableBooleanValue() {
        return variableBooleanValue;
    }

    public void setVariableBooleanValue(Boolean variableBooleanValue) {
        this.variableBooleanValue = variableBooleanValue;
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

    public FunctionCall getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    public MultiOperation getMultiOperation() {
        return multiOperation;
    }

    public void setMultiOperation(MultiOperation multiOperation) {
        this.multiOperation = multiOperation;
    }

    public Return getReturn0() {
        return return0;
    }

    public void setReturn0(Return return0) {
        this.return0 = return0;
    }

    @Override
    public String toString() {
        if (variableName!=null && assign!=null){
            if (secondVariable!=null) {
                return "\nBodyStatement{" +
                        "\nvariableName=" + variableName +
                        "\nsecondVariable="+secondVariable+
                        "\n}";
            } else if (variableStringValue!=null) {
                return "\nBodyStatement{" +
                        "\nvariableName=" + variableName +
                        "\nvariableStringValue="+variableStringValue+
                        "\n}";
            } else if (variableNumberValue!=null) {
                return "\nBodyStatement{" +
                        "\nvariableName=" + variableName +
                        "\nvariableNumberValue="+variableNumberValue+
                        "\n}";
            }else {
                return "\nBodyStatement{" +
                        "\nvariableName=" + variableName +
                        "\nvariableBooleanValue="+variableBooleanValue+
                        "\n}";
            }
        } else if (array!=null) {
            return "\nBodyStatement{" +
                    "\narray="+array+
                    "\n}";
        } else if (var!=null) {
            return "\nBodyStatement{" +
                    "\nvar="+var+
                    "\n}";
        } else if (forLoop!=null) {
            return "\nBodyStatement{" +
                    "\nforLoop="+forLoop+
                    "\n}";
        }else if (ifCondition!=null) {
            return "\nBodyStatement{" +
                    "\nifCondition="+ifCondition+
                    "\n}";
        }else if (console!=null) {
            return "\nBodyStatement{" +
                    "\nconsole="+console+
                    "\n}";
        }else if (functionCall!=null) {
            return "\nBodyStatement{" +
                    "\nfunctionCall="+functionCall+
                    "\n}";
        }else if (return0!=null) {
            return "\nBodyStatement{" +
                    "\nreturn="+return0+
                    "\n}";
        }else {
            return "\nBodyStatement{" +
                    "\nvariableName=" + variableName +
                    "\nmultiOperation="+multiOperation+
                    "\n}";
        }
    }
}
