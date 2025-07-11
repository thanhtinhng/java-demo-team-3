package org.example.java_core.control_statement;

public class LoopStatement {
    //while
    public static void printN(int n) {
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }

    //do while
    public static void printOutside(int n) {
        int i = n + 1;
        do {
            System.out.println(i);
            i++;
        } while(i <= n);
    }

    //for, nested loop
    public static void printTriangle(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print( "*");}
        }
        System.out.println();
    }

    // break/continue
    public static void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Bỏ qua số chẵn
            }

            if (i > 7) {
                break; // Dừng vòng lặp nếu lớn hơn 7
            }

            System.out.println("Số lẻ: " + i);
        }

        System.out.println("Kết thúc vòng lặp.");
    }
}
