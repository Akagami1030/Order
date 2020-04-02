package com.akagami.order.model.dto;

import com.akagami.order.model.Order;

import java.util.UUID;

public interface OrderDto {
    void insertOrder(Order order);
    Order getOrderById(UUID order);
}
