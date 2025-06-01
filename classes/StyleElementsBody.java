package classes;

public class StyleElementsBody {
    String styleProperty;
    String styleValueIdentifier;
    Integer styleValueNumber;
    String modulus;
    String measure;

    public String getStyleProperty() {
        return styleProperty;
    }

    public void setStyleProperty(String styleProperty) {
        this.styleProperty = styleProperty;
    }

    public String getStyleValueIdentifier() {
        return styleValueIdentifier;
    }

    public void setStyleValueIdentifier(String styleValueIdentifier) {
        this.styleValueIdentifier = styleValueIdentifier;
    }

    public Integer getStyleValueNumber() {
        return styleValueNumber;
    }

    public void setStyleValueNumber(Integer styleValueNumber) {
        this.styleValueNumber = styleValueNumber;
    }

    public String getMODULUS() {
        return modulus;
    }

    public void setMODULUS(String MODULUS) {
        this.modulus = MODULUS;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    @Override
    public String toString() {
        if(styleValueIdentifier!=null){
            return "\nStyleElementsBody{" +
                    "\nstyleProperty='" + styleProperty +
                    "\n, styleValueIdentifier='" + styleValueIdentifier +
                    "\n}";
        }
        else{
            if(modulus!=null){
                return "\nStyleElementsBody{" +
                        "\nstyleProperty='" + styleProperty +
                        "\n, styleValueNumber=" + styleValueNumber +
                        "\n, MODULUS='" + modulus +
                        "\n}";
            }
            else if(measure!=null){
                return "\nStyleElementsBody{" +
                        "\nstyleProperty='" + styleProperty +
                        "\n, styleValueNumber=" + styleValueNumber +
                        "\n, measure='" + measure +
                        "\n}";
            }
            else{
                return "\nStyleElementsBody{" +
                        "\nstyleProperty='" + styleProperty +
                        "\n, styleValueNumber=" + styleValueNumber +
                        "\n}";
            }

        }

    }
}
