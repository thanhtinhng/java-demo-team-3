package org.example.java_core.collection;

import java.util.*;


public class SetDemo {
    public static void main(String[] args) {

        // HashSet - không cho phép phần tử trùng lặp, không có sắp xếp thứ tự
        Set<String> animals = new HashSet<>();
        animals.add("dog");
        animals.add("cat");
        animals.add("duck");
        animals.add("chicken");
        animals.add("horse");
        System.out.println(animals);

        // Không thể add vào index cụ thể -> Chỉ dùng add(element)
        animals.add("bear");
        System.out.println(animals);

        // Không thể get theo index
        System.out.println("HashSet khong the get theo index");

        // Không thể set tại index -> phải remove rồi add phần tử mới
        animals.remove("bear");
        animals.add("cow");
        System.out.println("Sau khi thay the bear bang cow: " + animals);

        // remove(Object element)
        boolean removedDog = animals.remove("dog");
        boolean removedPanda = animals.remove("panda"); // không tồn tại
        System.out.println("Sau khi remove(\"dog\"): " + animals + " | Removed: " + removedDog);
        System.out.println("Sau khi remove(\"panda\"): " + removedPanda);

        // size()
        int size = animals.size();
        System.out.println("Kich thuoc HashSet: " + size);

        // addAll(Collection c)
        Set<String> moreAnimals = new HashSet<>();
        moreAnimals.add("lion");
        moreAnimals.add("tiger");
        moreAnimals.add("zebra");
        moreAnimals.add("shark");
        moreAnimals.add("butterfly");
        animals.addAll(moreAnimals);
        System.out.println("Sau khi addAll: " + animals);

        // removeAll(Collection c)
        Set<String> toRemove = new HashSet<>(Arrays.asList("horse", "cow"));
        animals.removeAll(toRemove);
        System.out.println("Sau khi removeAll([horse, cow]): " + animals);

        // retainAll(Collection c)
        Set<String> toKeep = new HashSet<>(Arrays.asList("shark", "butterfly"));
        animals.retainAll(toKeep);
        System.out.println("Sau khi retainAll([shark, butterfly]): " + animals);

        // contains(Object element)
        boolean hasDuck = animals.contains("duck");
        boolean hasShark = animals.contains("shark");
        System.out.println("Contains 'duck': " + hasDuck);
        System.out.println("Contains 'shark': " + hasShark);

        // containsAll(Collection c)
        Set<String> checkSet = new HashSet<>(Arrays.asList("shark", "butterfly"));
        boolean containsAll = animals.containsAll(checkSet);
        System.out.println("Contains all [shark, butterfly]: " + containsAll);

        // clear()
        animals.clear();
        System.out.println("Sau khi clear(): " + animals);

        // HashSet không thể sort trực tiếp vì không có thứ tự
        System.out.println("\nHashSet khong the sort truc tiep vì khong co thu tu");


        //loop
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);
        numbers.add(4); // 4 đã tồn tại. Vì là Set nên không cho phép phần tử trùng

        System.out.println("\nLoop:");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        } //out: 1 3 4

    }
}
