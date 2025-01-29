package com.example.ProductCatalogueService.services.impl;

import com.example.ProductCatalogueService.models.Product;
import com.example.ProductCatalogueService.services.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("fkps")
public class FakeProductService implements IProductService {
    @Override
    public Product getProductById(Long productId) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product replaceProduct(Long productId, Product product) {
        return null;
    }

    @Override
    public Product save(Product product) {
        return null;
    }
}
