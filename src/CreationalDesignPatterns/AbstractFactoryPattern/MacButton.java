package CreationalDesignPatterns.AbstractFactoryPattern;

public class MacButton implements Button {
    @Override
    public void paint() {
        // Render a button in macOS style.
        System.out.println("Render a button in macOS style.");
    }
}
