package classes;

public class MultiOperation {
    String operation1;
    String operation2;
    Integer operationNumber;
    String operationVariable;

    public String getOperation1() {
        return operation1;
    }

    public void setOperation1(String operation1) {
        this.operation1 = operation1;
    }

    public String getOperation2() {
        return operation2;
    }

    public void setOperation2(String operation2) {
        this.operation2 = operation2;
    }

    public Integer getOperationNumber() {
        return operationNumber;
    }

    public void setOperationNumber(Integer operationNumber) {
        this.operationNumber = operationNumber;
    }

    public String getOperationVariable() {
        return operationVariable;
    }

    public void setOperationVariable(String operationVariable) {
        this.operationVariable = operationVariable;
    }

    @Override
    public String toString() {
        if (operation1!=null){
        return "\nMultiOperation{" +
                "\noperation=" + operation1 +
                "\n}";
        }else{
            if (operationNumber!=null) {
                return "\nMultiOperation{" +
                        "\noperation=" + operation2 +
                        "\noperationValue"+ operationNumber+
                        "\n}";
            }else {
                return "\nMultiOperation{" +
                        "\noperation=" + operation2 +
                        "\noperationValue"+ operationVariable+
                        "\n}";
            }
        }
    }
}
