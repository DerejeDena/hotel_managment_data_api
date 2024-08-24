package com.dere_mac.hotel_managment_data_api.repo.impl;

import com.dere_mac.hotel_managment_data_api.entity.QGuest;
import com.dere_mac.hotel_managment_data_api.entity.QHotel;
import com.dere_mac.hotel_managment_data_api.repo.BaseRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;

public abstract class BaseRepositoryImpl <T, I> extends SimpleJpaRepository<T,I> implements BaseRepository<T,I> {

    protected final JPAQueryFactory queryFactory;
    protected BaseRepositoryImpl(Class<T> domainClass, EntityManager em){
        super(domainClass, em);
        this.queryFactory = new JPAQueryFactory(em);
    }

    protected static final QGuest guest = QGuest.guest;
    protected static final QHotel hotel = QHotel.hotel;


}
