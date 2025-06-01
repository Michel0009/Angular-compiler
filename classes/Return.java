package classes;

public class Return {
    String stringReturn;
    Integer numberReturn;
    Boolean booleanReturn;
    String returnWord;
    public String getStringReturn() {
        return stringReturn;
    }

    public void setStringReturn(String stringReturn) {
        this.stringReturn = stringReturn;
    }

    public int getNumberReturn() {
        return numberReturn;
    }

    public void setNumberReturn(int numberReturn) {
        this.numberReturn = numberReturn;
    }

    public boolean isBooleanReturn() {
        return booleanReturn;
    }

    public void setBooleanReturn(boolean booleanReturn) {
        this.booleanReturn = booleanReturn;
    }

    public String getReturnWord() {
        return returnWord;
    }

    public void setReturnWord(String returnWord) {
        this.returnWord = returnWord;
    }

    @Override
    public String toString() {
        if (stringReturn!=null){
        return "\nReturn{" +
                "\nreturnWord="+ returnWord+
                "\n returnValue=" + stringReturn+
                "\n}";
        } else if (numberReturn!=null) {
            return "\nReturn{" +
                    "\nreturnWord="+ returnWord+
                    "\n returnValue=" + numberReturn+
                    "\n}";
        } else if (booleanReturn!=null) {
            return "\nReturn{" +
                    "\nreturnWord="+ returnWord+
                    "\n returnValue=" + booleanReturn+
                    "\n}";
        }
        else{
            return "\nReturn{"+
                    "\nreturnWord="+ returnWord+
                    "\n}";
        }
    }
}
