package br.com.digitalhouse.dtos;

import br.com.digitalhouse.entities.Category;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CategoryDto implements Serializable {
    public static final long serialVersionUID = 1L;

    private Integer id;
    private String qualification;
    private String description;
    private String urlImage;
    private List<ProductDto> products = new ArrayList<>();

    public CategoryDto() {
    }

    public CategoryDto(Integer id, String qualification, String description, String urlImage) {
        this.id = id;
        this.qualification = qualification;
        this.description = description;
        this.urlImage = urlImage;
    }

    public CategoryDto(Category category) {
        this.id = category.getId();
        this.qualification = category.getQualification();
        this.description = category.getDescription();
        this.urlImage = category.getUrlImage();
        category.getProducts().forEach(products -> this.products.add(new ProductDto(products)));
    }

    public CategoryDto(String qualification) {
        this.qualification = qualification;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public List<ProductDto> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDto> products) {
        this.products = products;
    }

}