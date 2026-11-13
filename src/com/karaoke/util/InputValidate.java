package com.karaoke.util;

import java.util.Scanner;

public final class InputValidate {
    private InputValidate() {

    }

    public static int inputPositiveIntNum(Scanner sc) {
        while (true) {
            System.out.print("Nhap do dai: ");
            if (!sc.hasNextInt()) {
                System.out.println("Vui long nhap so nguyen !!!");
                sc.next();
                continue;
            }
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Gia tri khong hop le !!!");
            } else {
                return n;
            }
        }
    }
}
