package com.student.service;

import com.student.constant.StudentConstant;
import com.student.model.StudentDTO;

import java.util.Scanner;

public class StudentService {
    static Scanner sc = new Scanner(System.in);

    public static void addStudent() {
        System.out.println("---Them Sinh vien moi----");
        System.out.print("Nhap ma sinh vien: ");
        String studentId = sc.nextLine();
        System.out.print("Nhap ten sinh vien: ");
        String name = sc.nextLine();
        System.out.print("Nhap tuoi sinh vien: ");
        String age = sc.nextLine();
        System.out.print("Nhap ten lop sinh vien: ");
        String className = sc.nextLine();
        StudentDTO sinhVien = new StudentDTO(studentId, name, age, className);

        StudentConstant.listStudents.add(sinhVien);
    }

    public static void showStudents() {
        System.out.println("----Hien thi danh sach sinh vien-----");
        for (StudentDTO student : StudentConstant.listStudents) {
            System.out.println("Danh sach: " + student);
        }
    }
}
