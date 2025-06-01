package classes;

import java.util.ArrayList;

public class Constructor {
    ArrayList<Parameter> parameters =new ArrayList<Parameter>();
    ArrayList<ConstructorBody> constructorBodies =new ArrayList<ConstructorBody>();

    public ArrayList<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(ArrayList<Parameter> parameters) {
        this.parameters = parameters;
    }

    public ArrayList<ConstructorBody> getConstructorBodies() {
        return constructorBodies;
    }

    public void setConstructorBodies(ArrayList<ConstructorBody> constructorBodies) {
        this.constructorBodies = constructorBodies;
    }

    @Override
    public String toString() {
        if (parameters.isEmpty() && constructorBodies.isEmpty()) {
            return "\nConstructor{" +
                    "\n}";
        } else if (parameters.isEmpty()) {
            return "\nConstructor{" +
                    "\nconstructorBodies="+constructorBodies+
                    "\n}";
        } else if (constructorBodies.isEmpty()) {
            return "\nConstructor{" +
                    "\nparameters="+parameters+
                    "\n}";
        }else {
            return "\nConstructor{" +
                    "\nparameters="+parameters+
                    "\nconstructorBodies="+constructorBodies+
                    "\n}";
        }
    }
}
