package com.dragon.dragon_booking.service;

import java.math.BigDecimal;
import java.sql.SQLException;

import javax.sql.rowset.serial.SerialException;

import org.springframework.web.multipart.MultipartFile;

import com.dragon.dragon_booking.model.Room;

public interface IRoomService {
    Room addNewRoom(String photo, String roomType, BigDecimal roomPrice);
}
