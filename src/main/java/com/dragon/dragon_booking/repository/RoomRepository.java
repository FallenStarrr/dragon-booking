package com.dragon.dragon_booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dragon.dragon_booking.model.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {
      
}
