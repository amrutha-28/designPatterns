package CreationalDesignPatterns.BuilderPattern;

public class Manual {
    private String seatsInfo;
    private String engineInfo;
    private String tripComputerInfo;
    private String gpsInfo;

    // Getters and setters
    public void setSeatsInfo(String seatsInfo) {
        this.seatsInfo = seatsInfo;
    }

    public void setEngineInfo(String engineInfo) {
        this.engineInfo = engineInfo;
    }

    public void setTripComputerInfo(String tripComputerInfo) {
        this.tripComputerInfo = tripComputerInfo;
    }

    public void setGPSInfo(String gpsInfo) {
        this.gpsInfo = gpsInfo;
    }

    @Override
    public String toString() {
        return "Manual [seatsInfo=" + seatsInfo + ", engineInfo=" + engineInfo + ", tripComputerInfo=" + tripComputerInfo + ", gpsInfo=" + gpsInfo + "]";
    }
}
