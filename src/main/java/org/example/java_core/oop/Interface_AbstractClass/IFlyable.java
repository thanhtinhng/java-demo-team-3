package org.example.java_core.oop.Interface_AbstractClass;

public interface IFlyable {

    static final int MAX_ALTITUDE = 10000;

    void fly();

    // Phương thức mặc định
    default void land() {
        System.out.println("Hạ cánh an toàn...");
    }

    // Phương thức static
    static void displayType() {
        System.out.println("Flyable interface");
    }
}
