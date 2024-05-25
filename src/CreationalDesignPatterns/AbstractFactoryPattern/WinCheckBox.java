package CreationalDesignPatterns.AbstractFactoryPattern;

public class WinCheckBox implements CheckBox{
    @Override
    public void paint() {
        // Render a checkbox in Windows style.
        System.out.println("Render a checkbox in Windows style.");
    }
}
