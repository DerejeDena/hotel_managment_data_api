package com.dere_mac.hotel_managment_data_api.repo.impl;

import com.dere_mac.hotel_managment_data_api.entity.Guest;
import com.dere_mac.hotel_managment_data_api.repo.GuestRepository;

import javax.persistence.EntityManager;

public class GuestRepositoryImpl extends BaseRepositoryImpl<Guest,Integer> implements GuestRepository {
    protected GuestRepositoryImpl(EntityManager em){
        super(Guest.class, em);
    }
}
