package br.com.digitalhouse.dtos;

import br.com.digitalhouse.entities.City;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CityDto implements Serializable {
    public static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String country;
    private List<ProductDto> products = new ArrayList<>();

    public CityDto() {
    }

    public CityDto(Integer id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public CityDto(City city) {
        this.id = city.getId();
        this.name = city.getName();
        this.country = city.getCountry();
        city.getProducts().forEach(products -> this.products.add(new ProductDto(products)));
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

    public List<ProductDto> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDto> products) {
        this.products = products;
    }

}