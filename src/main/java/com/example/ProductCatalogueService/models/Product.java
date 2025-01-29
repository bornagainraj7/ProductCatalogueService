package com.example.ProductCatalogueService.models;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
@Entity
public class Product extends BaseModel {
    private String name;
    private String description;
    private String imageUrl;
    private Double price;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Category category;
    private Boolean isPrime;

    public Product() {
        setCreatedAt(new Date());
        setUpdatedAt(new Date());
        setState(State.ACTIVE);
    }
}
