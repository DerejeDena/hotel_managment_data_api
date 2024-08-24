package com.dere_mac.hotel_managment_data_api.vo;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BookingVo {
    private Integer bookingID;
    private LocalDateTime checkInDate;
    private LocalDateTime checkOutDate;
    private Integer guestID;
    private Integer roomID;
    private Integer paymentID;
}
