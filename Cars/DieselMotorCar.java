package Cars;

public class DieselMotorCar extends Car{
    DieselMotorCar(){
        super(4);
    }

    @Override
    public void startDriving() {
        if(!getIsDriving()){
            setDriving(true);
            System.out.println("Diesel Car engine is launched ");
        } else {
            System.out.println("Diesel Car is stopped ");
        }
    }
}
