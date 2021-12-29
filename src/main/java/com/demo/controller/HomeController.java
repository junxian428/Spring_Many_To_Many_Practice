package com.demo.controller;

import java.util.List;

import com.demo.Posjos.CityRequest;
import com.demo.entity.City;
import com.demo.services.CityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
    
    @Autowired
    CityService cityService;
    
    @GetMapping("/SayHello")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("getCities")
    public List<City> getCities(){
        return cityService.getCities();
    }

    @PostMapping("addCities")
    public City SavedCity(@RequestBody City city){
        return cityService.SavedCity(city);
    }

    @GetMapping("getCity")
    public City getCity(String cityname){
        return cityService.getCity(cityname);
    }

    

}
