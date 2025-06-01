package classes;

import java.util.ArrayList;
import java.util.List;

public class TsxBlock {
    String variable;
    List<String> referensedVariables = new ArrayList<String>();
    Operation operation;
    Integer number;

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public List<String> getReferensedVariables() {
        return referensedVariables;
    }

    public void setReferensedVariables(List<String> referensedVariables) {
        this.referensedVariables = referensedVariables;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }


    @Override
    public String toString() {
        if(operation!=null){
            if(!referensedVariables.isEmpty()){
                return "\nTsxBlock{" +
                        "\nvariable='" + variable +
                        "\n, referensedVariables=" + referensedVariables +
                        "\n, operation=" + operation +
                        "\n, number=" + number +
                        "\n}";
            }
            else{
                return "\nTsxBlock{" +
                        "\nvariable='" + variable +
                        "\n, operation=" + operation +
                        "\n, number=" + number +
                        "\n}";
            }
        }
        else{
            if(!referensedVariables.isEmpty()){
                return "\nTsxBlock{" +
                        "\nvariable='" + variable +
                        "\n, referensedVariables=" + referensedVariables +
                        "\n}";
            }
            else{
                return "\nTsxBlock{" +
                        "\nvariable='" + variable +
                        "\n}";
            }

        }

    }
}
