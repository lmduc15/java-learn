package com.student.service;

import com.student.constant.StudentConstant;
import com.student.model.StudentDTO;
import com.student.util.InputValidation;

import java.util.Optional;
import java.util.Scanner;

public class StudentService {
    Scanner sc = new Scanner(System.in);

    public StudentService() {
    }

    public Optional<StudentDTO> findById(Integer studentId) {
        for (StudentDTO student : StudentConstant.listStudent) {
            if (student.getStudentId().equals(studentId)) {
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }

    public void showStudents() {
        int stt = 1;
        System.out.println("----Hien thi danh sach sinh vien-----");
        if (StudentConstant.listStudent.isEmpty()) {
            System.out.println("Danh sach sinh vien rong!");
            return;
        }
        for (StudentDTO student : StudentConstant.listStudent) {
            System.out.println("STT: " + (stt++) + ", " + student);
        }
    }

    public void addStudent() {
        System.out.println("---Them Sinh vien moi----");
        Integer studentId = InputValidation.readInt(sc, "Nhap ma sinh vien: ");

        if (findById(studentId).isPresent()) {
            System.out.println("Ma sinh vien da ton tai!");
            return;
        }

        String name = InputValidation.readString(sc, "Nhap ten sinh vien: ");
        Integer age = InputValidation.readInt(sc, "Nhap tuoi sinh vien: ");
        String className = InputValidation.readString(sc, "Nhap ten lop sinh vien: ");
        StudentDTO sinhVien = new StudentDTO(studentId, name, age, className);

        StudentConstant.listStudent.add(sinhVien);
        System.out.println("Them sinh vien thanh cong !");
    }

    public void updateStudent() {
        System.out.println("----Sua Sinh vien----");
        Integer studentId = InputValidation.readInt(sc, "Nhap ma sinh vien can sua: ");
        Optional<StudentDTO> studentOptional = findById(studentId); // obj sinh vien tim duoc

        if (studentOptional.isEmpty()) {
            System.out.println("Khong ton tai sinh vien voi id " + studentId);
            return;
        }

        StudentDTO studentDTO = studentOptional.get();

        studentDTO.setName(InputValidation.readString(sc, "Nhap ten sinh vien moi: "));
        studentDTO.setAge(InputValidation.readInt(sc, "Hay nhap tuoi moi: "));
        studentDTO.setStudentClass(InputValidation.readString(sc, "Hay nhap lop moi: "));
        System.out.println("Cap nhat sinh vien thanh cong !");
    }

    public void deleteStudent() {
        System.out.println("----Xoa Sinh vien----");

        Integer deletedId = InputValidation.readInt(sc, "Nhap Id cua sinh vien can xoa: ");
        Optional<StudentDTO> deletedStudentOptional = findById(deletedId);

        if (deletedStudentOptional.isEmpty()) {
            System.out.println("Id cua sinh vien khong ton tai");
            return;
        }

        StudentDTO deletedStudent = deletedStudentOptional.get();
        StudentConstant.listStudent.remove(deletedStudent);
        System.out.println("Xoa sinh vien thanh cong !");
    }
}
