package CreationalDesignPatterns.FactoryPattern;

public class APP {
    private Dialog dialog;

    public void initialize() {
        String config = readApplicationConfigFile();

        if ("Windows".equals(config)) {
            dialog = new WindowsDialog();
        } else if ("Web".equals(config)) {
            dialog = new WebDialog();
        } else {
            throw new RuntimeException("Error! Unknown operating system.");
        }
    }

    private String readApplicationConfigFile() {
        return "Web";
    }
    public void main() {
        this.initialize();
        dialog.render();
    }
    public static void main(String[] args) {
        APP app = new APP();
        app.main();
    }
}
