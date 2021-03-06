package com.akagami.order.model.dto;

import com.akagami.order.model.Order;

import java.util.List;
import java.util.UUID;

public interface OrderDto {
    void insertOrder(Order order);
    Order getOrderById(UUID id);
    List<Order> getAllOrders();
}
