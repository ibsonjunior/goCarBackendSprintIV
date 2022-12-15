package br.com.digitalhouse.dtos;

import br.com.digitalhouse.entities.Product;

import java.io.Serializable;


public class ProductDtoForBooking implements Serializable {
    public static final long serialVersionUID = 1L;

    private Integer id;
    private String name;

    public ProductDtoForBooking() {
    }

    public ProductDtoForBooking(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public ProductDtoForBooking(Product product) {
        this.id = product.getId();
        this.name = product.getName();
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
}
