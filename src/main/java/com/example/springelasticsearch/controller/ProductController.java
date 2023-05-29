package com.example.springelasticsearch.controller;

import com.example.springelasticsearch.model.Product;
import com.example.springelasticsearch.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping
    public ResponseEntity<Iterable<Product>> getAllProduct() {
        return ResponseEntity.ok(productService.getAllProduct());
    }

    @GetMapping("/{search}")
    public ResponseEntity<List<Product>> getNameLikeOrDescription(@PathVariable("search") String search) {
        return ResponseEntity.ok(productService.findByNameLikeOrDescription(search,search));

    }


//    @GetMapping("/{search}")
//    public ResponseEntity<List<Product>> getProductsLikeName(@PathVariable("search") String name) {
//        return ResponseEntity.ok(productService.findByName(name));
//
//    }

    @PostMapping
    public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
        return new ResponseEntity<>(productService.createProduct(product), HttpStatus.CREATED);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable("id") Long productId) {
        productService.deleteProduct(productId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
