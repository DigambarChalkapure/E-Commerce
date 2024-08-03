package com.ecommerce.eCommerce.repositories;

import com.ecommerce.eCommerce.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
