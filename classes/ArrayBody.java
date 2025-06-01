package classes;

import java.util.ArrayList;
import java.util.List;

public class ArrayBody {
    ArrayList<String> stringValues=new ArrayList<String>();
    ArrayList<Object> objectValues=new ArrayList<Object>();
    ArrayList<Integer> numberValues=new ArrayList<Integer>();
    ArrayList<Boolean> booleanValues=new ArrayList<Boolean>();

    public ArrayList<String> getStringValues() {
        return stringValues;
    }

    public void setStringValues(ArrayList<String> stringValues) {
        this.stringValues = stringValues;
    }

    public ArrayList<Object> getObjectValues() {
        return objectValues;
    }

    public void setObjectValues(ArrayList<Object> objectValues) {
        this.objectValues = objectValues;
    }

    public ArrayList<Integer> getNumberValues() {
        return numberValues;
    }

    public void setNumberValues(ArrayList<Integer> numberValues) {
        this.numberValues = numberValues;
    }

    public ArrayList<Boolean> getBooleanValues() {
        return booleanValues;
    }

    public void setBooleanValues(ArrayList<Boolean> booleanValues) {
        this.booleanValues = booleanValues;
    }

    @Override
    public String toString() {
        if (!stringValues.isEmpty()){
            return "\nArrayBody{"+
                    "\nstringValues= "+stringValues+
                    "\n}";
        } else if (!booleanValues.isEmpty()) {
            return "\nArrayBody{"+
                    "\nbooleanValues= "+booleanValues+
                    "\n}";
        }else if (!numberValues.isEmpty()) {
            return "\nArrayBody{"+
                    "\nnumberValues= "+numberValues+
                    "\n}";
        }else {
            return "\nArrayBody{"+
                    "\nobjectValues= "+objectValues+
                    "\n}";
        }
    }
}