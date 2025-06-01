import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SemanticCheck {
    SymbolTable symbolTable;
    ArrayList<String> errors=new ArrayList<>();
    ArrayList<String> importsError = new ArrayList<>();

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    boolean checkIfThereIsASameDefinition(SymbolTable symbolTable){
        for (int i = 0; i < symbolTable.rows.size(); i++) {
            if (symbolTable.rows.get(i).getType().equals("element")|| symbolTable.rows.get(i).getType().equals("class name") ||(symbolTable.rows.get(i).getType().equals("componentElement") && symbolTable.rows.get(i).getValue().equals("selector"))|| symbolTable.rows.get(i).getType().equals("variable name") || symbolTable.rows.get(i).getType().equals("array name") ||symbolTable.rows.get(i).getType().equals("function")){
                for (int j = symbolTable.rows.size()-1; j >i ; j--) {
                    if (symbolTable.rows.get(j).getType().equals("element") && symbolTable.rows.get(j).getType().equals(symbolTable.rows.get(i).getType()) && symbolTable.rows.get(j).getValue().equals(symbolTable.rows.get(i).getValue())){
                        errors.add("Error: duplicated import element ( "+symbolTable.rows.get(i).getValue() + " )");
                        break;
                    }
                    if (symbolTable.rows.get(j).getType().equals("class name") && symbolTable.rows.get(j).getType().equals(symbolTable.rows.get(i).getType()) && symbolTable.rows.get(j).getValue().equals(symbolTable.rows.get(i).getValue())) {
                        errors.add("Error: duplicated class ( "+symbolTable.rows.get(i).getValue() + " )");
                        break;
                    }
                    if (symbolTable.rows.get(j).getType().equals("componentElement") && symbolTable.rows.get(j).getType().equals(symbolTable.rows.get(i).getType()) && symbolTable.rows.get(j).getValue().equals(symbolTable.rows.get(i).getValue()) && symbolTable.rows.get(j+1).getValue().equals(symbolTable.rows.get(i+1).getValue())) {
                        errors.add("Error: duplicated component ( "+symbolTable.rows.get(i).getValue() + " )");
                        break;
                    }
                    if (symbolTable.rows.get(j).getType().equals("variable name") && symbolTable.rows.get(j).getType().equals(symbolTable.rows.get(i).getType()) && symbolTable.rows.get(j).getScope().equals(symbolTable.rows.get(i).getScope())&&symbolTable.rows.get(j).getValue().equals(symbolTable.rows.get(i).getValue())){
                        int iFunctionIndex=-1;
                        int jFunctionIndex=-1;
                        for (int k = i; k > 0 ; k--) {
                            if (symbolTable.rows.get(k).getType().equals("function") && symbolTable.rows.get(i).getScope().endsWith(symbolTable.rows.get(k).getValue())){
                                iFunctionIndex=k;
                                break;
                            }
                        }
                        for (int k = j; k > 0 ; k--) {
                            if (symbolTable.rows.get(k).getType().equals("function") && symbolTable.rows.get(j).getScope().endsWith(symbolTable.rows.get(k).getValue())){
                                jFunctionIndex=k;
                                break;
                            }
                        }
                        if (iFunctionIndex != -1 && iFunctionIndex == jFunctionIndex) {
                            errors.add("Error: duplicated variable ( " + symbolTable.rows.get(i).getValue() + " )");
                            break;
                        }else if (iFunctionIndex==-1 || jFunctionIndex==-1){
                            errors.add("Error: duplicated variable ( " + symbolTable.rows.get(i).getValue() + " )");
                            break;
                        }
                    }
                    if (symbolTable.rows.get(j).getType().equals("array name") && symbolTable.rows.get(j).getType().equals(symbolTable.rows.get(i).getType()) && symbolTable.rows.get(j).getScope().equals(symbolTable.rows.get(i).getScope())&&symbolTable.rows.get(j).getValue().equals(symbolTable.rows.get(i).getValue())){
                        int iFunctionIndex=-1;
                        int jFunctionIndex=-1;
                        for (int k = i; k > 0 ; k--) {
                            if (symbolTable.rows.get(k).getType().equals("function") && symbolTable.rows.get(i).getScope().endsWith(symbolTable.rows.get(k).getValue())){
                                iFunctionIndex=k;
                                break;
                            }
                        }
                        for (int k = j; k > 0 ; k--) {
                            if (symbolTable.rows.get(k).getType().equals("function") && symbolTable.rows.get(j).getScope().endsWith(symbolTable.rows.get(k).getValue())){
                                jFunctionIndex=k;
                                break;
                            }
                        }
                        if (iFunctionIndex != -1 && iFunctionIndex == jFunctionIndex) {
                            errors.add("Error: duplicated variable ( " + symbolTable.rows.get(i).getValue() + " )");
                            break;
                        }else if (iFunctionIndex==-1 || jFunctionIndex==-1){
                            errors.add("Error: duplicated variable ( " + symbolTable.rows.get(i).getValue() + " )");
                            break;
                        }
                    }
                    if (symbolTable.rows.get(j).getType().equals("function") && symbolTable.rows.get(j).getType().equals(symbolTable.rows.get(i).getType()) && symbolTable.rows.get(j).getScope().equals(symbolTable.rows.get(i).getScope()) && symbolTable.rows.get(j).getValue().equals(symbolTable.rows.get(i).getValue())){
                        int iParameterNumber=0;
                        int jParameterNumber=0;
                        boolean isParametersDifferent=false;
                        for (int k = i+1; k < symbolTable.rows.size(); k++) {
                            if(symbolTable.rows.get(k).getType().equals("function")){
                                break;
                            }
                            if (symbolTable.rows.get(k).getType().equals("parameter")){
                                iParameterNumber++;
                            }
                        }
                        for (int k = j+1; k < symbolTable.rows.size(); k++) {
                            if(symbolTable.rows.get(k).getType().equals("function")){
                                break;
                            }
                            if (symbolTable.rows.get(k).getType().equals("parameter")){
                                jParameterNumber++;
                            }
                        }

                        if (iParameterNumber==jParameterNumber){
                        for (int k = 0; k < iParameterNumber*2; k+=2) {
                                if (symbolTable.rows.get(i+k+1).getType().equals("parameter") && symbolTable.rows.get(i+k+2).getType().equals("data type") && symbolTable.rows.get(j+k+1).getType().equals("parameter") && symbolTable.rows.get(j+k+2).getType().equals("data type")) {
                                    if (!(symbolTable.rows.get(i + k + 2).getValue().equals(symbolTable.rows.get(j + k + 2).getValue()))) {
                                        isParametersDifferent = true;
                                        break;
                                    }
                                }
                        }
                        }else {
                            isParametersDifferent=true;
                        }
                        if (!isParametersDifferent){
                            errors.add("Error: duplicated function ( "+symbolTable.rows.get(i).getValue() + " )");
                            break;
                        }
                    }
                }
            }
        }
        return !errors.isEmpty();
    }


    boolean checkIfImportComponentExist(SymbolTable symbolTable) {
        Set<String> importIdentifiers = new HashSet<>();

        for (Row row : symbolTable.getRows()) {
            if (row.getType().equals("element")) {
                importIdentifiers.add(row.getValue());
            }
        }

        for (Row row : symbolTable.getRows()) {
            if (row.getType().equals("imports value")) {
                if (!importIdentifiers.contains(row.getValue())) {
                    importsError.add("Error: identifier '" + row.getValue() + "' Not found in any import.");
                }
            }
        }

        return !importsError.isEmpty();
    }


    boolean checkIfVariableNotDefined(SymbolTable symbolTable) {

        for (int i = 0; i < symbolTable.rows.size(); i++) {
            if (symbolTable.rows.get(i).getType().equals("variable modification")) {
                boolean check = false;
                for (int j = 0; j < i; j++) {
                    if (symbolTable.rows.get(j).getType().equals("variable name") || symbolTable.rows.get(j).getType().equals("array name")) {
                        if (symbolTable.rows.get(i).getValue().equals(symbolTable.rows.get(j).getValue())
                                && symbolTable.rows.get(i).getScope().startsWith(symbolTable.rows.get(j).getScope())) {
                            check = true;
                            break;
                        }
                    }
                }
                if(check == false)
                    errors.add("Error: cannot find symbol ( "+symbolTable.rows.get(i).getValue() + " )");
            }
        }

        return !errors.isEmpty();
    }

    boolean checkComponentElementTemplates(SymbolTable symbolTable) {
        int templateCount = 0;

        for (int i = 0; i < symbolTable.rows.size(); i++) {
            if (symbolTable.rows.get(i).getType().equals("componentElement")) {
                if (symbolTable.rows.get(i).getValue().equals("template")) {
                    templateCount++;
                }
                if (symbolTable.rows.get(i).getValue().equals("templateUrl")) {
                    templateCount++;
                }
            }
        }
        if (templateCount == 0) {
            errors.add("Error: missing 'template' or 'templateUrl' in component");
            return true;
        }
        else if (templateCount > 1) {
            errors.add("Error: multiple ('template' or 'templateUrl') is not allowed");
            return true;
        }

        return false;
    }
    boolean checkReturns(SymbolTable symbolTable) {
        for (int i = 0; i < symbolTable.getRows().size(); i++) {
            if (symbolTable.getRows().get(i).getType().equals("function")) {
                String dataType = "";
                if (i + 1 < symbolTable.getRows().size())  {
                    if (!symbolTable.getRows().get(i + 1).getType().equals("parameter") && !symbolTable.getRows().get(i + 1).getType().equals("data type")){
                        continue;
                    }
                    if (symbolTable.getRows().get(i + 1).getType().equals("parameter")){
                        boolean isDataType = false;
                        for (int j = i + 1; j < symbolTable.getRows().size(); j++) {
                            if (j + 1 < symbolTable.getRows().size() && j + 2 < symbolTable.getRows().size()) {
                                if(symbolTable.getRows().get(j).getType().equals("function")){
                                    break;
                                }
                                if (symbolTable.getRows().get(j + 1).getType().equals("data type") && symbolTable.getRows().get(j + 2).getType().equals("data type")) {
                                    isDataType = true;
                                }
                            }
                        }
                        if(!isDataType){
                            continue;
                        }
                    }
                    if (symbolTable.getRows().get(i + 1).getType().equals("data type")) {
                        dataType = symbolTable.getRows().get(i + 1).getValue();
                        if (dataType.equals("any")){
                            continue;
                        }
                        if(dataType.equals("void")){
                            for(int k = i+2; k<symbolTable.getRows().size(); k++){
                                if(symbolTable.getRows().get(k).getType().equals("function")){
                                    break;
                                }
                                if(symbolTable.getRows().get(k).getType().equals("return value")){
                                    errors.add("Error: void function can't return a value");
                                    break;
                                }
                            }
                        }
                        else {
                            for(int k = i+2; k<symbolTable.getRows().size(); k++){
                                if(symbolTable.getRows().get(k).getType().equals("function")){
                                    errors.add("Error: function must has a return value");
                                    break;
                                }
                                if(symbolTable.getRows().get(k).getType().equals("return value")){
                                    if(!dataType.equals(symbolTable.getRows().get(k+1).getValue())) {
                                        errors.add("Error: return value must be the same type of function (" + dataType + ")");
                                        break;
                                    }
                                    break;
                                }
                            }}
                    } else {
                        boolean isBreak=false;
                        for (int j = i; j < symbolTable.getRows().size(); j++) {
                            if (j + 2 < symbolTable.getRows().size() && j + 3 < symbolTable.getRows().size()) {
                                if (symbolTable.getRows().get(j + 2).getType().equals("data type") && symbolTable.getRows().get(j + 3).getType().equals("data type")) {
                                    dataType = symbolTable.getRows().get(j + 3).getValue();
                                    if (dataType.equals("any")){
                                        break;
                                    }
                                    if(dataType.equals("void")){
                                        for(int k = j+4; k<symbolTable.getRows().size(); k++){
                                            if(symbolTable.getRows().get(k).getType().equals("function")){
                                                isBreak=true;
                                                break;
                                            }
                                            if(symbolTable.getRows().get(k).getType().equals("return value")){
                                                errors.add("Error: void function can't return a value");
                                                isBreak=true;
                                                break;
                                            }
                                        }
                                    }
                                    else {
                                        for (int k = j + 4; k < symbolTable.getRows().size(); k++) {
                                            if (symbolTable.getRows().get(k).getType().equals("function")) {
                                                errors.add("Error: function must has a return value");
                                                isBreak=true;
                                                break;
                                            }
                                            if(symbolTable.getRows().get(k).getType().equals("return value")) {
                                                if (!dataType.equals(symbolTable.getRows().get(k+1).getValue())) {
                                                    errors.add("Error: return value must be the same type of function (" + dataType + ")");
                                                    isBreak=true;
                                                    break;
                                                }
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            if (isBreak){
                                break;
                            }
                        }
                    }
                }
            }
        }
        return !errors.isEmpty();
    }
    boolean check(){
        if (checkIfThereIsASameDefinition(this.symbolTable)){
            for (String error : errors) {
                System.out.println(error);
            }
            return false;
        }
        else if (checkIfImportComponentExist(this.symbolTable)){
            for (String error : importsError) {
                System.out.println(error);
            }
            return false;
        }
        else if (checkIfVariableNotDefined(this.symbolTable)){
            for (String error : errors) {
                System.out.println(error);
            }
            return false;
        }
        else if (checkComponentElementTemplates(this.symbolTable)) {
            for (String error : errors) {
                System.out.println(error);
            }
            return false;
        }
        else if (checkReturns(this.symbolTable)){
            for (String error : errors) {
                System.out.println(error);
            }
            return false;
        }
        return true;
    }

}
