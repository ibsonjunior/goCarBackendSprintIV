package br.com.digitalhouse.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class Product implements Serializable {
    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(columnDefinition = "TEXT")
    private String description;

    // Relacionamento @ManyToMany entre as entidades Product e Feature
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "product_feature",
            joinColumns = @JoinColumn(name = "id_product"),
            inverseJoinColumns = @JoinColumn(name = "id_feature")
    )
    @JsonIgnore
    private List<Feature> features = new ArrayList<>();

    // Relacionamento @ManyToOne entre as entidades Category e Product
    @ManyToOne(fetch = FetchType.EAGER, optional = true)
    @JoinColumn(name = "id_category", nullable = true)
    private Category category;

    // Relacionamento @ManyToOne entre as entidades City e Product
    @ManyToOne(fetch = FetchType.EAGER, optional = true)
    @JoinColumn(name = "id_city", nullable = true)
    private City city;

    // Relacionamento @OneToMany entre as entidades Product e Image
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Image> images = new HashSet<>();

    //Relacionamento @OneToMany entre as entidades Product e Booking
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Booking> bookings = new HashSet<>();

    // Construtor padrão
    public Product() {
    }

    // Construtor com atributos
    public Product(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    // Getters and Setters
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

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Set<Image> getImages() {
        return images;
    }

    public void setImages(Set<Image> images) {
        this.images = images;
    }

    public Set<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(Set<Booking> bookings) {
        this.bookings = bookings;
    }


}