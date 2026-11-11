package com.karaoke.model;

public class RoomDTO {
    private String roomCode;
    private String roomName;
    private Long pricePerHour;
    private Boolean isEmpty;

    public RoomDTO(String roomCode, String roomName, Long pricePerHour, Boolean isEmpty) {
        this.roomCode = roomCode;
        this.roomName = roomName;
        this.pricePerHour = pricePerHour;
        this.isEmpty = isEmpty;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public Long getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Long pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Boolean getEmpty() {
        return isEmpty;
    }

    public void setEmpty(Boolean empty) {
        isEmpty = empty;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
}
