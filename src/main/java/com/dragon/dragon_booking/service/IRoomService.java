package com.dragon.dragon_booking.service;

import java.math.BigDecimal;
import java.sql.SQLException;

import javax.sql.rowset.serial.SerialException;

import org.springframework.web.multipart.MultipartFile;

import com.dragon.dragon_booking.model.Room;

import io.jsonwebtoken.io.IOException;

public interface IRoomService {
    Room addNewRoom(MultipartFile photo, String roomType, BigDecimal roomPrice) throws IOException, java.io.IOException, SerialException, SQLException;
}
