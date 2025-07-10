package org.example.java_core.oop.inheritance_demo;

import java.util.ArrayList;

public class ListHinhHoc {

    private ArrayList<HinhHoc>  listHinhHoc;

    public ListHinhHoc(ArrayList<HinhHoc> data) {
        listHinhHoc = new ArrayList<>();

        if (data != null) {
            listHinhHoc.addAll(data);
        } else {
            listHinhHoc.add(new HinhVuong(1, 5));
            listHinhHoc.add(new HinhTron(2, 5));
            listHinhHoc.add(new HinhTamGiacDeu(3, 8, 10));
            listHinhHoc.add(new HinhChuNhat(4, 10, 9));
            listHinhHoc.add(new HinhTron(5, 6));
            listHinhHoc.add(new HinhTron(6, 10));
        }
    }

    // Da hinh
    public void printList() {
        System.out.println("Danh sach hinh hoc:\n{");
        for (HinhHoc h : listHinhHoc) {
            System.out.println("\t" + h);
        }
        System.out.println("}");
    }

    // Cast
    public void printListHinhTron() {
        System.out.println("Danh sach hinh tron:\n{");
        for (HinhHoc h : listHinhHoc) {
            if (h instanceof HinhTron) {
                HinhTron ht = (HinhTron) h; // ép kiểu về HinhTron để có thể sử dụng getBanKinh()
                System.out.println("\t" + h + ", Ban kinh=" + ht.getBanKinh());
            }
        }
        System.out.println("}");
    }

}
