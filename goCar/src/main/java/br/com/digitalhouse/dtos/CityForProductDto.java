package br.com.digitalhouse.dtos;

import br.com.digitalhouse.entities.City;

import java.io.Serializable;

public class CityForProductDto implements Serializable {
    public static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String country;

    public CityForProductDto() {
    }

    public CityForProductDto(Integer id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public CityForProductDto(City city) {
        this.id = city.getId();
        this.name = city.getName();
        this.country = city.getCountry();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}