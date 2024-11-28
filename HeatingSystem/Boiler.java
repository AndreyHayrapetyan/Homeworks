package HeatingSystem;

public abstract class Boiler {
    protected String brand;
    protected String type;
    protected double capacity;
    protected double energyEfficiency;
    protected double pressure;

    public Boiler(String brand, String type, double capacity, double energyEfficiency, double pressure) {
        this.brand = brand;
        this.type = type;
        this.capacity = capacity;
        this.energyEfficiency = energyEfficiency;
        this.pressure = pressure;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getEnergyEfficiency() {
        return energyEfficiency;
    }

    public double getPressure() {
        return pressure;
    }

    public abstract double calculateMonthlyGasConsumption(double area, double avgTemp);
    public abstract double calculateMonthlyElectricityConsumption(double area, double avgTemp);
}

