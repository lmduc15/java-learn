package com.karaoke.bai5;

import com.karaoke.util.InputValidate;

import java.util.Arrays;
import java.util.Scanner;

// Tim max, min cua array
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = InputValidate.inputPositiveIntNum(sc);
        int[] array = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhap phan tu mang thu " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        sc.close();
        System.out.println("array" + Arrays.toString(array));
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}
