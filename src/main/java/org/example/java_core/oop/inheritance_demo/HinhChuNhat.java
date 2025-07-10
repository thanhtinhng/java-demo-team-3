package org.example.java_core.oop.inheritance_demo;

public class HinhChuNhat extends HinhHoc {
    protected double chieuDai;
    protected double chieuRong;

    public HinhChuNhat(int id, double chieuDai, double chieuRong) {
        super(id);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
        System.out.println("Ham khoi tao HinhChuNhat duoc goi.");
    }

    @Override
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    @Override
    public double tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    @Override
    public String toString() {
        return "Hinh Chu Nhat: id=" + id + ", Dien tich=" + tinhDienTich() + ", Chu vi=" + tinhChuVi();
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }
}
