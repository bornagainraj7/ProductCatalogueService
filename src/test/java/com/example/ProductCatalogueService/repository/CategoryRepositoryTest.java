package com.example.ProductCatalogueService.repository;

import com.example.ProductCatalogueService.models.Category;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CategoryRepositoryTest {

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    @Transactional
    void testFetchTypes() {
        Category category = categoryRepository.findById(2L).get();
    }
}