package Cars;

public class MotorCycle extends Car {
    MotorCycle() {
        super(2);
    }

    @Override
    public void startDriving() {
        if (!getIsDriving()) {
            setDriving(true);
            System.out.println("MotorCycle started driving");
        } else {
            System.out.println("MotorCycle is stopped ");
        }
    }
}
