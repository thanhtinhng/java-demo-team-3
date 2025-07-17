package org.example.java_core.collection;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        // HashMap - lưu key-value
        Map<Integer, String> animalMap = new HashMap<>();
        animalMap.put(0, "dog");
        animalMap.put(1, "cat");
        animalMap.put(2, "duck");
        animalMap.put(3, "chicken");
        animalMap.put(4, "horse");
        System.out.println(animalMap);

        // Thêm phần tử tại key mong muốn (thay thế nếu key đã có)
        animalMap.put(2, "bear"); // ghi đè "duck"
        System.out.println("Sau khi put(2, \"bear\"): " + animalMap);

        // get phần tử theo key
        System.out.println("key = 1: " + animalMap.get(1)); // cat

        // remove theo key
        animalMap.remove(1); // xóa key = 1
        System.out.println("Sau khi remove(1): " + animalMap);

        // size()
        int size = animalMap.size();
        System.out.println("Kich thuoc của map: " + size);

        // tập hợp tất cả các key
        Set<Integer> keys = animalMap.keySet();
        System.out.println("Cac key trong map: " + keys);

        // putAll(Map)
        Map<Integer, String> moreAnimals = new HashMap<>();
        moreAnimals.put(5, "lion");
        moreAnimals.put(6, "tiger");
        moreAnimals.put(7, "zebra");
        moreAnimals.put(8, "shark");
        moreAnimals.put(9, "butterfly");

        animalMap.putAll(moreAnimals);
        System.out.println("Sau khi putAll: " + animalMap);

        // containsKey / containsValue
        boolean hasLion = animalMap.containsValue("lion");
        boolean hasKey99 = animalMap.containsKey(99);
        System.out.println("Contains value 'lion': " + hasLion);
        System.out.println("Contains key 99: " + hasKey99);

        // clear()
        animalMap.clear();
        System.out.println("Sau khi clear(): " + animalMap);

        // loop qua map (dùng entry)
        animalMap.put(0, "dog");
        animalMap.put(1, "cat");
        animalMap.put(2, "duck");
        animalMap.put(3, "chicken");
        animalMap.put(4, "horse");

        System.out.println("\nLoop qua map:");

        for (Map.Entry<Integer, String> entry : animalMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("\n" + animalMap.keySet());
        System.out.println(animalMap.values());
        System.out.println(animalMap.entrySet());
    }
}
