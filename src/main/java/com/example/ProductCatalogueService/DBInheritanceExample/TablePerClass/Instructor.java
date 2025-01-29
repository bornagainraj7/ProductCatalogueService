package com.example.ProductCatalogueService.DBInheritanceExample.TablePerClass;

import jakarta.persistence.Entity;

@Entity(name = "tpc_instructor")
public class Instructor {
    String company;
}
