package com.example.ProductCatalogueService.mappers;

import com.example.ProductCatalogueService.dtos.CategoryDto;
import com.example.ProductCatalogueService.dtos.ProductDto;
import com.example.ProductCatalogueService.models.Product;
import com.example.ProductCatalogueService.models.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    @Autowired
    private CategoryMapper categoryMapper;

    public Product toProduct(ProductDto dto) {
        Product product = new Product();
        product.setState(State.ACTIVE);
        product.setId(dto.getId());
        product.setName(dto.getName());
        product.setDescription(dto.getDescription());
        product.setImageUrl(dto.getImageUrl());
        product.setPrice(dto.getPrice());
        product.setCategory(categoryMapper.toCategory(dto.getCategory()));

        return product;
    }

    public ProductDto toProductDto(Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setName(product.getName());
        productDto.setPrice(product.getPrice());
        productDto.setDescription(product.getDescription());
        productDto.setImageUrl(product.getImageUrl());
        if (product.getCategory() != null) {
            productDto.setCategory(categoryMapper.toCategoryDto(product.getCategory()));
        }
        return productDto;
    }
}
