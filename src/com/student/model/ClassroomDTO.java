package com.student.model;

public class ClassroomDTO {
    private String classroomId;
    private String classroomName;
    private Integer quantity;
    //TODO đang thiếu danh sách student

    public ClassroomDTO() {
    }

    public ClassroomDTO(String classroomId, String classroomName, Integer quantity) {
        this.classroomId = classroomId;
        this.classroomName = classroomName;
        this.quantity = quantity;
    }

    public String getClassId() {
        return classroomId;
    }

    public String getClassName() {
        return classroomName;
    }

    public void setClassName(String classroomName) {
        this.classroomName = classroomName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Id: " + classroomId + ", Tên: " + classroomName + ", Sĩ số: " + quantity;
    }
}
