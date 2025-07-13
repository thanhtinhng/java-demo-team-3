package org.example.java_core.Practice.Practice2;

import java.text.SimpleDateFormat;

public class TestPr2 {
    public static void main(String[] args) throws Exception {
        DsHangHoa dshh = new DsHangHoa();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        dshh.themHangHoa(new ThucPham("TP01", "Thịt bò", 5, 120000,
            sdf.parse("2025-07-01"), sdf.parse("2025-07-10"), "Vissan"));

        dshh.themHangHoa(new DienTu("DT01", "Tủ lạnh", 2, 15000000, 24, 1.5));

        dshh.themHangHoa(new SanhSu("SS01", "Bát đĩa sứ", 60, 100000,
            "Gốm Chu Đậu", sdf.parse("2025-06-25")));

        dshh.hienThiDanhSach();
        System.out.println("Tổng số lượng tồn kho: " + dshh.tongSoLuongTon());
    } // <- Dòng bị thiếu ngoặc nhọn kết thúc
}
