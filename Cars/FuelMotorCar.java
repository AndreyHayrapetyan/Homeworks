package Cars;

public class FuelMotorCar extends Car implements SupportGas{
    private boolean switchToGas;
    FuelMotorCar(){
        super(4);
    }
    @Override
    public void startDriving() {
        if (!getIsDriving()) {
            System.out.println(switchToGas ? "Fuel motor car is driving using gas" :
                    "Fuel motor car is driving using diesel");
            setDriving(true);
        } else {
            System.out.println("Fuel motor car is stopped ");
        }

    }

    @Override
    public void switchToGas() {
        switchToGas = !switchToGas;
        System.out.println(switchToGas ? "Fuel motor car switched to gas" :
                "Fuel motor car switched to diesel ");
    }
}
