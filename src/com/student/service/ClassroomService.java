package com.student.service;

import com.student.model.ClassroomDTO;

import java.util.Optional;

public interface ClassroomService {

     Optional<ClassroomDTO> findById(String classroomId);

     void showClassrooms();

     void addClassroom();

     void updateClassroom();

     void deleteClassroom();

     void showStudentInClass();
}
