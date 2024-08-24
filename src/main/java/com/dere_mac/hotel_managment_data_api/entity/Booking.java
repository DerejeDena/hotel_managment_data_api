package com.dere_mac.hotel_managment_data_api.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "booking", schema = "hotel_managment")
public class Booking implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingId;
    private LocalDateTime checkInDate;
    private LocalDateTime checkOutDate;
    private Integer guestId;
    private Integer roomId;
    private Integer paymentId;
}
