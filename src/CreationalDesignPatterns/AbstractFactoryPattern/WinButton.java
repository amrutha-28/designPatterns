package CreationalDesignPatterns.AbstractFactoryPattern;

public class WinButton implements Button{
    @Override
    public void paint() {
        // Render a button in Windows style.
        System.out.println("Render a button in Windows style.");
    }
}
