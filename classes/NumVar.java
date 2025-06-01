package classes;

public class NumVar {
    String variableType;
    String variableName;
    Integer variableValue;

    public String getVariableType() {
        return variableType;
    }

    public void setVariableType(String variableType) {
        this.variableType = variableType;
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public Integer getVariableValue() {
        return variableValue;
    }

    public void setVariableValue(Integer variableValue) {
        this.variableValue = variableValue;
    }

    @Override
    public String toString() {

        return "NumVar{" +
                "\nvariableType="+variableType+
                "\nvariableName=" + variableName +
                "\nvariableValue=" + variableValue +
                "\n}";

    }
}
