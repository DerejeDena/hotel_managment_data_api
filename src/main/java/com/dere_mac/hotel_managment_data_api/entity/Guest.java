package com.dere_mac.hotel_managment_data_api.entity;

import com.dere_mac.hotel_managment_data_api.vo.GuestVo;
import javax.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name="Guest", schema = "hotel_managment")
public class Guest implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer guestId;
    String name;
    String gender;
    String email;
    String phoneNumber;

    public Guest() {}

    public Guest(GuestVo vo) {
        this.guestId = vo.getGuestID();
        this.name = vo.getName();
        this.gender = vo.getGender();
        this.email = vo.getEmail();
        this.phoneNumber = vo.getPhoneNumber();
    }
}
