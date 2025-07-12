package org.example.java_core.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaForEach {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("An", "Bình", "Chi");

        System.out.println("Danh sách tên:");
        names.forEach(name -> System.out.println(name));
    }
}
