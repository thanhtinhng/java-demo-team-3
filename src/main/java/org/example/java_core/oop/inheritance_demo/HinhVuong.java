package org.example.java_core.oop.inheritance_demo;

public class HinhVuong extends HinhChuNhat {

    public HinhVuong(int id, double chieuDaiCanh) {
        super(id, chieuDaiCanh, chieuDaiCanh);
        System.out.println("Ham khoi tao HinhVuong duoc goi.");
    }

    @Override
    public double tinhChuVi() {
        return chieuDai * 4;
    }

    @Override
    public String toString() {
        return "Hinh Vuong: id=" + id + ", Dien tich=" + tinhDienTich() + ", Chu vi=" + tinhChuVi();
    }

    @Override
    public double getChieuDai() {
        return super.getChieuDai();
    }

    @Override
    public double getChieuRong() {
        return super.getChieuRong();
    }
}
