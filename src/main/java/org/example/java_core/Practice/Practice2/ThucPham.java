package org.example.java_core.Practice.Practice2;

import java.util.Date;

public class ThucPham extends HangHoa {
    private Date ngaySX;
    private Date hanSD;
    private String nhaCungCap;

    public ThucPham(String maHang, String tenHang, int soLuongTonKho, double donGia,
                    Date ngaySX, Date hanSD, String nhaCungCap) {
        super(maHang, tenHang, soLuongTonKho, donGia);
        this.ngaySX = ngaySX;
        this.hanSD = hanSD;
        this.nhaCungCap = nhaCungCap;
    }

    @Override
    public double tinhVAT() {
        return donGia * soLuongTonKho * VAT5;
    }

    @Override
    public String danhGia() {
        Date now = new Date();
        if (soLuongTonKho > 0 && hanSD.before(now)) {
            return "Khó bán";
        }
        return "Không đánh giá";
    }
}
