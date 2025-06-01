package classes;

public class BoolVar {
    String variableType;
    String variableName;
    Boolean variableValue;

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

    public Boolean getVariableValue() {
        return variableValue;
    }

    public void setVariableValue(Boolean variableValue) {
        this.variableValue = variableValue;
    }

    @Override
    public String toString() {

        return "BoolVar{" +
                "\nvariableType="+variableType+
                "\nvariableName=" + variableName +
                "\nvariableValue=" + variableValue +
                "\n}";

    }
}
