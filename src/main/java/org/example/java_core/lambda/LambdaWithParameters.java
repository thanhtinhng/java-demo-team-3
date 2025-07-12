package org.example.java_core.lambda;

import java.util.function.BiFunction;

public class LambdaWithParameters {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("Tổng = " + add.apply(5, 3));
    }
}
