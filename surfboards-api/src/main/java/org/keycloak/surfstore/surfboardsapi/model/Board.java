package org.keycloak.surfstore.surfboardsapi.model;

import java.math.BigDecimal;

public class Board {

    public Board() {
    }

    public Board(String name, BigDecimal price, String size, String image) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.image = image;
    }

    private String name;
    private BigDecimal price;
    private String size;
    private String image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}