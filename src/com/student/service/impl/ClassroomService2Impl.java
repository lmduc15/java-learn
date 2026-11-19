package com.student.service.impl;

import com.student.model.ClassroomDTO;
import com.student.service.ClassroomService;

import java.util.Optional;

public class ClassroomService2Impl implements ClassroomService {

    public  ClassroomService2Impl() {

    }
    @Override
    public Optional<ClassroomDTO> findById(String classroomId) {
        return Optional.empty();
    }

    @Override
    public void showClassrooms() {

    }

    @Override
    public void addClassroom() {

    }

    @Override
    public void updateClassroom() {

    }

    @Override
    public void deleteClassroom() {

    }

    @Override
    public void showStudentInClass() {

    }
}
