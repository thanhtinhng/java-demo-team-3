package org.example.java_core.oop.Interface_AbstractClass;

public class CompareAbstractClass {

    abstract class DuckLike {
        // Biến thường
        int speed;

        // Hằng số
        final int MAX_SPEED = 20;

        // Biến tĩnh
        static int weight = 2;

        // Hằng số tĩnh
        static final String color = "White";

        // Constructor
        public DuckLike() {
            System.out.println("Vehicle created");
        }

        // Phương thức thường
        void sound() {
            System.out.println("Quack quack...");
        }

        // Phương thức tĩnh
        static void showColor() {
            System.out.println("Color: " + color);
        }

        // Phương thức trừu tượng
        abstract void run();
    }

    // Class con kế thừa abstract class
    class Swan extends DuckLike {
        @Override
        void run() {
            System.out.println("Swan is running..");
        }
    }

}
