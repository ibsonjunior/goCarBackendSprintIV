package br.com.digitalhouse.dtos;

import br.com.digitalhouse.entities.Image;

import java.io.Serializable;

public class ImageDto implements Serializable {
    public static final long serialVersionUID = 1L;

    private Integer id;
    private String title;
    private String urlImage;
    private ProductForImageDto product;

    public ImageDto() {
    }

    public ImageDto(Integer id, String title, String urlImage) {
        this.id = id;
        this.title = title;
        this.urlImage = urlImage;
    }

    public ImageDto(Image image) {
        this.id = image.getId();
        this.title = image.getTitle();
        this.urlImage = image.getUrlImage();
        this.product = new ProductForImageDto(image.getProduct());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public ProductForImageDto getProduct() {
        return product;
    }

    public void setProduct(ProductForImageDto product) {
        this.product = product;
    }

}