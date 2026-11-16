package com.student.model;

public class StudentDTO {
    private final String studentId;
    private String name;
    private String age;
    private String className;

    public StudentDTO(String studentId, String name, String age, String className) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.className = className;
        setAge(age);
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Tên: " + name + ", Tuổi: " + age + ", Lớp: " + className;
    }

}
