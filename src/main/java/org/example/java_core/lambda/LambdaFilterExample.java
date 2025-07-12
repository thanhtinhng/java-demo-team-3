package org.example.java_core.lambda;

import java.util.*;
import java.util.stream.*;

public class LambdaFilterExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());

        System.out.println("Số chẵn: " + evenNumbers);
    }
}
