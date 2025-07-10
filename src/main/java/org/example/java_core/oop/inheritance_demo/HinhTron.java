package org.example.java_core.oop.inheritance_demo;

public class HinhTron extends HinhHoc {

    private double banKinh;

    public HinhTron(int id, double banKinh) {
        super(id);
        this.banKinh = banKinh;
        System.out.println("Ham khoi tao HinhTron duoc goi.");
    }

    @Override
    public double tinhDienTich() {
        return banKinh * banKinh * Math.PI;
    }

    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    @Override
    public String toString() {
        return "Hinh Tron: id=" + id + ", Dien tich=" + tinhDienTich() + ", Chu vi=" + tinhChuVi();
    }

    public double getBanKinh() {
        return banKinh;
    }
}
