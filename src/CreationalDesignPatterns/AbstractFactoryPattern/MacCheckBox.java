package CreationalDesignPatterns.AbstractFactoryPattern;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        // Render a checkbox in macOS style.
        System.out.println("Render a checkbox in macOS style.");

    }
}