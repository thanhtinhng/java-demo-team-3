package org.example.java_core.generics;

public class GenericsType<T> {
    private T t;

    public T get() {
        return this.t;
    }

    public void set(T t1) {
        this.t = t1;
    }

    public static void main(String args[]) {
        // Generic với kiểu cụ thể
        GenericsType<String> type = new GenericsType<>();
        type.set("Sompo system");
        System.out.println("String box: " + type.get()); // In: Sompo system

        // Generic với Object để dùng đa kiểu
        GenericsType<Object> type1 = new GenericsType<>();
        type1.set("Sompo system");
        type1.set(10); // Ghi đè
        System.out.println("Object box: " + type1.get()); // In: 10
    }
}
