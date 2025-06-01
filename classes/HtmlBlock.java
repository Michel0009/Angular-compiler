package classes;

import java.util.ArrayList;
import java.util.List;

public class HtmlBlock {
    List<HtmlElement> html_elements_list = new ArrayList<HtmlElement>();

    public List<HtmlElement> getHtml_elements_list() {
        return html_elements_list;
    }

    public void setHtml_elements_list(List<HtmlElement> html_elements_list) {
        this.html_elements_list = html_elements_list;
    }

    @Override
    public String toString() {

            return "\nHtmlBlock{" +
                    "\nhtml_elements_list=" + html_elements_list +
                    "\n}";
    }
}
