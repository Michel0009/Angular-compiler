package classes;

public class HtmlElementContent {
    TsxBlock tsxBlock;
    HtmlElement htmlElement;
    String content;

    public TsxBlock getTsxBlock() {
        return tsxBlock;
    }

    public void setTsxBlock(TsxBlock tsxBlock) {
        this.tsxBlock = tsxBlock;
    }

    public HtmlElement getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(HtmlElement htmlElement) {
        this.htmlElement = htmlElement;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public String toString() {
        if(tsxBlock!=null){
            return "\nHtmlElementContent{" +
                    "\ntsxBlock=" + tsxBlock +
                    "\n}";
        }
        else if (htmlElement!=null) {
            return "\nHtmlElementContent{" +
                    "\n, htmlElement=" + htmlElement +
                    "\n}";
        }
        else{
            return "\nHtmlElementContent{" +
                    "\n, content='" + content +
                    "\n}";
        }
    }
}
