package classes;

public class DataType {
    String dataTypeName;

    public String getDataTypeName() {
        return dataTypeName;
    }

    public void setDataTypeName(String dataTypeName) {
        this.dataTypeName = dataTypeName;
    }

    @Override
    public String toString() {
        return "\nDataType{" +
                "\ndataTypeName=" + dataTypeName +
                "\n}";
    }
}
