package CreationalDesignPatterns.BuilderPattern;

public class ManualBuilder implements Builder {
    private Manual manual;

    public ManualBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int number) {
        this.manual.setSeatsInfo("Seats: " + number);
    }

    @Override
    public void setEngine(String engine) {
        this.manual.setEngineInfo("Engine: " + engine);
    }

    @Override
    public void setTripComputer(boolean tripComputer) {
        this.manual.setTripComputerInfo("Trip Computer: " + (tripComputer ? "Enabled" : "Disabled"));
    }

    @Override
    public void setGPS(boolean gps) {
        this.manual.setGPSInfo("GPS: " + (gps ? "Enabled" : "Disabled"));
    }

    public Manual getProduct() {
        Manual product = this.manual;
        this.reset();
        return product;
    }
}
