package br.com.digitalhouse.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;


@Entity
@Table
public class Booking implements Serializable {
    public static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String initialTime;
    private LocalDate initalDay;
    private LocalDate finalDay;


    @ManyToOne(fetch = FetchType.EAGER, optional = true)
    @JoinColumn(name = "id_product", nullable = true)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "id_user", nullable = true)
    private User user;

    public Booking() {
    }

    public Booking(Integer id, String initialTime, LocalDate initalDay, LocalDate finalDay) {
        this.id = id;
        this.initialTime = initialTime;
        this.initalDay = initalDay;
        this.finalDay = finalDay;
    }

    public Booking(String initialTime, LocalDate initalDay, LocalDate finalDay) {
        this.initialTime = initialTime;
        this.initalDay = initalDay;
        this.finalDay = finalDay;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(String initialTime) {
        this.initialTime = initialTime;
    }

    public LocalDate getInitalDay() {
        return initalDay;
    }

    public void setInitalDay(LocalDate initalDay) {
        this.initalDay = initalDay;
    }

    public LocalDate getFinalDay() {
        return finalDay;
    }

    public void setFinalDay(LocalDate finalDay) {
        this.finalDay = finalDay;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
