package TeacherSalary;

public class Test {
    public static void main(String[] args) {
        Teacher.setK(1.5);
        Teacher.setMinSalary(56000);

        Teacher teacher1 = new Teacher("Alice", "Math",  2);
        Teacher teacher2 = new Teacher("Bob", "Physics",  1.1);
        Teacher teacher3 = new Teacher("Carol", "Chemistry",  0.8);

        System.out.println("Teacher 1 (" + teacher1.getName() + ") Salary: " + teacher1.getSalary());
        System.out.println("Teacher 2 (" + teacher2.getName() + ") Salary: " + teacher2.getSalary());
        System.out.println("Teacher 3 (" + teacher3.getName() + ") Salary: " + teacher3.getSalary());
    }
}
