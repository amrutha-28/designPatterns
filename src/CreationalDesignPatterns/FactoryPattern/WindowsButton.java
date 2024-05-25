package CreationalDesignPatterns.FactoryPattern;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Render a button in Windows style.");
    }

    @Override
    public void onClick(Runnable f) {
        f.run();
    }
}
