package com.karaoke.bai6;

import com.karaoke.util.InputValidate;

import java.util.Arrays;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = InputValidate.inputPositiveIntNum(sc);
        int[] array = new int[n]; // exp: length 4
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhap phan tu mang thu " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        System.out.println("array" + Arrays.toString(array));
        System.out.print("Nhap phan tu moi: ");
        int newItem = sc.nextInt();

        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = newItem;
        System.out.println("new array" + Arrays.toString(newArray));
        sc.close();
    }
}
