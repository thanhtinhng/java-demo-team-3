package org.example.java_core.Practice.Practice2;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class SanhSu extends HangHoa {
    private String nhaSanXuat;
    private Date ngayNhapKho;

    public SanhSu(String maHang, String tenHang, int soLuongTonKho, double donGia,
                  String nhaSanXuat, Date ngayNhapKho) {
        super(maHang, tenHang, soLuongTonKho, donGia);
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapKho = ngayNhapKho;
    }

    @Override
    public double tinhVAT() {
        return donGia * soLuongTonKho * VAT10;
    }

    @Override
    public String danhGia() {
        long diff = new Date().getTime() - ngayNhapKho.getTime();
        long days = TimeUnit.MILLISECONDS.toDays(diff);
        if (soLuongTonKho > 50 && days > 10) {
            return "Bán chậm";
        }
        return "Không đánh giá";
    }
}
