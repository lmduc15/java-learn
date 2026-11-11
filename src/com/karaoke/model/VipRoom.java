package com.karaoke.model;

public class VipRoom extends RoomDTO {
    private Boolean hasStaff;
    private Integer bigSpeaker;

    public Boolean getHasStaff() {
        return hasStaff;
    }

    public VipRoom(String roomCode, String roomName, Long pricePerHour, Boolean isEmpty, Boolean hasStaff, Integer bigSpeaker) {
        super(roomCode, roomName, pricePerHour, isEmpty);
        this.hasStaff = hasStaff;
        this.bigSpeaker = bigSpeaker;
    }

    public void setHasStaff(Boolean hasStaff) {
        this.hasStaff = hasStaff;
    }

    public Integer getBigSpeaker() {
        return bigSpeaker;
    }

    public void setBigSpeaker(Integer bigSpeaker) {
        this.bigSpeaker = bigSpeaker;
    }
}
