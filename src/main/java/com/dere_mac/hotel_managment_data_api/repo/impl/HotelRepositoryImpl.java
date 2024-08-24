package com.dere_mac.hotel_managment_data_api.repo.impl;

import com.dere_mac.hotel_managment_data_api.entity.Hotel;
import com.dere_mac.hotel_managment_data_api.repo.HotelRepository;
import com.dere_mac.hotel_managment_data_api.repo.impl.BaseRepositoryImpl;

import javax.persistence.EntityManager;

public class HotelRepositoryImpl extends BaseRepositoryImpl<Hotel,Integer> implements HotelRepository {
    protected HotelRepositoryImpl(EntityManager em){super(Hotel.class, em);}
}
