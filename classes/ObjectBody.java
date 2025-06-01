package classes;

public class ObjectBody {
String objectElement;
String stringObjectElementValue;
Integer numberObjectElementValue;
ArrayBody arrayBody;
Boolean booleanObjectElementValue;

    public String getObjectElement() {
        return objectElement;
    }

    public void setObjectElement(String objectElement) {
        this.objectElement = objectElement;
    }

    public String getStringObjectElementValue() {
        return stringObjectElementValue;
    }

    public void setStringObjectElementValue(String stringObjectElementValue) {
        this.stringObjectElementValue = stringObjectElementValue;
    }

    public Integer getNumberObjectElementValue() {
        return numberObjectElementValue;
    }

    public void setNumberObjectElementValue(Integer numberObjectElementValue) {
        this.numberObjectElementValue = numberObjectElementValue;
    }

    public ArrayBody getArrayBody() {
        return arrayBody;
    }

    public void setArrayBody(ArrayBody arrayBody) {
        this.arrayBody = arrayBody;
    }

    public Boolean getBooleanObjectElementValue() {
        return booleanObjectElementValue;
    }

    public void setBooleanObjectElementValue(Boolean booleanObjectElementValue) {
        this.booleanObjectElementValue = booleanObjectElementValue;
    }

    @Override
    public String toString() {
           if (stringObjectElementValue!=null){
               return  "\nObjectBody{"+
                       "\nobjectElement= "+objectElement+
                       "\nObjectElementValue= "+stringObjectElementValue+
                       "\n}";
           }
          else if (numberObjectElementValue !=null){
               return  "\nObjectBody{"+
                       "\nobjectElement= "+objectElement+
                       "\nObjectElementValue= "+numberObjectElementValue+
                       "\n}";
           }
          else if (booleanObjectElementValue !=null){
               return  "\nObjectBody{"+
                       "\nobjectElement= "+objectElement+
                       "\nObjectElementValue= "+booleanObjectElementValue+
                       "\n}";
           } else {
               return  "\nObjectBody{"+
                       "\nobjectElement= "+objectElement+
                       "\nObjectElementValue= "+arrayBody+
                       "\n}";
           }
     }
}
