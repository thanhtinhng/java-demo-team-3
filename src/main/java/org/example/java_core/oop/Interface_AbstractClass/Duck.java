package org.example.java_core.oop.Interface_AbstractClass;

public class Duck implements IDuckLike, ISound {

    @Override
    public void moveOnLand() {
        System.out.println("Vịt đi bộ..");
    }

    @Override
    public void fly() {
        System.out.println("Vịt bay..");
    }

    @Override
    public void swim() {
        System.out.println("Vịt bơi..");
    }

    @Override
    public void makeSound() {
        System.out.println("Quack quack...");
    }
}
