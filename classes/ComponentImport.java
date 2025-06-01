package classes;

import java.util.ArrayList;

public class ComponentImport {
    ArrayList<String> identifiers=new ArrayList<String>();

    public ArrayList<String> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(ArrayList<String> identifiers) {
        this.identifiers = identifiers;
    }

    @Override
    public String toString() {
        return "Component Import{" + "\n"
                + identifiers
                + "\n}";
    }
}
