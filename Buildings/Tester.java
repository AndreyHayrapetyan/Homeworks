package Buildings;

public class Tester {
    public static void main(String[] args) {
        Building building = new Building(3, 220);
        System.out.println("Electricity " + building.getElectricity());
        System.out.println("Drainage System " + building.getDrainageSystem());

        School school = new School(3, 220, 6, 4);
        school.addStudent("Laura", "Rasmussen", 15);
        school.addStudent("Will", "Washington", 16);
        school.addStudent("Will", "Washington", 16);
        school.addStudent("Will", "Washington", 16);
        school.addStudent("Will", "Washington", 16);
        school.addStudent("Will", "Washington", 16);
        school.addStudent("Will", "Washington", 16);

        System.out.println("Number of students " + school.getStudentCount());
        System.out.println("Number of teachers " + school.getTeachers());

        Hospital hospital = new Hospital(3, 220, 6, 10);
        System.out.println("Number of rooms " + hospital.getRooms());
        System.out.println("Number of staff members " + hospital.getStaff());

        hospital.reomveMember("Laura Rasmussen");

        System.out.println("Number of staff members " + hospital.getStaff());
    }
}