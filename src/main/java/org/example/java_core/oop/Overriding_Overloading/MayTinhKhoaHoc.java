package org.example.java_core.oop.Overriding_Overloading;

import java.text.DecimalFormat;

public class MayTinhKhoaHoc extends MayTinhToan {

    @Override
    public double tinhTong(double a, double b) {
        System.out.println("MayTinhKhoaHoc: tinhTong(double, double)");

        double tong = a + b;

        DecimalFormat df = new DecimalFormat("0.###E0");
        String ketQua = df.format(tong);

        System.out.println("Ket qua: " + ketQua);
        return tong;
    }

    @Override
    public String toString() {
        return "Day la May tinh khoa hoc.";
    }
}
