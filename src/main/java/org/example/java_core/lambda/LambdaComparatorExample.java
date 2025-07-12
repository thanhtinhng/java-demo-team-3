
package org.example.java_core.lambda;

import java.util.*;

class Student {
    String name;
    double grade;

    Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String toString() {
        return name + " - " + grade;
    }
}

public class LambdaComparatorExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Linh", 8.5),
            new Student("Nam", 7.2),
            new Student("An", 9.0)
        );

        // Sắp xếp theo điểm giảm dần
        students.sort((s1, s2) -> Double.compare(s2.grade, s1.grade));

        System.out.println("Danh sách sau khi sắp xếp theo điểm:");
        students.forEach(System.out::println);
    }
}
