package org.example.java_core.oop.inheritance_demo;

public class HinhTamGiacDeu extends HinhHoc {
    private double chieuDaiCanh;
    private double chieuCao;

    public HinhTamGiacDeu(int id, double chieuDaiCanh, double chieuCao) {
        super(id);
        this.chieuDaiCanh = chieuDaiCanh;
        this.chieuCao = chieuCao;
        System.out.println("Ham khoi tao HinhTamGiacDeu duoc goi.");
    }

    @Override
    public double tinhDienTich() {
        return (chieuDaiCanh * chieuCao) / 2;
    }

    @Override
    public double tinhChuVi() {
        return chieuDaiCanh * 3;
    }

    @Override
    public String toString() {
        return "Hinh TG Deu: id=" + id + ", Dien tich=" + tinhDienTich() + ", Chu vi=" + tinhChuVi();
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public double getChieuDaiCanh() {
        return chieuDaiCanh;
    }
}
