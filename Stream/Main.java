package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> student = Student.generateRandomStudents(20);

        student.forEach(System.out::println);

        System.out.println("----------------------");

       List<Student> filteredStudents = student.stream()
                        .filter(student1 -> student1.age >= 18 && student1.age <= 30)
                        .filter(student1 -> student1.grade >= 60 && student1.grade <= 80)
               .sorted(Comparator.comparing(Student::getAge))
                        .collect(Collectors.toList());

        filteredStudents.forEach(System.out::println);

        System.out.println("-----------------------");

        filteredStudents.forEach(student1 -> {
            if (student1.grade <= 69){
                student1.grade *= 1.15;
            }
        });

        filteredStudents.forEach(System.out::println);

        System.out.println("-----------------------");

        Map<Integer, Long> countStudents = student.stream()
                .collect(Collectors.groupingBy(student1 -> student1.age, Collectors.counting()));

        for(Map.Entry<Integer, Long> entry : countStudents.entrySet()){
            System.out.println("Age " + entry.getKey() + ", " + " Count " + entry.getValue());
        }

        OptionalDouble averageGrade = student.stream()
                .filter(student1 -> student1.age >= 20)
                .mapToDouble(s -> s.grade)
                .average();

        System.out.println("Average grade is " + averageGrade);

        System.out.println("-----------------------");

        boolean above45 = student.stream()
                .allMatch(s -> s.grade > 45);

        if(above45){
            System.out.println("All grades are above 45 ");
        } else {
            System.out.println("Not all grades are above 45 ");
        }

        System.out.println("-----------------------------");

        Optional<Student> minGrade = student.stream()
                .min(Comparator.comparingDouble(s -> s.grade));

        minGrade.ifPresentOrElse(
                s -> System.out.println("The lowest grade student " + s),
                () -> System.out.println("No info ")
        );
        System.out.println("------------------------------");

        String sortedNames = student.stream()
                .map(s -> s.name)
                .sorted()
                .collect(Collectors.joining(", "));

        System.out.println("Students names " + sortedNames);

        System.out.println("-------------------------------");

        Map<String, List<Student>> groupedStudents = student.stream()
                .collect(Collectors.groupingBy(s -> {
                    if (s.grade < 60) return "Below 60 ";
                    else if (s.grade <= 70) return "60 - 70";
                    else return "Above 70 ";
                }));

        groupedStudents.forEach((category, studentList) -> {
            System.out.println( category + ":");
            studentList.forEach(System.out::println);
            System.out.println();
        });

        System.out.println("-----------------------------");

        Optional<Student> minGradeStudent = student.stream()
                .min(Comparator.comparingInt(s -> s.age));

        minGradeStudent.ifPresentOrElse(
                s -> System.out.println("The youngest " + s),
                () -> System.out.println("There is no youngest student")
        );
    }
}
