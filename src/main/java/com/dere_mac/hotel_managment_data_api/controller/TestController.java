package com.dere_mac.hotel_managment_data_api.controller;

import com.dere_mac.hotel_managment_data_api.service.GuestService;
import com.dere_mac.hotel_managment_data_api.service.HotelService;
import com.dere_mac.hotel_managment_data_api.vo.BookingVo;
import com.dere_mac.hotel_managment_data_api.vo.GuestVo;
import com.dere_mac.hotel_managment_data_api.vo.HotelVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/")
public class TestController {

    @Autowired
    GuestService guestService;

    @Autowired
    HotelService hotelService;

    @GetMapping("findGuestById/{id}")
    public ResponseEntity<List<GuestVo>> findGuest(@PathVariable Integer id){
        List<GuestVo> list = guestService.findGuest(id);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("findAllHotel")
    public ResponseEntity<List<HotelVo>> findAllHotel(){
        List<HotelVo> list = hotelService.findHotel();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @GetMapping("findAllGuests")
    public ResponseEntity<List<GuestVo>> findAllGuests(){
        List<GuestVo> list = guestService.findAllGuests();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("addGuest")
    public ResponseEntity<GuestVo> addGuest(@RequestBody GuestVo guestVo){
        return new ResponseEntity<>(guestService.addGuest(guestVo), HttpStatus.CREATED);
    }

    @GetMapping("findAllBooking")
    public ResponseEntity<List<BookingVo>> findAllBooking(){
        List<BookingVo> list = hotelService.findBook();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
