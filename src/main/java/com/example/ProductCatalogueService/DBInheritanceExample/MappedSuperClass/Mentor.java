package com.example.ProductCatalogueService.DBInheritanceExample.MappedSuperClass;

import jakarta.persistence.Entity;

@Entity(name = "msc_mentor")
public class Mentor extends User {
    Double ratings;
}
