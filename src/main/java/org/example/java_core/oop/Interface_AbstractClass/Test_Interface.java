package org.example.java_core.oop.Interface_AbstractClass;

public class Test_Interface {
    public static void main(String[] args) {

        System.out.println("--- Interface Demo ---");
        Duck duck = new Duck();
        duck.makeSound();
        duck.moveOnLand();
        duck.swim();
        duck.fly();
        duck.land();
        IFlyable.displayType();

    }

}
