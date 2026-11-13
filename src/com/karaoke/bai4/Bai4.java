package com.karaoke.bai4;

import com.karaoke.util.InputValidate;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = InputValidate.inputPositiveIntNum(sc);

        // n = 4
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("1 ");

                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
