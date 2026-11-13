package com.karaoke.bai2;

import com.karaoke.util.InputValidate;

import java.util.Scanner;

// tam giac xuoi
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = InputValidate.inputPositiveIntNum(sc);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (i == n - 1 || j == 0 || j == i) {
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
