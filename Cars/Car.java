package Cars;

public abstract class Car {
    private int numberOfWheels;
    private boolean isDriving;

    Car(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }

    public abstract void startDriving();

    public void setDriving(boolean drive){
        isDriving = drive;
    }

    public boolean getIsDriving(){
        return isDriving;
    }
}
