package org.example.java_core.Practice.Practice2;

import java.util.Date;

public abstract class HangHoa {
    protected String maHang;
    protected String tenHang;
    protected int soLuongTonKho;
    protected double donGia;

    protected static final double VAT10 = 0.10;
    protected static final double VAT5 = 0.05;

    public HangHoa(String maHang, String tenHang, int soLuongTonKho, double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTonKho = soLuongTonKho;
        this.donGia = donGia;
    }

    public abstract double tinhVAT();
    public abstract String danhGia();
}
