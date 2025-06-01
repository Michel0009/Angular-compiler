package classes;

public class Var {
   StringVar stringVar;
   BoolVar boolVar;
   NumVar numVar;
   AnyVar anyVar;

    public StringVar getStringVar() {
        return stringVar;
    }

    public void setStringVar(StringVar stringVar) {
        this.stringVar = stringVar;
    }

    public BoolVar getBoolVar() {
        return boolVar;
    }

    public void setBoolVar(BoolVar boolVar) {
        this.boolVar = boolVar;
    }

    public NumVar getNumVar() {
        return numVar;
    }

    public void setNumVar(NumVar numVar) {
        this.numVar = numVar;
    }

    public AnyVar getAnyVar() {
        return anyVar;
    }

    public void setAnyVar(AnyVar anyVar) {
        this.anyVar = anyVar;
    }

    @Override
    public String toString() {
        if (stringVar !=null){
            return "\nVar{" +
                    "\n"+ "stringVar= " + stringVar +
                    "\n"+'}';
        }
      else if (boolVar !=null){
            return "\nVar{" +
                   "\n"+ " boolVar= " + boolVar +
                   "\n"+ '}';
        }
       else if (numVar !=null){
            return "\nVar{" +
                 "\n"+" numVar= " + numVar +
                  "\n"+'}';
        }
       else{
            return "\nVar{" +
                  "\n"+"anyVar= " + anyVar +
                   "\n"+ '}';
        }
    }
}
