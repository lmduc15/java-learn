package com.student.service;

import com.student.constant.StudentConstant;
import com.student.model.ClassroomDTO;
import com.student.model.StudentDTO;
import com.student.util.InputValidation;

import java.util.Optional;
import java.util.Scanner;

public class ClassroomService {
    Scanner sc = new Scanner(System.in);

    public ClassroomService() {
    }

    public Optional<ClassroomDTO> findById(String classroomId) {
        for (ClassroomDTO classroom : StudentConstant.listClass) {
            if (classroom.getClassId().equals(classroomId)) {
                return Optional.of(classroom);
            }
        }
        return Optional.empty();
    }

    public void showClassrooms() {
        int stt = 1;
        System.out.println("----Hien thi danh sach lop hoc----");
        if (StudentConstant.listClass.isEmpty()) {
            System.out.println("Danh sach lop hoc rong!");
            return;
        }
        for (ClassroomDTO classroom : StudentConstant.listClass) {
            System.out.println("STT: " + (stt++) + ", " + classroom);
        }
    }

    public void addClassroom() {
        System.out.println("----Them lop hoc----");
        String classroomId = InputValidation.readString(sc, "Nhap ma lop hoc: ");
        if (findById(classroomId).isPresent()) {
            System.out.println("Ma lop hoc da ton tai!");
            return;
        }
        String classroomName = InputValidation.readString(sc, "Nhap ten lop hoc: ");
        Integer classroomQuantity = InputValidation.readInt(sc, "Nhap si so lop hoc: ");
        ClassroomDTO classRoom = new ClassroomDTO(classroomId, classroomName, classroomQuantity);
        StudentConstant.listClass.add(classRoom);
        System.out.println("Them lop hoc thanh cong!");
    }

    public void updateClassroom() {
        System.out.println("----Sua lop hoc----");

        String classroomId = InputValidation.readString(sc, "Nhap ma lop hoc can sua: ");
        Optional<ClassroomDTO> classroomOptional = findById(classroomId); // Optional chứa classroomDTO
        if (classroomOptional.isEmpty()) {
            System.out.println("Ma lop hoc khong ton tai!");
            return;
        }

        ClassroomDTO classroom = classroomOptional.get(); // lấy ra object classroom

        classroom.setClassName(InputValidation.readString(sc, "Nhap ten lop hoc moi: "));
        classroom.setQuantity(InputValidation.readInt(sc, "Nhap si so lop hoc moi: "));
        System.out.println("Sua lop hoc thanh cong!");
    }

    public void deleteClassroom() {
        System.out.println("----Xoa lop hoc----");

        String deletedClassroomId = InputValidation.readString(sc, "Nhap ma lop hoc can xoa: ");
        Optional<ClassroomDTO> deletedClassroomOptional = findById(deletedClassroomId);

        if (deletedClassroomOptional.isEmpty()) {
            System.out.println("Ma lop hoc khong ton tai!");
            return;
        }

        ClassroomDTO deletedClassroom = deletedClassroomOptional.get();

        int studentCount = 0;
        for (StudentDTO student : StudentConstant.listStudent) {
            String classroomId = student.getClassroom().getClassId(); // ma lop cua tung sinh vien
            if (classroomId.equals(deletedClassroomId)) {
                studentCount++;
            }
        }
        if (studentCount > 0) {
            System.out.println("Lop con " + studentCount + " sinh vien, khong duoc phep xoa!");
        } else {
            StudentConstant.listClass.remove(deletedClassroom);
            System.out.println("Xoa lop hoc thanh cong!");
        }

    }

    public void showStudentInClass() {
        System.out.println("----Xem so sinh vien trong lop hoc----");
        String showedClassroomId = InputValidation.readString(sc, "Nhap ma lop hoc can xem: ");
        Optional<ClassroomDTO> showedClassroomOptional = findById(showedClassroomId);
        if (showedClassroomOptional.isEmpty()) {
            System.out.println("Ma lop khong ton tai!");
            return;
        }
        ClassroomDTO showedClassroom = showedClassroomOptional.get();

        int studentCount = 0;
        for (StudentDTO student : StudentConstant.listStudent) {
            String classroomId = student.getClassroom().getClassId(); // ma lop cua tung sinh vien
            if (classroomId.equals(showedClassroomId)) {
                System.out.println(student);
                studentCount++;
            }
        }
        if (studentCount > 0) {
            System.out.println("Lớp: " + showedClassroom.getClassName() + " (" + showedClassroom.getClassId() + ")" + " - Sĩ số: " + studentCount + "/" + showedClassroom.getQuantity());
        } else {
            System.out.println("Lop " + showedClassroom.getClassName() + " khong co sinh vien nao!");
        }
    }

//    private int countStudent(int studentCount) {
//
//    }
}
