package com.demo.services;

import java.util.List;
import java.util.Optional;

import com.demo.Posjos.CityRequest;
import com.demo.entity.City;
import com.demo.entity.Country;
import com.demo.repositories.CityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    
    @Autowired CityRepository cityRepository;

    @Autowired CityRepository CountryRepository;

    public CityService() {

    }

    public List<City> getCities() {
        return cityRepository.findAll();
    }

    public City SavedCity(City city) {
        return cityRepository.save(city);
    }

    public City getCity(String cityname) {
        return cityRepository.findByCityname(cityname);
    }

 
    
    
}
