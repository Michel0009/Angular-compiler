package classes;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement {
    String openTagName;
    String htmlProperty;
    String htmlClass;
    String htmlPropertyValue;
    List<HtmlElementProperties> HtmlElementProperties = new ArrayList<HtmlElementProperties>();
    List<IfStatement> IfStatements = new ArrayList<IfStatement>();
    List<ForStatement> ForStatements = new ArrayList<ForStatement>();
    List<HtmlElementContent> HtmlElementContents = new ArrayList<HtmlElementContent>();
    String closeTagName;

    public String getOpenTagName() {
        return openTagName;
    }

    public void setOpenTagName(String openTagName) {
        this.openTagName = openTagName;
    }

    public String getHtmlProperty() {
        return htmlProperty;
    }

    public void setHtmlProperty(String htmlProperty) {
        this.htmlProperty = htmlProperty;
    }

    public String getHtmlClass() {
        return htmlClass;
    }

    public void setHtmlClass(String htmlClass) {
        this.htmlClass = htmlClass;
    }

    public String getHtmlPropertyValue() {
        return htmlPropertyValue;
    }

    public void setHtmlPropertyValue(String htmlPropertyValue) {
        this.htmlPropertyValue = htmlPropertyValue;
    }

    public List<HtmlElementProperties> getHtmlElementProperties() {
        return HtmlElementProperties;
    }

    public void setHtmlElementProperties(List<HtmlElementProperties> htmlElementProperties) {
        HtmlElementProperties = htmlElementProperties;
    }

    public List<IfStatement> getIfStatements() {
        return IfStatements;
    }

    public void setIfStatements(List<IfStatement> ifStatements) {
        IfStatements = ifStatements;
    }

    public List<ForStatement> getForStatements() {
        return ForStatements;
    }

    public void setForStatements(List<ForStatement> forStatements) {
        ForStatements = forStatements;
    }

    public List<HtmlElementContent> getHtmlElementContents() {
        return HtmlElementContents;
    }

    public void setHtmlElementContents(List<HtmlElementContent> htmlElementContents) {
        HtmlElementContents = htmlElementContents;
    }

    public String getCloseTagName() {
        return closeTagName;
    }

    public void setCloseTagName(String closeTagName) {
        this.closeTagName = closeTagName;
    }


    @Override
    public String toString() {
        /*
        if(closeTagName!=null){
            if(htmlProperty!=null){
                return "\nHtmlElement{" +
                        "\nopenTagName='" + openTagName + '\'' +
                        "\n, htmlProperty='" + htmlProperty + '\'' +
                        "\n, htmlPropertyValue='" + htmlPropertyValue + '\'' +
                        "\n, HtmlElementProperties=" + HtmlElementProperties +
                        "\n, IfStatements=" + IfStatements +
                        "\n, ForStatements=" + ForStatements +
                        "\n, HtmlElementContents=" + HtmlElementContents +
                        "\n, closeTagName='" + closeTagName + '\'' +
                        "\n}";
            }
            else if(htmlClass!=null){
                return "\nHtmlElement{" +
                        "\nopenTagName='" + openTagName + '\'' +
                        "\n, htmlClass='" + htmlClass + '\'' +
                        "\n, htmlPropertyValue='" + htmlPropertyValue + '\'' +
                        "\n, HtmlElementProperties=" + HtmlElementProperties +
                        "\n, IfStatements=" + IfStatements +
                        "\n, ForStatements=" + ForStatements +
                        "\n, HtmlElementContents=" + HtmlElementContents +
                        "\n, closeTagName='" + closeTagName + '\'' +
                        "\n}";
            }
            else{
                return "\nHtmlElement{" +
                        "\nopenTagName='" + openTagName + '\'' +
                        "\n, HtmlElementProperties=" + HtmlElementProperties +
                        "\n, IfStatements=" + IfStatements +
                        "\n, ForStatements=" + ForStatements +
                        "\n, HtmlElementContents=" + HtmlElementContents +
                        "\n, closeTagName='" + closeTagName + '\'' +
                        "\n}";
            }
        }
        else{
            if(htmlProperty!=null){
                return "\nHtmlElement{" +
                        "\nopenTagName='" + openTagName + '\'' +
                        "\n, htmlProperty='" + htmlProperty + '\'' +
                        "\n, htmlPropertyValue='" + htmlPropertyValue + '\'' +
                        "\n, HtmlElementProperties=" + HtmlElementProperties +
                        "\n}";
            }
            else if(htmlClass!=null){
                return "\nHtmlElement{" +
                        "\nopenTagName='" + openTagName + '\'' +
                        "\n, htmlClass='" + htmlClass + '\'' +
                        "\n, htmlPropertyValue='" + htmlPropertyValue + '\'' +
                        "\n, HtmlElementProperties=" + HtmlElementProperties +
                        "\n}";
            }
            else{
                return "\nHtmlElement{" +
                        "\nopenTagName='" + openTagName + '\'' +
                        "\n, HtmlElementProperties=" + HtmlElementProperties +
                        "\n}";
            }
        }*/

            StringBuilder sb = new StringBuilder();
            sb.append("\nHtmlElement{");
            sb.append("\nopenTagName=").append(openTagName);

            if (htmlProperty != null) {
                sb.append("\nhtmlProperty=").append(htmlProperty);
            }

            if (htmlClass != null) {
                sb.append("\nhtmlClass=").append(htmlClass);
            }

            if (htmlPropertyValue != null) {
                sb.append("\nhtmlPropertyValue=").append(htmlPropertyValue);
            }

            if (!HtmlElementProperties.isEmpty()) {
                sb.append("\nHtmlElementProperties=").append(HtmlElementProperties);
            }

            if (!HtmlElementContents.isEmpty()) {
                 sb.append("\nHtmlElementContents=").append(HtmlElementContents);
            }

             if (!IfStatements.isEmpty()) {
                sb.append("\nIfStatements=").append(IfStatements);
            }

            if (!ForStatements.isEmpty()) {
                sb.append("\nForStatements=").append(ForStatements);
            }

            if (closeTagName != null) {
                sb.append("\ncloseTagName=").append(closeTagName);
            }

            sb.append("\n}");
            return sb.toString();
    }
}

