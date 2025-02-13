package StudentList;

import java.util.List;
import java.util.function.Consumer;

public class StudentProcessor {
    public static void processStudents(List<Student> students, Consumer<Student> action) {
        for (Student student : students) {
            action.accept(student);
        }
    }

    public static void printHighScore(Student student) {
        if (student.grade > 90)
            System.out.println(student.name);
    }
}
