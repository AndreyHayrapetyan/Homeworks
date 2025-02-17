package StudentList;

import java.util.*;
import java.util.function.Consumer;
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

    public void calculateAge(Function<String, Integer> birthYearToAge) {
        this.age = 2025 - birthYearToAge.apply(this.birthYear);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", grade=" + grade + ", birthYear='" + birthYear + "'}";
    }
}