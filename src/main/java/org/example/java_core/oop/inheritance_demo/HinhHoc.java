package org.example.java_core.oop.inheritance_demo;

public abstract class HinhHoc implements CoTheTinhDienTich {
    protected int id;

    public HinhHoc(int id) {
        this.id = id;
        System.out.println("Ham khoi tao HinhHoc duoc goi.");
    }

    public int getId() {
        return id;
    }

    public abstract double tinhChuVi();
}
