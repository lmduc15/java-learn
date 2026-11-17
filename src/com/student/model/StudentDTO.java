package com.student.model;

public class StudentDTO {
    private final Integer studentId;
    private String name;
    private Integer age;
    private String className; //TODO từ nhạy cảm không nên sử dụng

    public StudentDTO(Integer studentId, String name, Integer age, String className) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.className = className;
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
