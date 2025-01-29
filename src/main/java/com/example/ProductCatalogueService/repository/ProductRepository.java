package com.example.ProductCatalogueService.repository;

import com.example.ProductCatalogueService.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Override
    Optional<Product> findById(Long productId);

    @Override
    Product save(Product product);

    @Override
    List<Product> findAll();


}
