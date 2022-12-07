package br.com.digitalhouse.dtos;

import br.com.digitalhouse.entities.Booking;
import br.com.digitalhouse.entities.Product;
import br.com.digitalhouse.entities.User;

import java.io.Serializable;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class BookingForProductDto implements Serializable {
    public static final long serialVersionUID = 1L;


    private Integer id;
    private  String initalDay;
    private  String finalDay;

    private ProductForImageDto product;

    private UserForBookingDto user;


    public BookingForProductDto() {
    }

    public BookingForProductDto(Integer id,  String initalDay,  String finalDay) {
        this.id = id;
        this.initalDay = initalDay;
        this.finalDay = finalDay;
    }

    public BookingForProductDto(Booking booking) {
        this.id = booking.getId();
        this.initalDay = booking.getInitalDay().format(DateTimeFormatter.ISO_DATE);
        this.finalDay = booking.getFinalDay().format(DateTimeFormatter.ISO_DATE);
        if (booking.getProduct() != null) {
            product = new ProductForImageDto(booking.getProduct());
        }
        if (booking.getUser() != null) {
            user = new UserForBookingDto(booking.getUser());
        }
    }

    public BookingForProductDto(Booking entity, Product product, User user) {
        this(entity);
        this.product = new ProductForImageDto(product);
//        this.cidade = new CityDto(cidade);
        this.user = new UserForBookingDto(user);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInitalDay() {
        return initalDay;
    }

    public void setInitalDay(String initalDay) {
        this.initalDay = initalDay;
    }

    public String getFinalDay() {
        return finalDay;
    }

    public void setFinalDay(String finalDay) {
        this.finalDay = finalDay;
    }

    public ProductForImageDto getProduct() {
        return product;
    }

    public void setProduct(ProductForImageDto product) {
        this.product = product;
    }

    public UserForBookingDto getUser() {
        return user;
    }

    public void setUser(UserForBookingDto user) {
        this.user = user;
    }
}
