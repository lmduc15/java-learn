package com.karaoke.bai1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        while (true) {
            System.out.print("Nhap do dai: ");
            if (!sc.hasNextInt()) {
                System.out.println("Vui long nhap so nguyen !!!");
                sc.next();
                continue;
            }
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Gia tri khong hop le !!!");
            } else {
                break;
            }
        }

//        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
