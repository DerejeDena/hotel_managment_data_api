package com.dere_mac.hotel_managment_data_api.service;

import com.dere_mac.hotel_managment_data_api.entity.Booking;
import com.dere_mac.hotel_managment_data_api.entity.Hotel;
import com.dere_mac.hotel_managment_data_api.repo.BookingRepository;
import com.dere_mac.hotel_managment_data_api.repo.HotelRepository;
import com.dere_mac.hotel_managment_data_api.vo.BookingVo;
import com.dere_mac.hotel_managment_data_api.vo.HotelVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelService {
    @Autowired
    HotelRepository hotelRepository;
    @Autowired
    BookingRepository bookingRepository;

    public List<HotelVo> findHotel(){
        List<HotelVo> list = new ArrayList<>();
        List<Hotel> hotel = hotelRepository.findAll();
        for(Hotel h : hotel){
            HotelVo vo = new HotelVo();
            vo.setHotelId(h.getHotelId());
            vo.setName(h.getName());
            vo.setLocation(h.getLocation());

            list.add(vo);
        }

        return list;

    }

    public List<BookingVo> findBook(){
        List<BookingVo> list = new ArrayList<>();
        List<Booking> book = bookingRepository.findAll();
        for(Booking b : book){
            BookingVo vo = new BookingVo();
            vo.setBookingID(b.getBookingId());
            vo.setCheckInDate(b.getCheckInDate());
            vo.setCheckOutDate(b.getCheckOutDate());
            vo.setRoomID(b.getRoomId());
            vo.setGuestID(b.getGuestId());
            vo.setPaymentID(b.getPaymentId());

            list.add(vo);
        }

        return list;

    }
}
