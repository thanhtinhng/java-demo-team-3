package org.example.java_core.lambda;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;

public class PredicateInterfaceExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("An", "Linh", "Tom", "Minh", "Bo");

        // Predicate: tên dài hơn 3 ký tự
        Predicate<String> isLongName = name -> name.length() > 3;

        System.out.println("Tên dài hơn 3 ký tự:");
        names.stream()
             .filter(isLongName)
             .forEach(System.out::println);
    }
}
