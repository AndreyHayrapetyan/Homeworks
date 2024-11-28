package Cars;

public class Main {
    public static void main(String[] args) {
        FuelMotorCar fuelMotorCar = new FuelMotorCar();
        DieselMotorCar dieselMotorCar = new DieselMotorCar();
        HybridElectroCar hybridElectroCar = new HybridElectroCar();
        MotorCycle motorCycle = new MotorCycle();

        fuelMotorCar.switchToGas();
        fuelMotorCar.startDriving();
        fuelMotorCar.switchToGas();
        fuelMotorCar.startDriving();

        dieselMotorCar.startDriving();

        hybridElectroCar.switchToGas();
        hybridElectroCar.startDriving();
        hybridElectroCar.switchToGas();
        hybridElectroCar.startDriving();

        motorCycle.startDriving();

    }
}
