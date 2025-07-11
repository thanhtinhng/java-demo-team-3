package org.example.java_core.control_statement;

public class ConditionalStatementDemo {
    //if statement
    public static void compare(int a, int b) {
        if (a > b) {
            System.out.println("a is bigger than b");
        } else if (a < b) {
            System.out.println("a is smaller than b");
        } else {
            System.out.println("a is equal to b");
        }
    }

    //switch statement
    public static void day(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int day = 5;
        compare(a, b);
        day(day);
    }
}
