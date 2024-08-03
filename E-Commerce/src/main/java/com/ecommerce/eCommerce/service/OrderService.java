package com.ecommerce.eCommerce.service;

import com.ecommerce.eCommerce.model.Order;
import com.ecommerce.eCommerce.repositories.OrderRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collections;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
    public Order updateOrder(Long orderId, @NotNull Order order){
        Order savedOrder = orderRepository.findById(orderId).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Order Not Found"));
        order.setOrderId(orderId);
        return orderRepository.save(order);
    }
}




