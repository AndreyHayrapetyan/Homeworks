package TeacherSalary;

public class Teacher {
    private String name;
    private String subject;
    private double w;
    private double salary;

    private static double k = 1.0;
    private static double MIN_SALARY = 56000;
    private static double minBaseSalary = k * MIN_SALARY;


    public Teacher(String name, String subject, double w) {
        this.name = name;
        this.subject = subject;
        this.w = (w >= 1) ? w : 1.0;
        this.salary = this.w * minBaseSalary;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    public static void setK(double k) {
        k = (k >= 1) ? k : 1.0;
        minBaseSalary = k * MIN_SALARY;
    }

    public static void setMinSalary(double minSalary) {
        MIN_SALARY = minSalary;
        minBaseSalary = k * MIN_SALARY;
    }
}
