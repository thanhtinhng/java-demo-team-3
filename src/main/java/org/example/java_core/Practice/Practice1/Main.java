package org.example.java_core.Practice.Practice1;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20, 1);
        Circle circle = new Circle(29);

        System.out.println("Rectangle: ");
        System.out.println("Area = " + rectangle.getArea());
        System.out.print("Perimeter = " + rectangle.getPerimeter());

        System.out.println("\nCircle: ");
        System.out.println("Area = " + circle.getArea());
        System.out.println("Circumference = " + circle.getCircumference());
    }
}
