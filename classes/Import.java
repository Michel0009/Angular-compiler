package classes;

import java.util.ArrayList;
import java.util.List;

public class Import {
    String identifier;
    String component;
    List<String> identifierList=new ArrayList<>();
    String name;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public List<String> getIdentifierList() {
        return identifierList;
    }

    public void setIdentifierList(List<String> identifierList) {
        this.identifierList = identifierList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nImport{\n");

        if (component != null) {
            sb.append(component).append("\n");
        } else {
            sb.append(identifier).append("\n");
        }

        if (!identifierList.isEmpty()) {
            for (String id : identifierList) {
                sb.append(id).append("\n");
            }
            sb.append("from\n").append(name).append("\n");
        }

        sb.append("}");

        return sb.toString();    }
}
