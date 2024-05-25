package CreationalDesignPatterns.FactoryPattern;

abstract class Dialog {
    public abstract Button createButton();

    public void render(){
        Button okButton = createButton();
        okButton.onClick(this::closeDialog);
        okButton.render();

    }
    private void closeDialog(){
        System.out.println("Dialog Closed..!!");
    }
}
