package com.example.ProductCatalogueService.services.impl;

import com.example.ProductCatalogueService.models.Product;
import com.example.ProductCatalogueService.repository.ProductRepository;
import com.example.ProductCatalogueService.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("sps")
public class StorageProductService implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product getProductById(Long productId) {
        Product product = null;
        Optional<Product> productOptional = productRepository.findById(productId);
        if (productOptional.isEmpty()) {
            return null;
        }
        return productOptional.get();
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product replaceProduct(Long productId, Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}
