package org.example.java_core.exception;
import java.io.IOException;
import java.util.Scanner;

// define exception
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

// exceptions
public class ExceptionsExample {

    // try-catch
    public static void divideZero() {
        try {
            int a[] = new int[7];
            a[4] = 10 / 0;

            System.out.println("First print statement in try block");

        } catch (ArithmeticException e) {
            System.out.println("Warning: ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Warning: ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Warning: Some other Exception");
        }
    }

    public static void divideWithFinally() {
        int x = 10;
        int y = 0;
        try {
            System.out.println("x / y = " + x / y);
        } catch (ArithmeticException e) {
            System.out.println("Warning: ArithmeticException");
        } finally {
            System.out.println("Finally block is always executed.");
        }
    }

    public static void nestedTry() {
        try {
            int[] a = new int[5];
            try {
                a[5] = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException");
            }
            a[10] = 50;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        } catch (Exception e) {
            System.out.println("Warning: Some other Exception");
        }
    }

    public static int sum(int num1, int num2) throws ArithmeticException {
        if (num1 == 0) {
            throw new ArithmeticException("first num is not valid");
        } else {
            System.out.println("Both num are valid");
            return num1 + num2;
        }
    }

    public static void checkCustomException(String input) throws MyException {
        if (input == null || input.isEmpty()) {
            throw new MyException("Input cannot be null or empty!");
        } else {
            System.out.println("Input is: " + input);
        }
    }

    public static void main(String[] args) {
        divideZero();
        divideWithFinally();
        nestedTry();

        //throw/throws
        try {
            int result = sum(0, 10);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Catch exception: " + e.getMessage());
        }

        //define
        try {
            checkCustomException("");
        } catch (MyException e) {
            System.out.println("Custom exception caught: " + e.getMessage());
        }
    }
}
