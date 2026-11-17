package com.student.model;

public class StudentDTO {
    private final Integer studentId;
    private String name;
    private Integer age;
    private String studentClass;

    public StudentDTO(Integer studentId, String name, Integer age, String className) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.studentClass = className;
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

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    @Override
    public String toString() {
        return "Tên: " + name + ", Tuổi: " + age + ", Lớp: " + studentClass;
    }

}
