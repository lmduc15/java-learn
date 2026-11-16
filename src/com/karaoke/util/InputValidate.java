package com.karaoke.util;

import java.util.Scanner;

public final class InputValidate {
    private InputValidate() {

    }

    // SO NGUYEN
    public static int inputIntNum(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                return sc.nextInt();
            }
            System.out.println("Vui long nhap so nguyen !!!");
            sc.next(); // bo du lieu sai de tranh vong lap vo han
        }
    }

    // SO NGUYEN TRONG KHOANG
    public static int inputIntInRange(Scanner sc, String prompt, int min, int max) {
        while (true) {
            int x = inputIntNum(sc, prompt);
            if (x < min || x > max) {
                System.out.println("Vui long nhap so tu " + min + " den " + max + " !!!");
            } else {
                return x;
            }
        }
    }

    // SO NGUYEN DUONG
    public static int inputPositiveIntNum(Scanner sc, String prompt) {
        return inputIntInRange(sc, prompt, 1, Integer.MAX_VALUE);
    }
}
