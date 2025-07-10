package org.example.java_core.oop.Overriding_Overloading;

public class Test {
    public static void main(String[] args) {

        MayTinhToan mayTinhToan = new MayTinhToan();
        System.out.println("\n" + mayTinhToan);

        MayTinhKhoaHoc mayTinhKhoaHoc = new MayTinhKhoaHoc();
        System.out.println(mayTinhKhoaHoc);

        //overload tinhTong(a, b)
        System.out.println("\nTinh tong 2 so nguyen: ");
        mayTinhToan.tinhTong(2, 3);

        //output: MayTinhToan: int a + b = 5


        //overload tinhTong(a, b, c)
        System.out.println("\nTinh tong 3 so nguyen: ");
        mayTinhToan.tinhTong(2, 3, 4);

        //output: MayTinhToan: int a + b + c = 9


        //overload tinhTong(a, b) với double
        System.out.println("\nTinh tong 2 so thuc: ");
        mayTinhToan.tinhTong(2.6, 3.9);

        //output: MayTinhToan: double a + b = 6.5


        // máy tính khoa học: chưa overriding hàm tính 3 số nguyên nên sẽ gọi ở class cha (MayTinhToan)
        System.out.println("\nTinh tong 3 so nguyen voi may tinh khoa hoc: ");
        mayTinhKhoaHoc.tinhTong(5, 6, 7);

        //output: MayTinhToan: int a + b + c = 18


        // Overring tính số khoa học
        System.out.println("\nTinh tong 2 so thuc voi may tinh khoa hoc: ");
        mayTinhKhoaHoc.tinhTong(2.6, 3.9);

        //output: MayTinhKhoaHoc: tinhTong(double, double)
        //        Ket qua: 6.5E0

    }
}
