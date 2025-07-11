package org.example.java_core.thread;

public class IOThread extends Thread{

    @Override
    public void run() {
        System.out.println(this.getName() + " started");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(this.getName() + " was interrupted");
        }

        System.out.println(this.getName() + " finished");
    }

    public static void main(String[] args) {

        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName() + " started");

        Thread t2 = new IOThread();
        t2.setName("Extend-Thread");

        t2.start();

        System.out.println(t1.getName() + " starts " + t2.getName());
        System.out.println(t1.getName() + " finished");
    }
}
