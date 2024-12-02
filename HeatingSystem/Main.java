package HeatingSystem;

public class Main {
    public static void main(String[] args) {
        Boiler gasBoiler = new GasBoiler("Bosch", 150, 90, 1.5);
        Boiler electricBoiler = new ElectricBoiler("LG", 100, 95, 1.2);

        HeatingSystem apartmentSystem = new HeatingSystem(gasBoiler, "Apartment", 85);
        HeatingSystem houseSystem = new HeatingSystem(electricBoiler, "Detached", 200);

        double avgTemp = 10;

        printHeatingSystemDetails(apartmentSystem, avgTemp);
        System.out.println();
        printHeatingSystemDetails(houseSystem, avgTemp);
    }

    private static void printHeatingSystemDetails(HeatingSystem system, double avgTemp) {
        Boiler boiler = system.getBoiler();
        System.out.println("House Type: " + system.getHouseType());
        System.out.println("Area: " + system.getArea() + " m²");
        System.out.println("Boiler Details:");
        System.out.println("Brand: " + boiler.getBrand());
        System.out.println("Type: " + boiler.getType());
        System.out.println("Capacity: " + boiler.getCapacity() + " L");
        System.out.println("Efficiency: " + boiler.getEnergyEfficiency() + "%");
        System.out.println("Pressure: " + boiler.getPressure() + " bars");
        System.out.println("Monthly Gas Consumption: " + system.calculateMonthlyGasConsumption(avgTemp) + " m³");
        System.out.println("Monthly Electricity Consumption: " + system.calculateMonthlyElectricityConsumption(avgTemp) + " kWh");
    }
}
