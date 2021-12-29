package com.demo.repositories;

import com.demo.entity.City;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long>{

    City findByCityname(String cityname);
    

}
