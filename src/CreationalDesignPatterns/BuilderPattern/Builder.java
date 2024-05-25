package CreationalDesignPatterns.BuilderPattern;

public interface Builder {
    void reset();
    void setSeats(int number);
    void setEngine(String engine);
    void setTripComputer(boolean tripComputer);
    void setGPS(boolean gps);
}
