package br.com.digitalhouse.dtos;

import br.com.digitalhouse.entities.Category;

import java.io.Serializable;

public class CategoryForProductDto implements Serializable {
    public static final long serialVersionUID = 1L;

    private Integer id;
    private String qualification;

    public CategoryForProductDto() {
    }

    public CategoryForProductDto(Integer id, String qualification) {
        this.id = id;
        this.qualification = qualification;
    }

    public CategoryForProductDto(Category category) {
        this.id = category.getId();
        this.qualification = category.getQualification();
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

}