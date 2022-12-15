package br.com.digitalhouse.dtos;

import br.com.digitalhouse.entities.Product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProductDto implements Serializable {
    public static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String description;
    private List<FeatureDto> features = new ArrayList<>();
    private List<ImageDto> images = new ArrayList<>();
    private CategoryForProductDto category;
    private CityForProductDto city;

    private List<BookingForProductDto> booking = new ArrayList<>();

    public ProductDto() {
    }

    public ProductDto(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public ProductDto(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.description = product.getDescription();
        product.getFeatures().forEach(features -> this.features.add(new FeatureDto(features)));
        product.getImages().forEach(images -> this.images.add(new ImageDto(images)));
        this.category = new CategoryForProductDto(product.getCategory());
        this.city = new CityForProductDto(product.getCity());
        product.getBookings().forEach(bookings -> this.booking.add(new BookingForProductDto(bookings)));
    }

    public List<BookingForProductDto> getBooking() {
        return booking;
    }

    public void setBooking(List<BookingForProductDto> booking) {
        this.booking = booking;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<FeatureDto> getFeatures() {
        return features;
    }

    public void setFeatures(List<FeatureDto> features) {
        this.features = features;
    }

    public CategoryForProductDto getCategory() {
        return category;
    }

    public void setCategory(CategoryForProductDto category) {
        this.category = category;
    }

    public CityForProductDto getCity() {
        return city;
    }

    public void setCity(CityForProductDto city) {
        this.city = city;
    }

    public List<ImageDto> getImages() {
        return images;
    }

    public void setImages(List<ImageDto> images) {
        this.images = images;
    }

}