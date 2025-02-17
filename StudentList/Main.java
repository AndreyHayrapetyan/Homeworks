package StudentList;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

import static StudentList.StudentProcessor.processStudents;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Ashot", "2002", 81.3),
                new Student("Robert", "2005", 98.5),
                new Student("Karen", "2004", 52.0),
                new Student("Garnik", "2000", 73.4)
        ));

        students.forEach(s -> s.calculateAge(Integer::parseInt));

        processStudents(students, s -> System.out.println(s));

        processStudents(students, System.out::println);

        processStudents(students, s -> s.grade *= 1.1);

        processStudents(students, s -> {
            if (s.grade > 90) System.out.println(s.name);
        });

        processStudents(students, StudentProcessor::printHighScore);
    }


}

