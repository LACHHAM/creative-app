package org.hla.service;

import org.hla.model.Product;

import java.util.List;
import java.util.Optional;

public class ProductService {

    private List<Product> productList;


    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> findAllProducts() {
        return Optional.ofNullable(productList).orElseThrow(() -> new NullPointerException("La liste des produits est null"));
    }
}
