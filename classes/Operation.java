package classes;

public class Operation {
    String plus;
    String minus;
    String multiply;
    String divide;

    public String getPlus() {
        return plus;
    }

    public void setPlus(String plus) {
        this.plus = plus;
    }

    public String getMinus() {
        return minus;
    }

    public void setMinus(String minus) {
        this.minus = minus;
    }

    public String getMultiply() {
        return multiply;
    }

    public void setMultiply(String multiply) {
        this.multiply = multiply;
    }

    public String getDivide() {
        return divide;
    }

    public void setDivide(String divide) {
        this.divide = divide;
    }


    @Override
    public String toString() {
        if(plus!=null){
            return "\nOperation{" +
                    "\nplus='" + plus +
                    "\n}";
        }
        else if (minus!=null) {
            return "\nOperation{" +
                    "\n, minus='" + minus +
                    "\n}";
        }
        else if(multiply!=null){
            return "\nOperation{" +
                    "\n, multiply='" + multiply +
                    "\n}";
        }
        else{
            return "\nOperation{" +
                    "\n, divide='" + divide +
                    "\n}";
        }
    }
}
