package com.example.demo.myfirstapi.repository;

import com.example.demo.myfirstapi.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    private ProductRepository productRepository;

    @BeforeEach
    void setUp() {
        productRepository = new ProductRepository();
    }

    @Test
    void testFindAll() {
        List<Product> products = productRepository.findAll();
        assertNotNull(products);
        assertEquals(3, products.size());
    }

    @Test
    void testFindById() {
        Optional<Product> findProduct = productRepository.findById(1L);
        assertTrue(findProduct.isPresent());
        assertEquals("Laptop", findProduct.get().getName());
    }

    @Test
    void testFindByIdNotFound() {
        Optional<Product> findNonExistingProduct = productRepository.findById(99L);
        assertFalse(findNonExistingProduct.isPresent());
    }

    @Test
    void saveNewProduct() {
        Product savedNewProduct = productRepository.save(new Product("Mouse pad", 500.00));

        assertNotNull(savedNewProduct.getId());
        assertEquals("Mouse pad", savedNewProduct.getName());
        assertEquals(4, productRepository.findAll().size());
    }

    @Test
    void saveExistingProduct() {
        Product existingProduct = productRepository.findById(1L).get();
        existingProduct.setName("Better Laptop");
        Product updatedProduct = productRepository.save(existingProduct);

        assertEquals("Better Laptop", updatedProduct.getName());
        assertEquals(3, productRepository.findAll().size());
    }

    @Test
    void saveNonExistingProduct() {
        long nonExistentId = 50L;

        Product productToSave = new Product(50L, "Non-existent Item", 50.00);

        Product returnedProduct = productRepository.save(productToSave);

        assertEquals(3, productRepository.findAll().size());
        assertSame(productToSave, returnedProduct);
    }
}