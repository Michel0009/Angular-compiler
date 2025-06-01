package classes;

public class HtmlElementProperties {
    String htmlevent;
    String htmlProperty;
    String eventPropertyValue;

    public String getHtmlevent() {
        return htmlevent;
    }

    public void setHtmlevent(String htmlevent) {
        this.htmlevent = htmlevent;
    }

    public String getHtmlProperty() {
        return htmlProperty;
    }

    public void setHtmlProperty(String htmlProperty) {
        this.htmlProperty = htmlProperty;
    }

    public String getEventPropertyValue() {
        return eventPropertyValue;
    }

    public void setEventPropertyValue(String eventPropertyValue) {
        this.eventPropertyValue = eventPropertyValue;
    }

    @Override
    public String toString() {
        if(htmlevent!=null){
            return "\nHtmlElementProperties{" +
                    "\nhtmlevent='" + htmlevent +
                    "\n, value='" + eventPropertyValue +
                    "\n}";
        }
        else{
            return "\nHtmlElementProperties{" +
                    "\n, htmlProperty='" + htmlProperty +
                    "\n, value='" + eventPropertyValue +
                    "\n}";
        }

    }
}
