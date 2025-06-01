package classes;

import java.util.ArrayList;
import java.util.List;

public class Class {
    String className;
    String classRelation;
    String fatherClassName;
    List<ClassBody> classBodies = new ArrayList<>();

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassRelation() {
        return classRelation;
    }

    public void setClassRelation(String classRelation) {
        this.classRelation = classRelation;
    }

    public String getFatherClassName() {
        return fatherClassName;
    }

    public void setFatherClassName(String fatherClassName) {
        this.fatherClassName = fatherClassName;
    }

    public List<ClassBody> getClassBodies() {
        return classBodies;
    }

    public void setClassBodies(List<ClassBody> classBodies) {
        this.classBodies = classBodies;
    }



    @Override
    public String toString() {
        if (!classBodies.isEmpty()) {
            if(fatherClassName!=null){
                return "\nClass{"
                        + "\nclassName= " + className
                        + "\nclassRelation= " + classRelation
                        + "\nfatherClassName= " + fatherClassName
                        + "\nclassBody= " + classBodies
                        + "\n}";
            }
            else{
                return "\nClass{"
                        + "\nclassName= " + className
                        + "\nclassBody= " + classBodies
                        + "\n}";
            }
        }
        else {
            if(fatherClassName!=null){
                return "\nClass{"
                        + "\nclassName= " + className
                        + "\nclassRelation= " + classRelation
                        + "\nfatherClassName= " + fatherClassName
                        + "\n}";
            }
            else{
                return "\nClass{"
                        + "\nclassName= " + className
                        + "\n}";
            }
        }
    }
}
