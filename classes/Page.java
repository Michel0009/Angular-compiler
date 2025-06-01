package classes;

import java.util.ArrayList;
import java.util.List;

public class Page {
    List<Import> imports = new ArrayList<Import>();
    List<Component> components = new ArrayList<Component>();
    List<Class> classes = new ArrayList<Class>();

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    public List<Import> getImports() {
        return imports;
    }

    public void setImports(List<Import> imports) {
        this.imports = imports;
    }

    @Override
    public String toString() {
        return "Page{\n"
                + "imports: " + imports + ","
                + "\ncomponents: " + components + ","
                + "\nclasses: " + classes
                + "\n}";
    }
}
