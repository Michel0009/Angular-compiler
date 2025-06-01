package classes;

import java.util.ArrayList;
import java.util.List;

public class ForLoop {
    String identifier1;
    String identifier2;
    String identifier3;
    String fNumber;
    String operation;
    String lNumber;
    MultiOperation multiOperation;
    List<BodyStatement> bodyStatementList = new ArrayList<BodyStatement>();
    String close;

    public String getIdentifier1() {
        return identifier1;
    }

    public void setIdentifier1(String identifier1) {
        this.identifier1 = identifier1;
    }

    public String getIdentifier2() {
        return identifier2;
    }

    public void setIdentifier2(String identifier2) {
        this.identifier2 = identifier2;
    }

    public String getIdentifier3() {
        return identifier3;
    }

    public void setIdentifier3(String identifier3) {
        this.identifier3 = identifier3;
    }

    public String getfNumber() {
        return fNumber;
    }

    public void setfNumber(String fNumber) {
        this.fNumber = fNumber;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getlNumber() {
        return lNumber;
    }

    public void setlNumber(String lNumber) {
        this.lNumber = lNumber;
    }

    public MultiOperation getMultiOperation() {
        return multiOperation;
    }

    public void setMultiOperation(MultiOperation multiOperation) {
        this.multiOperation = multiOperation;
    }

    public List<BodyStatement> getBodyStatementList() {
        return bodyStatementList;
    }

    public void setBodyStatementList(List<BodyStatement> bodyStatementList) {
        this.bodyStatementList = bodyStatementList;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("for (let ");
        sb.append(identifier1);
        sb.append("=");
        sb.append(fNumber);
        sb.append(";");
        sb.append(identifier2).append(operation).append(lNumber);
        sb.append(";");
        sb.append(identifier3).append(multiOperation);
        sb.append(") {");

        for (BodyStatement statement : bodyStatementList) {
            sb.append("\n    ").append(statement.toString());
        }

        if (close != null) {
            sb.append("\n  Loop Control: ").append(close);
        }
        sb.append("\n}");

        return sb.toString();
    }
}