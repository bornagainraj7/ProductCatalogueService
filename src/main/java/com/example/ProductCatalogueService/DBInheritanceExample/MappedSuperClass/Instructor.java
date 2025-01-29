package com.example.ProductCatalogueService.DBInheritanceExample.MappedSuperClass;

import jakarta.persistence.Entity;

@Entity(name = "msc_instructor")
public class Instructor extends User {
    String company;
}
