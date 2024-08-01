package com.ecommerce.eCommerce.repositories;

import com.ecommerce.eCommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}
