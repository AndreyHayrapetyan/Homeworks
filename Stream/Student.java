package Stream;
import java.util.*;
import java.util.function.Function;

public class Student {
    String name;
    int age;
    double grade;
    String birthYear;

    public Student(String name, String birthYear, double grade) {
        this.name = name;
        this.birthYear = birthYear;
        this.grade = grade;
    }

    public int getAge(){
        return age;
    }

    public void calculateAge(Function<String, Integer> birthYearToAge) {
        this.age = 2025 - birthYearToAge.apply(this.birthYear);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", grade=" + grade + ", birthYear='" + birthYear + "'}";
    }

    public static List<Student> generateRandomStudents(int count) {
        Random random = new Random();
        List<Student> studentList = new ArrayList<>();

        String[] names = {"Arsen", "Karen", "Anna", "David", "Ani", "Gurgen", "Ashot", "Alen", "Mane", "Levon",
                "Karen", "Lusine", "Smbat", "Armine", "Arpi", "Anush", "Vardan", "Artur", "Sophia", "Grigor"};

        for (int i = 0; i < count; i++) {
            String name = names[random.nextInt(names.length)];
            String birthYear = String.valueOf(1990 + random.nextInt(18));
            double grade = Math.round((random.nextDouble() * 100) * 10.0) / 10.0;

            Student student = new Student(name, birthYear, grade);


            Function<String, Integer> birthYearToAge = year -> Integer.parseInt(year);
            student.calculateAge(birthYearToAge);

            studentList.add(student);
        }
        return studentList;
    }
}