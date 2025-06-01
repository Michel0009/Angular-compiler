package classes;

import java.util.ArrayList;

public class Console {
    ArrayList<String> stringStatements =new ArrayList<String>();
    ArrayList<FunctionCall> functionCalls =new ArrayList<FunctionCall>();
    ArrayList<String> variableStatements =new ArrayList<String>();
    String plus;
    public ArrayList<String> getStringStatements() {
        return stringStatements;
    }

    public void setStringStatements(ArrayList<String> stringStatements) {
        this.stringStatements = stringStatements;
    }

    public ArrayList<FunctionCall> getFunctionCalls() {
        return functionCalls;
    }

    public void setFunctionCalls(ArrayList<FunctionCall> functionCalls) {
        this.functionCalls = functionCalls;
    }

    public ArrayList<String> getVariableStatements() {
        return variableStatements;
    }

    public void setVariableStatements(ArrayList<String> variableStatements) {
        this.variableStatements = variableStatements;
    }

    public String getPlus() {
        return plus;
    }

    public void setPlus(String plus) {
        this.plus = plus;
    }

    @Override
    public String toString() {
        if (plus==null) {
            if (!stringStatements.isEmpty()) {
                return "\nConsole{" +
                        "\nstringStatement=" + stringStatements +
                        "\n}";
            } else if (!variableStatements.isEmpty()) {
                return "\nConsole{" +
                        "\nvariableStatement=" + variableStatements +
                        "\n}";
            }else {
                return "\nConsole{" +
                        "\nfunctionCall=" + functionCalls +
                        "\n}";
            }
        }else{
            if (stringStatements.isEmpty() && variableStatements.isEmpty()) {
                return "\nConsole{" +
                        "\nfunctionCalls=" + functionCalls +
                        "\n}";
            } else if (stringStatements.isEmpty() && functionCalls.isEmpty()) {
                return "\nConsole{" +
                        "\nvariableStatements=" + variableStatements +
                        "\n}";
            } else if (variableStatements.isEmpty() && functionCalls.isEmpty()) {
                return "\nConsole{" +
                        "\nstringStatements=" + stringStatements +
                        "\n}";
            }else if (stringStatements.isEmpty()){
                return "\nConsole{" +
                        "\nvariableStatements=" + variableStatements +
                        "\nfunctionCalls="+functionCalls+
                        "\n}";
            } else if (variableStatements.isEmpty()) {
                return "\nConsole{" +
                        "\nstringStatements=" + stringStatements +
                        "\nfunctionCalls="+functionCalls+
                        "\n}";
            } else if (functionCalls.isEmpty()) {
                return "\nConsole{" +
                        "\nstringStatements =" + stringStatements +
                        "\nvariableStatements="+variableStatements+
                        "\n}";
            }else {
                return "\nConsole{" +
                        "\nstringStatements=" + stringStatements +
                        "\nvariableStatements="+variableStatements+
                        "\nfunctionCalls="+functionCalls+
                        "\n}";
            }
        }
    }
}
