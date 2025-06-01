package classes;

public class AnyVar {
    String variableType;
    String variableName;
    String variableStringValue;
    Boolean variableBooleanValue;
    Integer variableNumberValue;
    String variableNullValue;

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

    public String getVariableStringValue() {
        return variableStringValue;
    }

    public void setVariableStringValue(String variableStringValue) {
        this.variableStringValue = variableStringValue;
    }

    public Boolean getVariableBooleanValue() {
        return variableBooleanValue;
    }

    public void setVariableBooleanValue(Boolean variableBooleanValue) {
        this.variableBooleanValue = variableBooleanValue;
    }

    public Integer getVariableNumberValue() {
        return variableNumberValue;
    }

    public void setVariableNumberValue(Integer variableNumberValue) {
        this.variableNumberValue = variableNumberValue;
    }

    public String getVariableNullValue() {
        return variableNullValue;
    }

    public void setVariableNullValue(String variableNullValue) {
        this.variableNullValue = variableNullValue;
    }

    @Override
    public String toString() {
        String valueStr="";
        if (variableNullValue!=null) {
            valueStr = variableNullValue;
        } else if (variableStringValue != null) {
            valueStr =  variableStringValue ;
        } else if (variableBooleanValue !=  null) {
            valueStr = variableBooleanValue.toString();
        } else if (variableNumberValue != null) {
            valueStr = variableNumberValue.toString();
        }
        if (variableType!=null) {
            return "AnyVar{" +
                    "\nvariableType=" + variableType +
                    "\nvariableName=" + variableName +
                    "\nvariableValue=" + valueStr +
                    "\n}";

        }else{
            return "AnyVar{" +
                    "\nvariableName=" + variableName +
                    "\nvariableValue=" + valueStr +
                    "\n}";
        }
    }
}
