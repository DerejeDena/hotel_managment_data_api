package com.dere_mac.hotel_managment_data_api.repo;

import com.dere_mac.hotel_managment_data_api.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends BaseRepository<Guest,Integer> {
}
