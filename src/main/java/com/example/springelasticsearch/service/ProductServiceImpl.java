package com.example.springelasticsearch.service;

import com.example.springelasticsearch.model.Product;
import com.example.springelasticsearch.repository.ProductRepository;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    //TODO ElasticsearchOperations kullanmıyoruz buna sonra bak
    private final ElasticsearchOperations elasticsearchOperations;

    public ProductServiceImpl(ProductRepository productRepository, ElasticsearchOperations elasticsearchOperations) {
        this.productRepository = productRepository;
        this.elasticsearchOperations = elasticsearchOperations;
    }

    @Override
    public Iterable<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> findByNameLikeOrDescription(String name, String description) {
        return productRepository.findByNameLikeOrDescription(name, description);
    }

    @Override
    public List<Product> findByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long productId) {
         productRepository.deleteById(
                 (productRepository.findById(productId)
                 .orElseThrow(() -> new RuntimeException("Kullanıcı bulunamadı"))
                 .getId()));
    }
}
