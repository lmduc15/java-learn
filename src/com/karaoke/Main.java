package com.karaoke;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("He thong quan ly Phong hat Karaoke");
            System.out.println("1. Quan ly Phong hat");
            System.out.println("2. Quan ly Menu");
            System.out.println("3. Quan ly Dat phong");
            System.out.println("0. Thoat");
            System.out.print("Nhap chuc nang: ");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    roomMenu();
                    break;
                case 2:
                    menuMenu();
                    break;
                case 3:
                    bookingMenu();
                    break;
                default:
                    System.out.println("Chon chuc nang theo nhu cau");
            }
        } while (choice != 0);

        sc.close();
    }

    private static void roomMenu() {
        int choice;
        do {
            System.out.println("----Quan ly Phong hat----");
            System.out.println("1. Them phong hat");
            System.out.println("2. Sua phong hat");
            System.out.println("3. Xoa phong hat");
            System.out.print("Nhap chuc nang: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Chuc nang them phong");
                    break;
                case 2:
                    System.out.println("Chuc nang sua phong");
                    break;
                case 3:
                    System.out.println("Chuc nang xoa phong");
                    break;
                case 4:
                    System.out.println("Quay lai");
                default:
                    System.out.println("Thu lai!");
            }
        } while(choice != 0);
    }

    private static void menuMenu() {
        int choice;
        do {
            System.out.println("----Quan ly Menu phong hat----");
            System.out.println("1. Them menu");
            System.out.println("2. Sua menu");
            System.out.println("3. Xoa menu");
            System.out.println("4. Tim kiem menu");
            System.out.println("0. Quay lai");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Chuc nang them menu");
                    break;
                case 2:
                    System.out.println("Chuc nang sua menu");
                    break;
                case 3:
                    System.out.println("Chuc nang xoa menu");
                    break;
                case 4:
                    System.out.println("Chuc nang tim kiem menu");
                    break;
                case 0:
                    System.out.println("Quay lai!");
                default:
                    System.out.println("Thu lai!");
            }

        } while (choice != 0);
    }

    private static void bookingMenu() {
        int choice;
        do {
            System.out.println("----Quan ly Booking Phong hat----");
            System.out.println("1. Them lich dat phong");
            System.out.println("2. Sua lich dat phong");
            System.out.println("3. Xoa lich dat phong");
            System.out.println("4. Tim kiem lich dat phong");
            System.out.println("0. Quay lai");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Chuc nang them menu");
                    break;
                case 2:
                    System.out.println("Chuc nang sua menu");
                    break;
                case 3:
                    System.out.println("Chuc nang xoa menu");
                    break;
                case 4:
                    System.out.println("Chuc nang tim kiem menu");
                    break;
                case 0:
                    System.out.println("Quay lai!");
                default:
                    System.out.println("Thu lai!");
            }

        } while (choice != 0);
    }

}
