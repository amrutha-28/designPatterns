package CreationalDesignPatterns.BuilderPattern;

public class App {
    public void makeCar() {
        Director director = new Director();

        CarBuilder carBuilder1 = new CarBuilder();
        director.constructSportsCar(carBuilder1);
        Car car1 = carBuilder1.getProduct();
        System.out.println(car1);

        ManualBuilder manualBuilder1 = new ManualBuilder();
        director.constructSportsCar(manualBuilder1);
        Manual manual1 = manualBuilder1.getProduct();
        System.out.println(manual1);

        CarBuilder carBuilder2 = new CarBuilder();
        director.constructSUV(carBuilder2);
        Car car2 = carBuilder2.getProduct();
        System.out.println(car2);

        ManualBuilder manualBuilder2 = new ManualBuilder();
        director.constructSUV(manualBuilder2);
        Manual manual2 = manualBuilder2.getProduct();
        System.out.println(manual2);
    }

    public static void main(String[] args) {
        App app = new App();
        app.makeCar();
    }
}
