package com.dere_mac.hotel_managment_data_api.entity;

import javax.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "Hotel" , schema = "hotel_managment")
public class Hotel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer hotelId;
    String name;
    String location;

}
