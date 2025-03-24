package org.hla.service;

import org.hla.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ProductServiceTest {

    private List<Product> products;
    private ProductService productService;
    public ProductServiceTest(){

    }
    @BeforeEach
    protected void setUp() {
        products= List.of(
                new Product("P001", "Laptop", "Electronics", new BigDecimal("999.99"), 10),
                new Product("P002", "Smartphone", "Electronics", new BigDecimal("699.99"), 20),
                new Product("P003", "Desk Chair", "Furniture", new BigDecimal("199.99"), 5),
                new Product("P004", "Monitor", "Electronics", new BigDecimal("299.99"), 15),
                new Product("P005", "Keyboard", "Accessories", new BigDecimal("49.99"), 50)
        );
        productService = new ProductService();
    }


    @Test
    public void testFindAllProducts_ShouldReturnAllProducts() {
        productService.setProductList(products);
        List<Product> result = productService.findAllProducts();
        assertNotNull(result);
        assertEquals(products.size(), result.size());
        assertTrue(result.containsAll(products));
    }

    @Test
    public void testFindProductByCategory_ShoudThrowException() {
        assertThrows(NullPointerException.class, () -> productService.findAllProducts());
    }
}
