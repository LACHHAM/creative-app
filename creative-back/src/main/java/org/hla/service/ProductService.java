package org.hla.service;

import org.hla.model.Product;

import java.util.List;

public class ProductService {

    private List<Product> productList;


    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> findAllProducts() {
        return productList;
    }


    public List<Product> findProductsByCategory(String category) throws Exception{
        throw new Exception("aucun produit trouvé pour cette catégory");
    }
}
