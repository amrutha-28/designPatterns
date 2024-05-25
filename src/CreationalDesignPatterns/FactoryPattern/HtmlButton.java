package CreationalDesignPatterns.FactoryPattern;

public class HtmlButton implements Button{
    @Override
    public void render() {
        // Render a button in Windows style.
        System.out.println("Render a button in Web Style.");
    }

    @Override
    public void onClick(Runnable f) {
        // Bind a native OS click event.
        f.run();
    }
}
