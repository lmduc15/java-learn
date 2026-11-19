package com.student;

import com.karaoke.util.InputValidate;
import com.student.service.ClassroomService;
import com.student.service.StudentService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        StudentService studentService = new StudentService();
        ClassroomService classroomService = new ClassroomService();
        do {
            System.out.println("<<<<<Quan ly Sinh Vien>>>>>");
            System.out.println("1. Them Sinh vien");
            System.out.println("2. Sua Sinh vien");
            System.out.println("3. Xoa Sinh vien");
            System.out.println("4. Xem danh sach Sinh vien");
            System.out.println("5. Quan Ly lop hoc");
            System.out.println("0. Thoat chuong trinh");

            choice = InputValidate.inputIntInRange(sc, "Nhap chuc nang: ", 0, 5);

            switch (choice) {
                case 1:
                    studentService.addStudent();
                    break;
                case 2:
                    studentService.updateStudent();
                    break;
                case 3:
                    studentService.deleteStudent();
                    break;
                case 4:
                    studentService.showStudents();
                    break;
                case 5:
                    showClassMenu(sc, classroomService);
                    break;
                case 0:
                    return;
            }
        } while (choice >= 0);


        sc.close();

    }

    private static void showClassMenu(Scanner sc, ClassroomService classroomService) {
        int choice;

        do {
            System.out.println("<<<<< Quan ly Lop hoc >>>>>");
            System.out.println("1. Them Lop hoc");
            System.out.println("2. Sua Lop hoc");
            System.out.println("3. Xoa Lop hoc");
            System.out.println("4. Xem danh sach Lop hoc");
            System.out.println("5. Xem sinh vien trong lop");
            System.out.println("0. Quay lai");

            choice = InputValidate.inputIntInRange(sc, "Nhap chuc nang: ", 0, 5);
            switch (choice) {
                case 1:
                    classroomService.addClassroom();
                    break;
                case 2:
                    classroomService.updateClassroom();
                    break;
                case 3:
                    classroomService.deleteClassroom();
                    break;
                case 4:
                    classroomService.showClassrooms();
                    break;
                case 5:
                    classroomService.showStudentInClass();
                    break;
                case 0:
                    return;
            }
        } while (choice >= 0);
    }
}
