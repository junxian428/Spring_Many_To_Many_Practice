package com.demo.repositories;

import com.demo.entity.Country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country,Integer> {
    
    Country findById(int id);
}
