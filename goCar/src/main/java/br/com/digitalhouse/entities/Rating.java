package br.com.digitalhouse.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Rating implements Serializable {
    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer score;

    // Construtor padrão
    public Rating() {
    }

    // Construtor com atributos
    public Rating(Integer id, Integer score) {
        this.id = id;
        this.score = score;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

}