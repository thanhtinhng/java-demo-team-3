
package org.example.java_core.Practice.Practice2;

public class DienTu extends HangHoa {
    private int soThangBaoHanh;
    private double congSuatTieuThu;

    public DienTu(String maHang, String tenHang, int soLuongTonKho, double donGia,
                  int soThangBaoHanh, double congSuatTieuThu) {
        super(maHang, tenHang, soLuongTonKho, donGia);
        this.soThangBaoHanh = soThangBaoHanh;
        this.congSuatTieuThu = congSuatTieuThu;
    }

    @Override
    public double tinhVAT() {
        return donGia * soLuongTonKho * VAT10;
    }

    @Override
    public String danhGia() {
        return soLuongTonKho < 3 ? "Đã bán" : "Không đánh giá";
    }
}
