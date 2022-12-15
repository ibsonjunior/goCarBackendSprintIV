package br.com.digitalhouse.entities;

import javax.persistence.*;
import java.io.Serializable;



@Entity
@Table
public class Booking implements Serializable {
    public static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String initialTime;
    private String initalDay;
    private String finalDay;


    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "id_product", nullable = true)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "id_user", nullable = true)
    private User user;

    public Booking() {
    }

    public Booking( String initialTime,  String initalDay,  String finalDay) {
        this.initialTime = initialTime;
        this.initalDay = initalDay;
        this.finalDay = finalDay;
    }

    public Booking(Integer id,  String initialTime,  String initalDay,  String finalDay) {
        this.id = id;
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
