package com.example.ProductCatalogueService.DBInheritanceExample.MappedSuperClass;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class User {
    @Id
    Integer id;
    String email;
}
