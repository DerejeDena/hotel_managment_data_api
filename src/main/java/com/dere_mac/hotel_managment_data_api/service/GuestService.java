package com.dere_mac.hotel_managment_data_api.service;

import com.dere_mac.hotel_managment_data_api.entity.Guest;
import com.dere_mac.hotel_managment_data_api.repo.GuestRepository;
import com.dere_mac.hotel_managment_data_api.vo.GuestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GuestService {

    @Autowired
    GuestRepository guestRepository;


    public List<GuestVo> findAllGuests(){
        List<Guest> finalAllGuest = guestRepository.findAll();
        List<GuestVo> result = new ArrayList<>();
        for(Guest g : finalAllGuest){
            GuestVo vo = new GuestVo();
            vo.setGuestID(g.getGuestId());
            vo.setName(g.getName());
            vo.setEmail(g.getEmail());
            vo.setPhoneNumber(g.getPhoneNumber());

            result.add(vo);
        }
        return result;
    }
    public List<GuestVo> findGuest(Integer id){
        List<GuestVo> result = new ArrayList<>();
        Optional<Guest> guestOptional = guestRepository.findById(id);
        guestOptional.ifPresent(guest -> {
            GuestVo vo = new GuestVo(guest);
            result.add(vo);
        });

        return result;
    }

    public GuestVo addGuest(GuestVo vo){
        Guest guest = new Guest(vo);
        guest = guestRepository.save(guest);
        vo.setGuestID(guest.getGuestId());
        return vo;
    }

}
