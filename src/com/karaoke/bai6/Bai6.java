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

        System.out.print("Chen phan tu moi vao vi tri " + array[0] + " - " + array[array.length - 1] + ": ");

        int position = sc.nextInt();
        int index = position - 1;
        for (int i = 0; i < array.length; i++) {
            // 1 2 3 4 5
            if (i < index) {
                newArray[i] = array[i];
            } else {
                newArray[i + 1] = array[i];
            }
        }
        newArray[index] = newItem;
        System.out.println("new array" + Arrays.toString(newArray));
        sc.close();
    }
}
