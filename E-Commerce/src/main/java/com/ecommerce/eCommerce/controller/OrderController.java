package com.ecommerce.eCommerce.controller;

import com.ecommerce.eCommerce.model.Order;
import com.ecommerce.eCommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.saveOrder(order);
    }

    @PutMapping("/{orderId}")
    public Order updateOrder(@PathVariable Long orderId, @RequestBody Order order) {
        return orderService.updateOrder(orderId,order);

    }

    @DeleteMapping("/{orderId}")
    public void deleteOrder(Long orderId){
        orderService.deleteOrder(orderId);
    }


}
