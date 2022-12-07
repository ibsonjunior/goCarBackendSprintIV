package br.com.digitalhouse.dtos;

import br.com.digitalhouse.entities.Product;

import java.io.Serializable;

public class ProductForImageDto implements Serializable {
    public static final long serialVersionUID = 1L;

    private Integer id;

    public ProductForImageDto() {
    }

    public ProductForImageDto(Integer id) {
        this.id = id;
    }

    public ProductForImageDto(Product product) {
        this.id = product.getId();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}