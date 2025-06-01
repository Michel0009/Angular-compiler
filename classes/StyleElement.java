package classes;

import java.util.ArrayList;
import java.util.List;

public class StyleElement {
    List<String> identifiers = new ArrayList<String>();
    String all;
    List<StyleElementsBody> styleElementBodies=new ArrayList<StyleElementsBody>();

    public List<String> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(List<String> identifiers) {
        this.identifiers = identifiers;
    }

    public String getAll() {
        return all;
    }

    public void setAll(String all) {
        this.all = all;
    }

    public List<StyleElementsBody> getStyleElementBodies() {
        return styleElementBodies;
    }

    public void setStyleElementBodies(List<StyleElementsBody> styleElementBodies) {
        this.styleElementBodies = styleElementBodies;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("StyleElement{\n");

        if (all != null) {
            string.append("All: ").append(all).append("\n");
        } else {
            string.append("Formatted Identifiers:\n");
            string.append(identifiers).append("\n");
        }
        if (!styleElementBodies.isEmpty()) {
            string.append("StyleElementBodies:\n");
            for (StyleElementsBody body : styleElementBodies) {
                string.append(body).append("\n");
            }
        }

        string.append("}");
        return string.toString();
    }
}
