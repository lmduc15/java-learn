package com.student.model;

//TODO quản lý thêm Lớp học
public class StudentDTO {
    private Integer studentId;
    private String name;
    private Integer age;
    private ClassroomDTO studentClass;

    public StudentDTO() {

    }

    public StudentDTO(Integer studentId, String name, Integer age, ClassroomDTO studentClass) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.studentClass = studentClass;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public ClassroomDTO getClassroom() {
        return studentClass;
    }

    public void setClassroom(ClassroomDTO studentClass) {
        this.studentClass = studentClass;
    }

    @Override
    public String toString() {
        return "Id: " + studentId + ", Tên: " + name + ", Tuổi: " + age + ", Lớp: " + studentClass.getClassName();
    }

}
