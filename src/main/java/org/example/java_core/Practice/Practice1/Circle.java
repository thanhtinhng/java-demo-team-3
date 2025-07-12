package org.example.java_core.Practice.Practice1;

public class Circle extends Shape {

    private double d;
    private double r;
    public Circle(double d) {
        super(d, d);
        this.d = d;
        this.r = d / 2;
    }

    public double getArea() {
        return Math.PI * r * r;
    }

    public double getCircumference() {
        return d * 3.14;
    }
}
