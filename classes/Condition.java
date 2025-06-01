package classes;

public class Condition {
    String conditionElement1;
    FunctionCall functionCall;
    String operator;
    String conditionString;
    Integer conditionNumber;
    Boolean conditionBoolean;
    String conditionElement2;

    public String getConditionElement1() {
        return conditionElement1;
    }

    public void setConditionElement1(String conditionElement1) {
        this.conditionElement1 = conditionElement1;
    }

    public FunctionCall getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getConditionString() {
        return conditionString;
    }

    public void setConditionString(String conditionString) {
        this.conditionString = conditionString;
    }

    public Integer getConditionNumber() {
        return conditionNumber;
    }

    public void setConditionNumber(Integer conditionNumber) {
        this.conditionNumber = conditionNumber;
    }

    public Boolean getConditionBoolean() {
        return conditionBoolean;
    }

    public void setConditionBoolean(Boolean conditionBoolean) {
        this.conditionBoolean = conditionBoolean;
    }

    public String getConditionElement2() {
        return conditionElement2;
    }

    public void setConditionElement2(String conditionElement2) {
        this.conditionElement2 = conditionElement2;
    }

    @Override
    public String toString() {
        if (conditionElement1!=null) {
            if (operator!=null) {
                if (conditionElement2!=null) {
                    return "\nCondition{" +
                            "\nconditionElement1=" + conditionElement1 +
                            "\n operator= " + operator +
                            "\n conditionElement2="+ conditionElement2+
                            "\n}";
                } else if (conditionString!=null) {
                    return "\nCondition{" +
                            "\nconditionElement1=" + conditionElement1 +
                            "\n operator= " + operator +
                            "\n conditionElement2="+ conditionString+
                            "\n}";
                } else if (conditionNumber!=null) {
                    return "\nCondition{" +
                            "\nconditionElement1=" + conditionElement1 +
                            "\n operator= " + operator +
                            "\n conditionElement2="+ conditionNumber+
                            "\n}";

                }else {
                    return "\nCondition{" +
                            "\nconditionElement1=" + conditionElement1 +
                            "\n operator= " + operator +
                            "\n conditionElement2="+ conditionBoolean+
                            "\n}";
                }
            }else{
                return "\nCondition{" +
                        "\nconditionElement1=" + conditionElement1 +
                        "\n}";
            }
        }else{
            if (operator!=null) {
                if (conditionElement2!=null) {
                    return "\nCondition{" +
                            "\nconditionElement1=" + functionCall +
                            "\n operator= " + operator +
                            "\n conditionElement2="+ conditionElement2+
                            "\n}";
                } else if (conditionString!=null) {
                    return "\nCondition{" +
                            "\nconditionElement1=" + functionCall +
                            "\n operator= " + operator +
                            "\n conditionElement2="+ conditionString+
                            "\n}";
                } else if (conditionNumber!=null) {
                    return "\nCondition{" +
                            "\nconditionElement1=" + functionCall +
                            "\n operator= " + operator +
                            "\n conditionElement2="+ conditionNumber+
                            "\n}";

                }else {
                    return "\nCondition{" +
                            "\nconditionElement1=" + functionCall +
                            "\n operator= " + operator +
                            "\n conditionElement2="+ conditionBoolean+
                            "\n}";
                }
            }else{
                return "\nCondition{" +
                        "\nconditionElement1=" + functionCall +
                        "\n}";
            }
        }
    }
}
