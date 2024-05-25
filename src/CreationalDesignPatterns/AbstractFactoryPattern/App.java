package CreationalDesignPatterns.AbstractFactoryPattern;

public class App {
    private GUIFactory factory;
    private Button button;

    public App(GUIFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        this.button = factory.createButton();
    }

    public void paint() {
        button.paint();
    }
}
