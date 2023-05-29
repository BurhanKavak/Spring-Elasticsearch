package com.example.springelasticsearch.repository;

import com.example.springelasticsearch.model.Product;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository extends ElasticsearchRepository<Product,Long> {

    @Query("{\"bool\": {\"must\": [{\"match\": {\"name\": \"?0\"}}]}}")
    List<Product> findByName(String name);

    List<Product> findByNameLikeOrDescription(String name, String description);
}
