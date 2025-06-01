package classes;

import java.util.ArrayList;
import java.util.List;

public class ComponentStyle {
    List<StyleElement> styleElements=new ArrayList<StyleElement>();

    public List<StyleElement> getStyleElements() {
        return styleElements;
    }

    public void setStyleElements(List<StyleElement> styleElements) {
        this.styleElements = styleElements;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("Component Style:\n");

            string.append("Style Elements{\n");
            for (StyleElement element : styleElements) {
                string.append("- ").append(element).append("\n");
        }
            string.append("}");
        return string.toString();
    }
}
