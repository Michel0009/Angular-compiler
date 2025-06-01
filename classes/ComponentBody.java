package classes;

import java.util.ArrayList;
import java.util.List;

public class   ComponentBody {
    String identifier;
    String stringValue;
    List<String> identifierList=new ArrayList<>();
    List<String> stringValueList=new ArrayList<String>();
    String identifier1;
    HtmlBlock htmlBlock;
    ComponentStyle componentStyle;
    ComponentImport componentImport;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public List<String> getIdentifierList() {
        return identifierList;
    }

    public void setIdentifierList(List<String> identifierList) {
        this.identifierList = identifierList;
    }

    public List<String> getStringValueList() {
        return stringValueList;
    }

    public void setStringValueList(List<String> stringValueList) {
        this.stringValueList = stringValueList;
    }

    public String getIdentifier1() {
        return identifier1;
    }

    public void setIdentifier1(String identifier1) {
        this.identifier1 = identifier1;
    }

    public HtmlBlock getHtmlBlock() {
        return htmlBlock;
    }

    public void setHtmlBlock(HtmlBlock htmlBlock) {
        this.htmlBlock = htmlBlock;
    }

    public ComponentStyle getComponentStyle() {
        return componentStyle;
    }

    public void setComponentStyle(ComponentStyle componentStyle) {
        this.componentStyle = componentStyle;
    }

    public ComponentImport getComponentImport() {
        return componentImport;
    }

    public void setComponentImport(ComponentImport componentImport) {
        this.componentImport = componentImport;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("ComponentBody{\n");

        string.append(identifier).append(" : ").append(stringValue).append("\n");

        if (!identifierList.isEmpty() || !stringValueList.isEmpty()) {
            if (!stringValueList.isEmpty()) {
                string.append("String Values: ");
                for (String val : stringValueList) {
                    string.append("$").append(val).append(" ");
                }
                string.append("\n");
            }
            if (!identifierList.isEmpty()) {
                string.append("Identifiers: ");
                for (String id : identifierList) {
                    string.append(id).append(" ");
                }
                string.append("\n");
            }
        }

        if (identifier1 != null && htmlBlock != null) {
            string.append(identifier1).append(" : ").append(htmlBlock).append("\n");
        }

        if (componentStyle != null) {
            string.append(componentStyle).append("\n");
        }

        if (componentImport != null) {
            string.append(componentImport).append("\n");
        }

        string.append("}");

        return string.toString();
    }
}
