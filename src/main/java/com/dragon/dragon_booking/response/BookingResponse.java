package com.dragon.dragon_booking.response;

import java.time.LocalDate;

import com.dragon.dragon_booking.model.Room;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookingResponse {
  private Long id;
   
   
    private LocalDate checkInDate;
    
    private LocalDate checkOutDate;

   
    private String guestFullName;
    
 
    private String guestEmail;
    
   
    private int NumOfAdults;
   
    private int NumOfChildren;
    
    private int  totalNumOfGuest;

    private String bookingConfirmationCode;


    private Room room;


     public BookingResponse(Long id, LocalDate checkInDate, LocalDate checkOutDate, String bookingConfirmationCode) {
                this.id = id;
                this.checkInDate =checkInDate;
                this.checkOutDate = checkOutDate;
                this.bookingConfirmationCode = bookingConfirmationCode;
     }
}
