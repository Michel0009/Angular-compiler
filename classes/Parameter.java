package classes;

public class Parameter {
    String ParameterName;
    DataType dataType;

    public String getParameterName() {
        return ParameterName;
    }

    public void setParameterName(String ParameterName) {
        this.ParameterName = ParameterName;
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    @Override
    public String toString() {
        return "\nParameter {" +
                "\nParameterName=" + ParameterName +
                "\ndataType=" + dataType +
                "\n}";
    }
}
