package classes;


public class ClassBody {
   Modifiers modifiers;
   Array array;
   Var var;
   Function function;
   Constructor constructor;

    public Modifiers getModifiers() {
        return modifiers;
    }

    public void setModifiers(Modifiers modifiers) {
        this.modifiers = modifiers;
    }

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    public Var getVar() {
        return var;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    public Constructor getConstructor() {
        return constructor;
    }

    public void setConstructor(Constructor constructor) {
        this.constructor = constructor;
    }

    @Override
    public String toString() {

                if(constructor != null){
                    return "\n Class Body{"+
                            "\nconstructor= "+constructor+
                            "\n";
                }
                else{
                    if (modifiers !=null){
                        if(array !=null){
                            return "\n Class Body{"+
                                    "\nmodifiers= "+  modifiers+
                                    "\narray= "+array+
                                    "\n }";

                        } else if (var!=null) {
                            return "\n Class Body{"+
                                    "\nmodifiers= "+modifiers+
                                    "\nvar= "+var+
                                    "\n }";
                        }
                        else {
                            return "\n Class Body{"+
                                    "\nmodifiers= "+modifiers+
                                    "\nfunction= "+function+
                                    "\n }";
                        }
                    }
                    else{
                        if(array !=null){
                            return "\n Class Body{"+
                                    "\narray= "+array+
                                    "\n }";

                        } else if (var!=null) {
                            return "\n Class Body{"+
                                    "\nvar= "+var+
                                    "\n }";
                        }
                        else {
                            return "\n Class Body{"+
                                    "\nfunction= "+function+
                                    "\n }";
                        }
                    }

                }

    }
}
