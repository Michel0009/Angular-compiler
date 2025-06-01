package classes;

public class Modifiers {
    String modifier;

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    @Override
    public String toString() {
        return "\nModifiers{" +
                "\nmodifier=" + modifier +
                "\n}";
    }
}
