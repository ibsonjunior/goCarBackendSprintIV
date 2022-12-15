package br.com.digitalhouse.dtos;

import br.com.digitalhouse.entities.Booking;

import java.io.Serializable;


public class BookingForProductDto implements Serializable {
    public static final long serialVersionUID = 1L;


    private Integer id;
    private  String initalDay;
    private  String finalDay;

    public BookingForProductDto() {
    }

    public BookingForProductDto(Integer id,  String initalDay,  String finalDay) {
        this.id = id;
        this.initalDay = initalDay;
        this.finalDay = finalDay;
    }

    public BookingForProductDto(Booking booking) {
        this.id = booking.getId();
        this.initalDay = booking.getInitalDay();
        this.finalDay = booking.getFinalDay();
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
}
