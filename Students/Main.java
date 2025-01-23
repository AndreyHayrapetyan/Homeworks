package Students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<StudentGrades> students = new ArrayList<>();

        students.add(new StudentGrades("Karen", 85, 78, 90));
        students.add(new StudentGrades("Arsen", 92, 80, 85));
        students.add(new StudentGrades("Artyom", 75, 88, 95));
        students.add(new StudentGrades("David", 88, 72, 89));

        Collections.sort(students, Comparator.comparingInt(StudentGrades::getMathKnowledge));

        System.out.println("Sorted students by Math knowledge:");
        for (StudentGrades student : students) {
            System.out.println(student);
        }

        int targetMathGrade = 85;
        StudentGrades foundStudent = findStudentByMathGrade(students, targetMathGrade);

        if (foundStudent != null) {
            System.out.println("\nFound student with Math grade " + targetMathGrade + ": " + foundStudent);
        } else {
            System.out.println("\nNo student found with Math grade " + targetMathGrade);
        }
    }

    public static StudentGrades findStudentByMathGrade(ArrayList<StudentGrades> students, int targetGrade) {
        for (StudentGrades student : students) {
            if (student.getMathKnowledge() == targetGrade) {
                return student;
            }
        }
        return null;
    }
}
