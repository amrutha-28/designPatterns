package CreationalDesignPatterns.FactoryPattern;

class WindowsDialog extends Dialog {
    @Override
    public Button createButton(){
        return new WindowsButton();
    }

}
