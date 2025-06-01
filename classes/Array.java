package classes;

public class Array {
String variableType;
String arrayName;
ArrayMethod arrayMethod;
ArrayBody arrayBody;


    public String getVariableType() {
        return variableType;
    }

    public void setVariableType(String variableType) {
        this.variableType = variableType;
    }

    public String getArrayName() {
        return arrayName;
    }

    public void setArrayName(String arrayName) {
        this.arrayName = arrayName;
    }

    public ArrayMethod getArrayMethod() {
        return arrayMethod;
    }

    public void setArrayMethod(ArrayMethod arrayMethod) {
        this.arrayMethod = arrayMethod;
    }

    public ArrayBody getArrayBody() {
        return arrayBody;
    }

    public void setArrayBody(ArrayBody arrayBody) {
        this.arrayBody = arrayBody;
    }

    @Override
    public String toString() {

        if(arrayMethod!=null){
            if(variableType !=null) {
                return "Array{" +
                        "\nvariableType= " +  variableType+
                        "\nArrayName= " +  arrayName +
                        "\narrayMethod= " + arrayMethod +
                        "\n" + "arrayBody" + arrayBody +
                        "\n}";

            }else {
                return "Array{" +
                        "\nArrayName= " +  arrayName +
                        "\narrayMethod= " + arrayMethod +
                        "\n" + "arrayBody" + arrayBody +
                        "\n}";
            }
        }
        else {
            if(variableType !=null) {
                return "Array{" +
                        "\nvariableType= " +  variableType+
                        "\nArrayName= " +  arrayName +
                        "\n" + "arrayBody" + arrayBody +
                        "\n}";

            }else {
                return "Array{" +
                        "\nArrayName= " +  arrayName +
                        "\n" + "arrayBody" + arrayBody +
                        "\n}";
            }

        }
 
    }
}
