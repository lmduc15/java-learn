package com.student;

import com.karaoke.util.InputValidate;
import com.student.service.StudentService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        StudentDTO sv1 = new StudentDTO(123, "Duc", -23, "66CNPM", true);
//        System.out.println("sv1: " + sv1.toString());
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Quan ly Sinh Vien");
            System.out.println("1. Them Sinh vien");
            System.out.println("2. Sua Sinh vien ");
            System.out.println("3. Xoa Sinh vien");
            System.out.println("4. Xem danh sach");
            System.out.println("0. Exit");

            choice = InputValidate.inputIntInRange(sc, "Nhap chuc nang: ", 0, 4);

            switch (choice) {
                case 1:
                    StudentService.addStudent();
                    break;
                case 2:
                    System.out.println("Chuc nang Sua");
                    break;
                case 3:
                    System.out.println("Chuc nang Xoa");
                    break;
                case 4:
                    StudentService.showStudents();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh !!!");
                    break;
            }
        } while (choice != 0);

    }
}
