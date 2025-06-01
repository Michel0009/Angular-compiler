package classes;

import java.util.ArrayList;
import java.util.List;

public class Function {
    String functionName;
    ArrayList<Parameter> parameters=new ArrayList<Parameter>();
    DataType returnType;
    String voidType;
    ArrayList<BodyStatement> bodyStatements=new ArrayList<BodyStatement>();

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public ArrayList<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(ArrayList<Parameter> parameters) {
        this.parameters = parameters;
    }

    public DataType getReturnType() {
        return returnType;
    }

    public void setReturnType(DataType returnType) {
        this.returnType = returnType;
    }

    public ArrayList<BodyStatement> getBodyStatements() {
        return bodyStatements;
    }

    public void setBodyStatements(ArrayList<BodyStatement> bodyStatements) {
        this.bodyStatements = bodyStatements;
    }

    public String getVoidType() {
        return voidType;
    }

    public void setVoidType(String voidType) {
        this.voidType = voidType;
    }

    @Override
    public String toString() {
        if (parameters.isEmpty()){
            if (returnType!=null){
                if (bodyStatements.isEmpty()){
                     return "\nFunction{"+
                            "\nfunctionName="+functionName+
                            "\nreturnType="+returnType+
                            "\n}";
                }else{
                    return "\nFunction{"+
                            "\nfunctionName="+functionName+
                            "\nreturnType="+returnType+
                            "\nbodyStatements="+bodyStatements+
                            "\n}";
                }
            } else if (voidType!=null) {
                if (bodyStatements.isEmpty()){
                    return "\nFunction{"+
                            "\nfunctionName="+functionName+
                            "\nreturnType="+voidType+
                            "\n}";
                }else{
                    return "\nFunction{"+
                            "\nfunctionName="+functionName+
                            "\nreturnType="+voidType+
                            "\nbodyStatements="+bodyStatements+
                            "\n}";
                }
            } else {
                if (bodyStatements.isEmpty()){
                    return "\nFunction{"+
                            "\nfunctionName="+functionName+
                            "\n}";
                }else{
                    return "\nFunction{"+
                            "\nfunctionName="+functionName+
                            "\nbodyStatements="+bodyStatements+
                            "\n}";
                }
            }
        }else{
            if (returnType!=null){
                if (bodyStatements.isEmpty()){
                    return "\nFunction{"+
                            "\nfunctionName="+functionName+
                            "\nparameters=" +parameters+
                            "\nreturnType="+returnType+
                            "\n}";
                }else{
                    return "\nFunction{"+
                            "\nfunctionName="+functionName+
                            "\nparameters=" +parameters+
                            "\nreturnType="+returnType+
                            "\nbodyStatements="+bodyStatements+
                            "\n}";
                }
            } else if (voidType!=null) {
                if (bodyStatements.isEmpty()){
                    return "\nFunction{"+
                            "\nfunctionName="+functionName+
                            "\nparameters=" +parameters+
                            "\nreturnType="+voidType+
                            "\n}";
                }else{
                    return "\nFunction{"+
                            "\nfunctionName="+functionName+
                            "\nparameters=" +parameters+
                            "\nreturnType="+voidType+
                            "\nbodyStatements="+bodyStatements+
                            "\n}";
                }
            } else {
                if (bodyStatements.isEmpty()){
                    return "\nFunction{"+
                            "\nfunctionName="+functionName+
                            "\nparameters=" +parameters+
                            "\n}";
                }else{
                    return "\nFunction{"+
                            "\nfunctionName="+functionName+
                            "\nparameters=" +parameters+
                            "\nbodyStatements="+bodyStatements+
                            "\n}";
                }
            }
        }

    }
}
