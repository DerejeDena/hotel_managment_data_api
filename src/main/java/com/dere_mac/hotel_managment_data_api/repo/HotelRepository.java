package com.dere_mac.hotel_managment_data_api.repo;

import com.dere_mac.hotel_managment_data_api.entity.Hotel;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends BaseRepository<Hotel, Integer> {
}
