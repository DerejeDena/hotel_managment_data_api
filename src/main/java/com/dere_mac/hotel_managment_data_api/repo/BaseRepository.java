package com.dere_mac.hotel_managment_data_api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T,I> extends JpaRepository<T,I> {
}
