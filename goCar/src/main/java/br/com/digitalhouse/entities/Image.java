package br.com.digitalhouse.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Image implements Serializable {
    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    @Column(columnDefinition = "TEXT", name = "url_image")
    private String urlImage;

    // Relacionamento @ManyToOne entre as entidades Product e Image
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "id_product", nullable = true)
    private Product product;

    // Construtor padrão
    public Image() {
    }

    // Construtor com atributos
    public Image(Integer id, String title, String urlImage) {
        this.id = id;
        this.title = title;
        this.urlImage = urlImage;
    }

    // Getters and Setters
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}