package org.example.java_core.thread;

public class IOTask implements Runnable{

    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        System.out.println(ct.getName() + " started");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(ct.getName() + " was interrupted");
        }

        System.out.println(ct.getName() + " finished");
    }

    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName() + " started");

        Thread t2 = new Thread(new IOTask());
        t2.setName("Runnable-Thread");

        t2.start();

        System.out.println(t1.getName() + " starts " + t2.getName());
        System.out.println(t1.getName() + " finished");
    }
}
