package com.example.springelasticsearch.service;

import com.example.springelasticsearch.model.Product;

import java.util.List;

public interface ProductService {

    Iterable<Product> getAllProduct();

    List<Product> findByNameLikeOrDescription(String name, String description);

    List<Product> findByName(String name);

    Product createProduct(Product product);

    void deleteProduct(Long productId);
}
