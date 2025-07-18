package com.example.demo.myfirstapi.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testGetId() {
        Product product = new Product(5L, "Keyboard", 100.0);
        assertEquals(5L, product.getId());
    }

    @Test
    void testGetProductWithNullId() {
        Product product = new Product(null, "Keyboard", 100.0);
        assertEquals(null, product.getId());
    }

    @Test
    void testGetName() {
        Product product = new Product(6L, "Mouse", 200.0);
        assertEquals("Mouse", product.getName());
    }

    @Test
    void testGetPrice() {
        Product product = new Product(7L, "Price Test", 50.75);
        assertEquals(50.75, product.getPrice(), 0.0001);
    }

    @Test
    void testSetId() {
        Product product = new Product(101L, "Initial Product", 5.0);

        product.setId(105L);
        assertEquals(105L, product.getId());
    }

    @Test
    void testSetName() {
        Product product = new Product("Software version 1.0", 1.0);
        assertEquals("Software version 1.0", product.getName());

        product.setName("Software version 2.0");
        assertEquals("Software version 2.0", product.getName());
    }

    @Test
    void testSetPrice() {
        Product product = new Product("Mousepad", 50.0);
        assertEquals(50.0, product.getPrice(), 0.0001);

        product.setPrice(200.0);
        assertEquals(200.0, product.getPrice(), 0.0001);
    }

    @Test
    void testToString() {
        Product product = new Product(300L, "Water Bottle", 150.0);
        String expectedString = "Product{id=300, name='Water Bottle', price=150.0}";
        assertEquals(expectedString, product.toString());
    }

    @Test
    void testEquals() {
        Product prod1 = new Product(1L, "Laptop", 1200.00);
        Product prod2 = prod1;

        assertEquals(prod1, prod2);
    }

    @Test
    void testHashCode() {
        Product prod1 = new Product(50L, "Desk", 1000.00);
        Product prod2 = new Product(25L, "Desk", 1000.00);

        assertEquals(prod1.getName(), prod2.getName());
        assertNotSame(prod1.hashCode(), prod2.hashCode());
    }
}