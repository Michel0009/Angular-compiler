package classes;

import java.util.ArrayList;
import java.util.List;

public class IfStatement {
    Condition condition;
    List<Condition> conditions_list = new ArrayList<Condition>();
    List<HtmlElement> html_elements_list = new ArrayList<HtmlElement>();

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public List<Condition> getConditions_list() {
        return conditions_list;
    }

    public void setConditions_list(List<Condition> conditions_list) {
        this.conditions_list = conditions_list;
    }

    public List<HtmlElement> getHtml_elements_list() {
        return html_elements_list;
    }

    public void setHtml_elements_list(List<HtmlElement> html_elements_list) {
        this.html_elements_list = html_elements_list;
    }


    @Override
    public String toString() {

//        String result = "";
//        int size = and_or_list.size();
//        for (int i = 0; i < size; i++) {
//                result += and_or_list.get(i);
//                result += conditions_list.get(i);
//        }

        if(!conditions_list.isEmpty()){
            if(!html_elements_list.isEmpty()){
                return "\nIfStatement{" +
                        "\ncondition=" + condition +
                        "\n, conditions_list=" + conditions_list +
                        "\n, html_elements_list=" + html_elements_list +
                        "\n}";
            }
            else {
                return "\nIfStatement{" +
                        "\ncondition=" + condition +
                        "\n, conditions_list=" + conditions_list +
                        "\n}";
            }
        }
        else{
            if(!html_elements_list.isEmpty()){
                return "\nIfStatement{" +
                        "\ncondition=" + condition +
                        "\n, html_elements_list=" + html_elements_list +
                        "\n}";
            }
            else {
                return "\nIfStatement{" +
                        "\ncondition=" + condition +
                        "\n}";
            }
        }

    }
}
