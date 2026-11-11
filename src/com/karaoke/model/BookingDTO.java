package com.karaoke.model;

public class BookingDTO {
    private String bookingCode;
    private String roomCode;
    private String customerCode;
    private String startTime;
    private Integer home;

    public BookingDTO(String bookingCode, String roomCode, String customerCode, String startTime, Integer home) {
        this.bookingCode = bookingCode;
        this.roomCode = roomCode;
        this.customerCode = customerCode;
        this.startTime = startTime;
        this.home = home;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Integer getHome() {
        return home;
    }

    public void setHome(Integer home) {
        this.home = home;
    }
}
