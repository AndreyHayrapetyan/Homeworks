package HeatingSystem;

public class ElectricBoiler extends Boiler {
    public ElectricBoiler(String brand, double capacity, double energyEfficiency, double pressure) {
        super(brand, "Electric", capacity, energyEfficiency, pressure);
    }

    @Override
    public double calculateMonthlyGasConsumption(double area, double avgTemp) {
        return 0;
    }

    @Override
    public double calculateMonthlyElectricityConsumption(double area, double avgTemp) {
        return (area * (20 - avgTemp) * energyEfficiency) / 100;
    }
}

