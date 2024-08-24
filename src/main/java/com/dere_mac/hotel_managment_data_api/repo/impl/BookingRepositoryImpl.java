package com.dere_mac.hotel_managment_data_api.repo.impl;

import com.dere_mac.hotel_managment_data_api.entity.Booking;
import com.dere_mac.hotel_managment_data_api.repo.BookingRepository;

import javax.persistence.EntityManager;

public class BookingRepositoryImpl extends BaseRepositoryImpl<Booking, Integer> implements BookingRepository {
    protected BookingRepositoryImpl(EntityManager em){
        super(Booking.class,em);
    }
}
