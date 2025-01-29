package com.example.ProductCatalogueService.DBInheritanceExample.MappedSuperClass;

import jakarta.persistence.Entity;

@Entity(name = "msc_ta")
public class Ta extends User {
    Integer helpRequests;
}
