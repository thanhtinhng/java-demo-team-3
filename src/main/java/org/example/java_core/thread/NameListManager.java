package org.example.java_core.thread;
import java.util.ArrayList;
import java.util.List;

public class NameListManager {
    private String lastName = "";
    private int nameCount = 0;
    private final List<String> nameList = new ArrayList<>();

    public void addName(String name) {
        synchronized (this) {
            lastName = name;
            nameCount++;
        }

        nameList.add(name);
    }

    public void printNames() {
        System.out.println("Total: " + nameCount + ", Last: " + lastName);
        System.out.println("All names: " + nameList);
    }

    public static void main(String[] args) throws InterruptedException {
        NameListManager manager = new NameListManager();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) manager.addName("A" + i);
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) manager.addName("B" + i);
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        manager.printNames();
    }
}
