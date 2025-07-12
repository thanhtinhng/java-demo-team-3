package org.example.java_core.lambda;

import java.util.function.Consumer;

public class LambdaMultipleStatements {
    public static void main(String[] args) {
        Consumer<Integer> squareAndPrint = n -> {
            int result = n * n;
            System.out.println("Bình phương: " + result);
        };
        squareAndPrint.accept(6);
    }
}
