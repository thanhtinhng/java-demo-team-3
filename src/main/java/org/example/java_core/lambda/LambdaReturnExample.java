package org.example.java_core.lambda;

import java.util.function.Function;

public class LambdaReturnExample {
    public static void main(String[] args) {
        Function<Integer, Integer> square1 = x -> x * x; // Không return
        Function<Integer, Integer> square2 = x -> { return x * x; }; // Có return

        System.out.println(square1.apply(4)); // 16
        System.out.println(square2.apply(5)); // 25
    }
}
