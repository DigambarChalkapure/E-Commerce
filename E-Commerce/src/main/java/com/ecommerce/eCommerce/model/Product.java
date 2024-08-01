package com.ecommerce.eCommerce.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID productId;
    private String productName;
    private String productCategory;

    public void setProductId(UUID uuid) {
        this.productId = uuid;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
    public UUID getID(){
        return this.productId;
    }
    public String getName(){
        return this.productName;
    }
    public String getCategory(){
        return this.productCategory;
    }
}
