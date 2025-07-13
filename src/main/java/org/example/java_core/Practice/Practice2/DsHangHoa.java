package org.example.java_core.Practice.Practice2;
import java.util.ArrayList;

public class DsHangHoa {
    private ArrayList<HangHoa> ds;

    public DsHangHoa() {
        ds = new ArrayList<>();
    }

    public boolean themHangHoa(HangHoa h) {
        for (HangHoa hang : ds) {
            if (hang.maHang.equals(h.maHang)) {
                return false; // Trùng mã
            }
        }
        ds.add(h);
        return true;
    }

    public void hienThiDanhSach() {
        for (HangHoa h : ds) {
            System.out.println("Tên: " + h.tenHang + 
                ", Mã: " + h.maHang + 
                ", Tồn kho: " + h.soLuongTonKho + 
                ", VAT: " + h.tinhVAT() + 
                ", Đánh giá: " + h.danhGia());
        }
    }

    public int tongSoLuongTon() {
        int tong = 0;
        for (HangHoa h : ds) {
            tong += h.soLuongTonKho;
        }
        return tong;
    }
}
