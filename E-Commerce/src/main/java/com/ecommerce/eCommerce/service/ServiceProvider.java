package com.ecommerce.eCommerce.service;
import com.ecommerce.eCommerce.model.Product;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ServiceProvider {

    List<Product> getAllProductList();

    void createProduct(Product product);

    String deleteProduct(UUID productId);

    Optional<Product> updateProduct(Product product, UUID productId);

}
