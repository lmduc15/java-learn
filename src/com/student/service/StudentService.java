package com.student.service;

import com.student.model.StudentDTO;

import java.util.Optional;

public interface StudentService {
    Optional<StudentDTO> findById(Integer studentId);

    void showStudents();

    void addStudent();

    void updateStudent();

    void deleteStudent();
}
