package org.hla.service;

import junit.framework.TestCase;
import org.hla.model.Product;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class ProductServiceTest extends TestCase {

    private List<Product> products;
    private ProductService productService;
    public ProductServiceTest(){
         products= List.of(
                new Product("P001", "Laptop", "Electronics", new BigDecimal("999.99"), 10),
                new Product("P002", "Smartphone", "Electronics", new BigDecimal("699.99"), 20),
                new Product("P003", "Desk Chair", "Furniture", new BigDecimal("199.99"), 5),
                new Product("P004", "Monitor", "Electronics", new BigDecimal("299.99"), 15),
                new Product("P005", "Keyboard", "Accessories", new BigDecimal("49.99"), 50)
        );
    }
    protected void setUp() throws Exception {
        super.setUp();
        productService = new ProductService();
    }


    public void testFindAllProducts_ShouldReturnAllProducts() {
        productService.setProductList(products);
        List<Product> result = productService.findAllProducts();
        assertNotNull(result);
        assertEquals(products.size(), result.size());
        assertTrue(result.containsAll(products));
    }

    public void testFindProductByCategory_ShoudThrowException() {
        try {
            productService.findProductsByCategory("nean");
        } catch (Exception e) {
            assertEquals("aucun produit trouvé pour cette catégorie", e.getMessage());
        }
    }
}
