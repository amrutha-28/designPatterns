package CreationalDesignPatterns.FactoryPattern;

public interface Button {
    void render();
    void onClick(Runnable f);
}
