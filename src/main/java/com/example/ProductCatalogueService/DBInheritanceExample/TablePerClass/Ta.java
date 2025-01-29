package com.example.ProductCatalogueService.DBInheritanceExample.TablePerClass;

import jakarta.persistence.Entity;

@Entity(name = "tpc_ta")
public class Ta extends User {
    Integer helpRequests;
}
