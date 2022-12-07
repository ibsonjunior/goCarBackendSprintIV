package br.com.digitalhouse.dtos;

import br.com.digitalhouse.entities.Feature;

import java.io.Serializable;

public class FeatureDto implements Serializable {
    public static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String icon;

    public FeatureDto() {
    }

    public FeatureDto(Integer id, String name, String icon) {
        this.id = id;
        this.name = name;
        this.icon = icon;
    }

    public FeatureDto(Feature feature) {
        this.id = feature.getId();
        this.name = feature.getName();
        this.icon = feature.getIcon();
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

}