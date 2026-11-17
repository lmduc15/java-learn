package com.student.service;

import com.student.constant.StudentConstant;
import com.student.model.StudentDTO;
import com.student.util.InputValidation;

import java.util.Scanner;

public final class StudentService { // TODO không được phép để final ở đây
    static Scanner sc = new Scanner(System.in);


    public StudentService() {
    }

    public void showStudents() {
        int stt = 0;
        System.out.println("----Hien thi danh sach sinh vien-----");
        for (StudentDTO student : StudentConstant.listStudents) {
            System.out.println("STT: " + stt++ + ", " + student);
        }
    }

    public void addStudent() {
        System.out.println("---Them Sinh vien moi----");
        Integer studentId = InputValidation.readInt(sc, "Nhap ma sinh vien: ");
        String name = InputValidation.readString(sc, "Nhap ten sinh vien: ");
        Integer age = InputValidation.readInt(sc, "Nhap tuoi sinh vien: ");
        String className = InputValidation.readString(sc, "Nhap ten lop sinh vien: ");
        StudentDTO sinhVien = new StudentDTO(studentId, name, age, className);

        StudentConstant.listStudents.add(sinhVien);
    }
}
