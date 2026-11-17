package com.student.util;

import java.util.Scanner;

public final class InputValidation {
    private InputValidation() {
    }

    public static String readString(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextLine().trim();
    }

    public static Integer readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String inputData = sc.nextLine().trim();
            try {
                return Integer.parseInt(inputData);
            } catch (NumberFormatException e) {
                System.out.println("Hay nhap so Nguyen !!!");
            }
        }
    }
}
