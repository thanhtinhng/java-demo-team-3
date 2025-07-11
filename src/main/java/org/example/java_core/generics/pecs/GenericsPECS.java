
package org.example.java_core.generics.pecs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsPECS {

    // PE: Producer Extends - chỉ đọc từ list
    public static void printAnimals(List<? extends Animal> animals) {
        System.out.println("==> In danh sách animals:");
        for (Animal a : animals) {
            a.speak(); // OK
        }
        // animals.add(new Dog()); //  Không được phép thêm
    }

    // CS: Consumer Super - chỉ thêm vào list
    public static void addDogs(List<? super Dog> list) {
        list.add(new Dog()); //  Có thể thêm Dog

        System.out.println("==> Đã thêm Dog vào danh sách:");
        // Đọc ra thì chỉ có thể ép kiểu về Object hoặc phải ép về Dog
        for (Object obj : list) {
            if (obj instanceof Animal) {
                ((Animal) obj).speak();
            } else {
                System.out.println(obj);
            }
        }
    }

    public static void main(String[] args) {
        // Dùng ? extends để đọc từ danh sách các Dog
        List<Dog> dogList = Arrays.asList(new Dog(), new Dog());
        printAnimals(dogList); // OK

        List<Cat> catList = Arrays.asList(new Cat(), new Cat());
        printAnimals(catList); // OK

        // Dùng ? super để thêm Dog vào danh sách Animal
        List<Animal> animalList = new ArrayList<>();
        addDogs(animalList); // OK

        // Dùng ? super để thêm Dog vào danh sách Object
        List<Object> objectList = new ArrayList<>();
        addDogs(objectList); // OK
    }
}