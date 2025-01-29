package com.example.ProductCatalogueService.DBInheritanceExample.JoinedClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity(name = "jc_user")
public class User {
    @Id
    Integer id;
    String email;
}
