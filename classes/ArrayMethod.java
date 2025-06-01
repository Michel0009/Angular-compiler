package classes;


import java.util.ArrayList;
import java.util.List;

public class ArrayMethod {
    DataType dataType;
    String array;
    List<String> arrayObjectElementList = new ArrayList<String>();
    List<DataType> arrayObjectElementListType = new ArrayList<DataType>();

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public String getArray() {
        return array;
    }

    public void setArray(String array) {
        this.array = array;
    }

    public List<String> getArrayObjectElementList() {
        return arrayObjectElementList;
    }

    public void setArrayObjectElementList(List<String> arrayObjectElementList) {
        this.arrayObjectElementList = arrayObjectElementList;
    }

    public List<DataType> getArrayObjectElementListType() {
        return arrayObjectElementListType;
    }

    public void setArrayObjectElementListType(List<DataType> arrayObjectElementListType) {
        this.arrayObjectElementListType = arrayObjectElementListType;
    }

    @Override
    public String toString() {
        if(!arrayObjectElementList.isEmpty()){
            String result = "";
            for(int i = 0 ;i<arrayObjectElementList.size(); i++){
                    result += arrayObjectElementList.get(i);
                    result += arrayObjectElementListType.get(i);
            }
            return "ArrayMethode{" +
                    "\narrayObjectElementList= " + result +
                    "\n }";
        }
        else if(array!=null){
            return "\nArrayMethode{" +
                    "\narray= " + array +
                    "\ndataTye=" + dataType +
                    "\n }";
        }
        else{
            return "\nArrayMethode{" +
                    "\ndataTye=" + dataType +
                    "\n }";
        }

    }
}