package com.dere_mac.hotel_managment_data_api.vo;

import com.dere_mac.hotel_managment_data_api.entity.Guest;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GuestVo {

    Integer guestID;
    String name;
    String gender;
    String email;
    String phoneNumber;

    public GuestVo(Guest guest) {
        this.guestID = guest.getGuestId();
        this.name = guest.getName();
        this.gender = guest.getGender();
        this.email = guest.getEmail();
        this.phoneNumber = guest.getPhoneNumber();
    }

    public GuestVo() {}
}
