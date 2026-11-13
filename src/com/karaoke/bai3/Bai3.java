package com.karaoke.bai3;

import com.karaoke.util.InputValidate;

import java.util.Scanner;

// tam giac nguoc
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = InputValidate.inputPositiveIntNum(sc);
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
        sc.close();
    }
}
