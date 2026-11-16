package com.karaoke.bai6;

import com.karaoke.util.InputValidate;

import java.util.Arrays;
import java.util.Scanner;

// Chen phan tu moi vao vi tri bat ky trong mang
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = InputValidate.inputPositiveIntNum(sc, "Nhap do dai mang: ");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = InputValidate.inputIntNum(sc, "Nhap phan tu thu " + (i + 1) + ": ");
        }
        System.out.println("Mang ban dau: " + Arrays.toString(array));

        int newItem = InputValidate.inputIntNum(sc, "Nhap phan tu moi: ");

        // Vi tri dem tu 1; vi tri array.length + 1 nghia la chen cuoi mang
        int maxPosition = array.length + 1;
        int position = InputValidate.inputIntInRange(sc,
                "Chen vao vi tri (1 - " + maxPosition + "): ", 1, maxPosition);
        int index = position - 1;

        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            if (i < index) {
                newArray[i] = array[i];       // truoc vi tri chen: giu nguyen chi so
            } else {
                newArray[i + 1] = array[i];   // tu vi tri chen tro di: dich sang phai 1 o
            }
        }
        newArray[index] = newItem;

        System.out.println("Mang sau khi chen: " + Arrays.toString(newArray));
        sc.close();
    }
}
