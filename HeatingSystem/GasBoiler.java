package HeatingSystem;

public class GasBoiler extends Boiler {
    public GasBoiler(String brand, double capacity, double energyEfficiency, double pressure) {
        super(brand, "Gas", capacity, energyEfficiency, pressure);
    }

    @Override
    public double calculateMonthlyGasConsumption(double area, double avgTemp) {
        return (area * (20 - avgTemp) * (1 - energyEfficiency / 100)) / 100;
    }

    @Override
    public double calculateMonthlyElectricityConsumption(double area, double avgTemp) {
        return 0;
    }
}

