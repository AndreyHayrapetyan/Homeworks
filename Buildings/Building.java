package Buildings;

public class Building   {
    private int electricity;
    private int drainageSystem;

    public Building(int electricity, int drainageSystem){
        this.electricity = electricity;
        this.drainageSystem = drainageSystem;
    }

    public int getDrainageSystem() {
        return drainageSystem;
    }

    public int getElectricity() {
        return electricity;
    }
}
