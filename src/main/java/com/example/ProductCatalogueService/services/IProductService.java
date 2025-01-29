package com.example.ProductCatalogueService.services;

import com.example.ProductCatalogueService.models.Product;

import java.util.List;

public interface IProductService {
    Product getProductById(Long productId);
    List<Product> getAllProducts();
    Product replaceProduct(Long productId, Product product);
    Product save(Product product);
}
