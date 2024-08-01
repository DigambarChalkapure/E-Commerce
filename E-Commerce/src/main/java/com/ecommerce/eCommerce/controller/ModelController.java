package com.ecommerce.eCommerce.controller;

import com.ecommerce.eCommerce.model.Product;
import com.ecommerce.eCommerce.service.ServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class ModelController {
    @Autowired
    private ServiceProvider service;

    @GetMapping("/api/public/products")
   public List<Product> getAllProducts(){

        return service.getAllProductList();

    }

    @PostMapping("/api/public/products")
    public void addProduct(@RequestBody Product product){

        service.createProduct(product);
        System.out.println("add product from controller");
    }

    @DeleteMapping("/api/public/products/{productId}")
    public String deleteProduct(@PathVariable UUID productId){
        return service.deleteProduct(productId);
    }

    @PutMapping("/api/public/products/{productId}")
    public Optional<Product> updateProduct(@RequestBody Product product, @PathVariable UUID productId){
        return service.updateProduct(product,productId);
    }

}
