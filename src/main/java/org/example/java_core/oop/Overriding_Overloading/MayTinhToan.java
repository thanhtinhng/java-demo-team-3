package org.example.java_core.oop.Overriding_Overloading;

public class MayTinhToan {

    public int tinhTong(int a, int b) {
        int s = a + b;
        System.out.println("MayTinhToan: int a + b = " + s);
        return s;
    }

    public int tinhTong(int a, int b, int c) {
        int s = a + b + c;
        System.out.println("MayTinhToan: int a + b + c = " + s);
        return s;
    }

    public double tinhTong(double a, double b) {
        double s = a + b;
        System.out.println("MayTinhToan: double a + b = " + s);
        return s;
    }

    @Override
    public String toString() {
        return "Day la MayTinhToan binh thuong";
    }
}
