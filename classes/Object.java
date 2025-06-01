package classes;

import java.util.ArrayList;
import java.util.List;

public class Object {
   ArrayList<ObjectBody> objectBodyList = new ArrayList<ObjectBody>();

    public ArrayList<ObjectBody> getObjectBodyList() {
        return objectBodyList;
    }

    public void setObjectBodyList(ArrayList<ObjectBody> objectBodyList) {
        this.objectBodyList = objectBodyList;
    }

    @Override
    public String toString() {
        if (!objectBodyList.isEmpty()) {
            return "\nObject{" +
                    "\nobjectBodyList=" + objectBodyList +
                    "\n}";
        }else {
            return "\nObject{" +"\n}";
        }
    }
}
