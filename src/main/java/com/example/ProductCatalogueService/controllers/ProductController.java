package com.example.ProductCatalogueService.controllers;

import com.example.ProductCatalogueService.dtos.ProductDto;
import com.example.ProductCatalogueService.mappers.ProductMapper;
import com.example.ProductCatalogueService.models.Product;
import com.example.ProductCatalogueService.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    @Qualifier("sps")
    private IProductService productService;

    @Autowired
    @Qualifier("fkps")
    private IProductService productService1;

    @Autowired
    private ProductMapper productMapper;


    @GetMapping
    public List<ProductDto> getAllProducts() {
        List<ProductDto> productDtoList = new ArrayList<>();
        List<Product> productList = productService.getAllProducts();
        for (Product product: productList) {
            productDtoList.add(productMapper.toProductDto(product));
        }

        return productDtoList;
    }

    @GetMapping("/{productId}")
    public ResponseEntity<ProductDto> getSingleProduct(@PathVariable Long productId) {
        try {
            if (productId > 0) {
                Product product = productService.getProductById(productId);
                if (product == null) {
                    return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
                }
                return new ResponseEntity<>(productMapper.toProductDto(product), HttpStatus.OK);
            } else {
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping
    public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto dto) {
        Product product = productMapper.toProduct(dto);
        Product savedProduct = productService.save(product);

        return new ResponseEntity<>(productMapper.toProductDto(savedProduct), HttpStatus.CREATED);
    }

    @PutMapping("/{productId}")
    public ResponseEntity<ProductDto> updateProduct(@PathVariable Long id, @RequestBody ProductDto dto) {
        System.out.println("ID: " +id);
        Product product = productMapper.toProduct(dto);
        Product updatedProduct = productService.replaceProduct(id, product);

        return new ResponseEntity<>(productMapper.toProductDto(updatedProduct), HttpStatus.OK);
    }


}
