package com.ecommerce.eCommerce.service;

import com.ecommerce.eCommerce.model.Product;
import com.ecommerce.eCommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductImplementation implements ServiceProvider {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> getAllProductList() {
        return productRepository.findAll();
    }

    @Override
    public void createProduct(Product product) {
        UUID uuid = UUID.randomUUID();
        product.setProductId(uuid);
        productRepository.save(product);
    }

    @Override
    public String deleteProduct(UUID productId) {
        if (!productRepository.existsById(productId)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found");
        }

        productRepository.deleteById(productId);
        return "Product with productId " + productId + " deleted successfully";
    }

    @Override
    public Optional<Product> updateProduct(Product product , UUID productId) {
        Optional<Product> savedproduct = Optional.of(productRepository.findById(productId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));

        product.setProductId(productId);
        productRepository.save(product);

        return savedproduct;
    }
}
