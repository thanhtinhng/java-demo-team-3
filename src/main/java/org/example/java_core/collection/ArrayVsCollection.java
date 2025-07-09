package org.example.java_core.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayVsCollection {
    public static void main(String[] args) {

        // 1. Array

        //array int
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        System.out.print("array number: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        try {
            // Array String - object
            String[] fruits = new String[2];
            fruits[0] = "apple";
            fruits[1] = "banana";

            // Gán sai kiểu dữ liệu (nếu ép kiểu không phù hợp sẽ lỗi lúc runtime khi ép)
            Object[] objArray = fruits; // mảng String là object
            objArray[1] = "orange";     // OK
            objArray[0] = String.valueOf(123); // không lỗi
            objArray[0] = Integer.valueOf(123); // sẽ lỗi vì objArray thực chất trỏ đến String[]

        } catch (ArrayStoreException e) {
            System.out.println("\nArray Type Error: " + e.getMessage());
        }


        // 2. Collection

        List<String> animals = new ArrayList<>(); //không cần khai báo bao nhiêu phần tử cần cấp phát bộ nhớ
        animals.add("dog");
        animals.add("cat");
        animals.add("chicken");
        System.out.println("\nAnimal list: " + animals);

        //Collection chỉ lưu Object
        // List<int> numbers_AList = new ArrayList<>(); -> lỗi vì Collection không lưu primitive
        List<Integer> numbers_AList = new ArrayList<>();
        numbers_AList.add(1);
        numbers_AList.add(2);
        numbers_AList.add(3);
        System.out.println("\nArrayList numbers: " + numbers_AList);

        //Collection có thể lưu các object có nhiều kiểu dữ liệu khác nhau
        List<Object> objects_AList = new ArrayList<>();
        objects_AList.add(1);
        objects_AList.add("abc");
        objects_AList.add(2.9);
        System.out.println("\nArrayList objects: " + objects_AList);
    }
}
