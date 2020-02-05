package io.github.kobylynskyi.bikeshop.graphql.model;

import io.github.kobylynskyi.bikeshop.graphql.api.*;
import java.util.*;

public class BikeInputTO {

    @javax.validation.constraints.NotNull
    private BikeTypeTO type;
    @javax.validation.constraints.NotNull
    private String brand;
    @javax.validation.constraints.NotNull
    private String size;
    @javax.validation.constraints.NotNull
    private Integer year;
    private String price;

    public BikeInputTO() {
    }

    public BikeInputTO(BikeTypeTO type, String brand, String size, Integer year, String price) {
        this.type = type;
        this.brand = brand;
        this.size = size;
        this.year = year;
        this.price = price;
    }

    public BikeTypeTO getType() {
        return type;
    }
    public void setType(BikeTypeTO type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }

    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }

}