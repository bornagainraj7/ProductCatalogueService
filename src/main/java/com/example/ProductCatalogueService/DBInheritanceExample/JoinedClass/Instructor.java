package com.example.ProductCatalogueService.DBInheritanceExample.JoinedClass;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name = "jc_instructor")
@PrimaryKeyJoinColumn(name = "user_id")
public class Instructor extends User {
    String company;
}
