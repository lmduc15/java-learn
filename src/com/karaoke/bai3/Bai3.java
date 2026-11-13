package com.karaoke.bai3;

import java.util.Scanner;

// tam giac nguoc
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so n: ");
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                if (i == n || j == i || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
