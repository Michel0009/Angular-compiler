package classes;

import java.util.ArrayList;
import java.util.List;

public class ForStatement {
    String element;
    String elementList;
    String trackedElement;
    List<HtmlElement> html_elements_list = new ArrayList<HtmlElement>();

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getElementList() {
        return elementList;
    }

    public void setElementList(String elementList) {
        this.elementList = elementList;
    }

    public String getTrackedElement() {
        return trackedElement;
    }

    public void setTrackedElement(String trackedElement) {
        this.trackedElement = trackedElement;
    }

    public List<HtmlElement> getHtml_elements_list() {
        return html_elements_list;
    }

    public void setHtml_elements_list(List<HtmlElement> html_elements_list) {
        this.html_elements_list = html_elements_list;
    }


    @Override
    public String toString() {

        if(!html_elements_list.isEmpty()){
            return "\nForStatement{" +
                    "\nelement='" + element +
                    "\n, elementList='" + elementList +
                    "\n, trackedElement='" + trackedElement +
                    "\n, html_elements_list=" + html_elements_list +
                    "\n}";
        }
        else{
            return "\nForStatement{" +
                    "\nelement='" + element +
                    "\n, elementList='" + elementList +
                    "\n, trackedElement='" + trackedElement +
                    "\n}";
        }

    }
}
