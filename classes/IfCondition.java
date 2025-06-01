package classes;

import java.util.ArrayList;

public class IfCondition {
    ArrayList<Condition> conditions=new ArrayList<Condition>();
    ArrayList<BodyStatement> bodyStatements= new ArrayList<BodyStatement>();

    public ArrayList<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(ArrayList<Condition> conditions) {
        this.conditions = conditions;
    }

    public ArrayList<BodyStatement> getBodyStatements() {
        return bodyStatements;
    }

    public void setBodyStatements(ArrayList<BodyStatement> bodyStatements) {
        this.bodyStatements = bodyStatements;
    }

    @Override
    public String toString() {
        if (!bodyStatements.isEmpty()){
            return "\nIfCondition{"+
                    "\nconditions="+conditions+
                    "\nbodyStatements="+bodyStatements+
                    "\n}";
        }else {
            return "\nIfCondition{"+
                    "\nconditions="+conditions+
                    "\n}";
        }
    }
}
