package com.example.ProductCatalogueService.DBInheritanceExample.SingleTable;

import jakarta.persistence.*;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity(name = "st_user")
@DiscriminatorColumn(name = "user_type", discriminatorType = DiscriminatorType.INTEGER)
public class User {
    @Id
    Integer id;
    String email;
}
