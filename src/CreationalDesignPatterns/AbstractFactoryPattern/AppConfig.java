package CreationalDesignPatterns.AbstractFactoryPattern;

public class AppConfig {
    public static void main(String[] args) {
        String config = readApplicationConfigFile();

        GUIFactory factory;
        if ("Windows".equals(config)) {
            factory = new WinFactory();
        } else if ("Mac".equals(config)) {
            factory = new MacFactory();
        } else {
            throw new RuntimeException("Error! Unknown operating system.");
        }

        App app = new App(factory);
        app.createUI();
        app.paint();
    }

    private static String readApplicationConfigFile() {
        // Simulate reading from a config file.
        // For the purpose of this example, let's assume it's "Windows".
        return "Windows";
    }
}
