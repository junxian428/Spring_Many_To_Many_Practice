package com.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GeneratorType;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "cities")
public class City {

    @Id
    @Column(name = "city_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    @Column(name = "city_name")
    private String cityname;

    @Column(name = "city_code", columnDefinition="character varying(3) not null default 'XXX'")
    private String citycode;

    @Transient
    private String thisVariableIsTemporarily;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getCityname(){
        return cityname;
    }

    public void setCityname(String cityname){
        this.cityname = cityname;
    }
    
    public void setCitycode(String citycode){
        this.citycode = citycode;
    }
    public String getCitycode(){
        return citycode;
    }
    
    public Country getCountry(){
        return country;
    }
    public void setCountry(Country country){
        this.country = country;
    }
}
