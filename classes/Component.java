package classes;

public class Component {
    ComponentBody componentBodies=new ComponentBody();

    public ComponentBody getComponentBodies() {
        return componentBodies;
    }

    public void setComponentBodies(ComponentBody componentBodies) {
        this.componentBodies = componentBodies;
    }

    @Override
    public String toString() {
        return "\nComponent{"+
                "\n"+ componentBodies+
                "\n}";
    }
}
