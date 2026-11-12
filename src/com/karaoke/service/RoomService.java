package com.karaoke.service;

import com.karaoke.constant.KaraokeConstant;
import com.karaoke.model.RoomDTO;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class RoomService {
    static Scanner sc = new Scanner(System.in);

    public static ArrayList<RoomDTO> listRooms() {
        return KaraokeConstant.rooms;
    }

    public static Optional<RoomDTO> findByCode(String roomCode) {
        for (RoomDTO room : KaraokeConstant.rooms) {
            if (room.getRoomCode().equals(roomCode)) {
                return Optional.of(room);
            }
        }
        return Optional.empty();
    }

    public static void showAll() {
        int stt = 1;
        System.out.println("\n---Danh sach phong hat---");
        if (listRooms().isEmpty()) {
            System.out.println("Danh sach phong hat trong");
            return;
        }

        for (RoomDTO roomDTO : listRooms()) {
            System.out.println("STT: " + (stt++) + " | Ma: " + roomDTO.getRoomCode() + " | Ten: " + roomDTO.getRoomName() + " | Gia: " + roomDTO.getPricePerHour() + " | Con Trong: " + roomDTO.getEmpty());
        }

    }

    public static void addRoom() {
        System.out.println("----Them phong hat karaoke----");
        System.out.print("Nhap ma phong hat: ");
        String roomCode = sc.nextLine();
        if (findByCode(roomCode).isPresent()) {
            System.out.println("Ma phong hat da ton tai!");
            return;
        }
        System.out.print("Nhap ten phong hat: ");
        String roomName = sc.nextLine();
        System.out.println("Nhap gia phong hat 1 gio");
        Long pricePerHour = Long.parseLong(sc.nextLine());
        System.out.println("Phong con trong hay khong ?");
        Boolean isEmpty = true;
        RoomDTO roomDTO = new RoomDTO(roomCode, roomName, pricePerHour, isEmpty);
        listRooms().add(roomDTO);
        System.out.println("Them phong hat thanh cong");
    }

    public static void updateRoom() {

    }
}