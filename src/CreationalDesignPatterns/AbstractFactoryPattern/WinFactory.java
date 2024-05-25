package CreationalDesignPatterns.AbstractFactoryPattern;

public class WinFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WinCheckBox();
    }

}
