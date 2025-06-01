package classes;

import java.util.ArrayList;
import java.util.List;

public class FunctionCall {

    String identifier;
    List<String> identifiersList = new ArrayList<String>();
    List<String> stringValueList = new ArrayList<String>();
    List<Integer> numberList = new ArrayList<Integer>();
    List<Boolean> booleanList = new ArrayList<Boolean>();

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public List<String> getIdentifiersList() {
        return identifiersList;
    }

    public void setIdentifiersList(List<String> identifiersList) {
        this.identifiersList = identifiersList;
    }

    public List<String> getStringValueList() {
        return stringValueList;
    }

    public void setStringValueList(List<String> stringValueList) {
        this.stringValueList = stringValueList;
    }

    public List<Integer> getNumberList() {
        return numberList;
    }

    public void setNumberList(List<Integer> numberList) {
        this.numberList = numberList;
    }

    public List<Boolean> getBooleanList() {
        return booleanList;
    }

    public void setBooleanList(List<Boolean> booleanList) {
        this.booleanList = booleanList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(identifier).append("(");

        List<String> params = new ArrayList<>();

        if(!identifiersList.isEmpty()){
            params.addAll(identifiersList);
        }
        if(!stringValueList.isEmpty()){
            for (int i=0;i<stringValueList.size();i++){
                params.add(stringValueList.get(i));
            }
        }
        if(!numberList.isEmpty()){
            for (int i=0;i<numberList.size();i++){
                params.add(numberList.get(i).toString());
            }
        }
        if(!booleanList.isEmpty()){
            for (int i=0;i<booleanList.size();i++){
                params.add(booleanList.get(i).toString());
            }
        }

        sb.append(String.join(", ", params));
        sb.append(");");

        return sb.toString();
    }
}