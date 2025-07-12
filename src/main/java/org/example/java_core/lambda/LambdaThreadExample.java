package org.example.java_core.lambda;

public class LambdaThreadExample {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Thread đang chạy bằng lambda!");
        };
        new Thread(task).start();
    }
}
