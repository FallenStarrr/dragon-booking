package com.dragon.dragon_booking.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.SQLException;

import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.dragon.dragon_booking.model.Room;
import com.dragon.dragon_booking.repository.RoomRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RoomServiceImpl implements  IRoomService {
       private final RoomRepository roomRepository;
      @Override
      public Room addNewRoom(MultipartFile file, String roomType, BigDecimal roomPrice) throws SerialException, SQLException  {
          Room room = new Room();
          room.setRoomType(roomType);
          room.setRoomPrice(roomPrice);
          if (!file.isEmpty()) {
              byte[] photoBytes;
            try {
                photoBytes = file.getBytes();
                Blob photoBlob = new SerialBlob(photoBytes);
                room.setPhoto(photoBlob);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
              
          }
          return roomRepository.save(room);
      }
}
