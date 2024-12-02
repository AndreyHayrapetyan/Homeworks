package HeatingSystem;

public class HeatingSystem {
    private Boiler boiler;
    private String houseType;
    private double area;

    public HeatingSystem(Boiler boiler, String houseType, double area) {
        this.boiler = boiler;
        this.houseType = houseType;
        this.area = area;
    }

    public double calculateMonthlyGasConsumption(double avgTemp) {
        return boiler.calculateMonthlyGasConsumption(area, avgTemp);
    }

    public double calculateMonthlyElectricityConsumption(double avgTemp) {
        return boiler.calculateMonthlyElectricityConsumption(area, avgTemp);
    }

    public Boiler getBoiler() {
        return boiler;
    }

    public String getHouseType() {
        return houseType;
    }

    public double getArea() {
        return area;
    }
}

