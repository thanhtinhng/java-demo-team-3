package org.example.java_core.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        // ArrayList
        List<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("cat");
        animals.add("duck");
        animals.add("chicken");
        animals.add("horse");
        System.out.println(animals);

        //Thêm phần tử vào vị trí mong muốn (index = ..)
        animals.add(2, "bear");
        System.out.println(animals);

        //get phần tử thứ ..
        System.out.println(animals.get(1)); //cat

        //set phần tử thứ ..
        animals.set(2, "cow");
        System.out.println(animals);

        //Lấy kích thước array list
        int size = animals.size();
        System.out.println(size);

        // addAll(Collection c)
        List<String> moreAnimals = new ArrayList<>();
        moreAnimals.add("lion");
        moreAnimals.add("tiger");
        moreAnimals.add("zebra");
        moreAnimals.add("shark");
        moreAnimals.add("butterfly");
        animals.addAll(moreAnimals);
        System.out.println("Sau khi addAll([lion, tiger, zebra, shark, butterfly]): " + animals);

        // remove(Object element)
        boolean removedCat = animals.remove("dog");
        boolean removedPanda = animals.remove("panda"); // khong co panda trong arraylist
        System.out.println("Sau khi remove(\"dog\"): " + animals + " | Removed: " + removedCat);
        System.out.println("Sau khi remove(\"panda\"): " + removedPanda);

        // removeAll(Collection c)
        List<String> toRemove = Arrays.asList("horse", "cow");
        animals.removeAll(toRemove);
        System.out.println("Sau khi removeAll([horse, cow]): " + animals);

        // retainAll(Collection c)
        List<String> toKeep = Arrays.asList("shark", "butterfly");
        animals.retainAll(toKeep);
        System.out.println("Sau khi retainAll([shark, butterfly]): " + animals);

        // 5. contains(Object element)
        boolean hasDuck = animals.contains("duck");
        boolean hasCat = animals.contains("shark");
        System.out.println("Contains 'duck': " + hasDuck);
        System.out.println("Contains 'shark': " + hasCat);

        // 6. containsAll(Collection c)
        List<String> checkList = Arrays.asList("zebra", "butterfly");
        boolean containsAll = animals.containsAll(checkList);
        System.out.println("Contains all [zebra, butterfly]: " + containsAll);

        // 7. clear()
        animals.clear();
        System.out.println("Sau khi clear(): " + animals);

        //sort ArrayList
        System.out.println("\nSort: ");
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(33);
        numbers.add(15);
        numbers.add(20);
        numbers.add(34);
        numbers.add(8);
        numbers.add(12);

        System.out.println("Truoc khi sort: " + numbers);
        Collections.sort(numbers);
        System.out.println("Sau khi sort: " + numbers);

        //Sort ngược (lớn đến bé)
        numbers.sort(Collections.reverseOrder());
        System.out.println("Sort nguoc: " + numbers);

        //loop
        System.out.println("\nloop: ");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }

        System.out.print("\n");

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
