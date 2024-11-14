package Buildings;

public class Hospital extends Building{
    private int rooms;
    private String[] diseases;
    private int staff;

    public Hospital(int drainageSystem, int electricity, int rooms, int staff){
        super(drainageSystem, electricity);
        this.staff = staff;
        this.rooms = rooms;
        this.diseases = new String[]{"Cold", "Flu", "Diabetes", "Cancer", "COVID"};
    }

    public int getRooms() {
        return rooms;
    }

    public int getStaff() {
        return staff;
    }

    public void reomveMember(String name){
        if(staff > 0){
            staff--;
            System.out.println(name + "removed from memebers ");
        } else {
            System.out.println("All members have been removed ");
            System.exit(1);
        }
    }
}
