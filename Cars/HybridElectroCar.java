package Cars;

public class HybridElectroCar extends Car implements SupportGas{
    private boolean switchToGas = false;

    HybridElectroCar() {
        super(4);
    }

    @Override
    public void startDriving() {
        if (!getIsDriving()) {
            System.out.println(switchToGas ? "Hybrid electrocar is driving using gas" :
                    "Hybrid electrocar is driving using electricity");
            setDriving(true);
        } else {
            System.out.println("Hybrid electrocar is stopped");
        }
    }

    @Override
    public void switchToGas() {
        switchToGas = !switchToGas;
        System.out.println(switchToGas ? "Hybrid electrocar switched to gas" : "Hybrid electrocar switched to electricity");
    }
}
