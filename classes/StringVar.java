package classes;

public class StringVar {
    String variableType;
    String variableName;
    String variableValue;

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

    public String getVariableValue() {
        return variableValue;
    }

    public void setVariableValue(String variableValue) {
        this.variableValue = variableValue;
    }

    @Override
    public String toString() {

            return "StringVar{" +
                    "\nvariableType="+variableType+
                    "\nvariableName=" + variableName +
                    "\nvariableValue=" + variableValue +
                    "\n}";

    }
}
