package com.akagami.order.service;

import com.akagami.order.model.Customer;
import com.akagami.order.model.Order;
import com.akagami.order.model.dto.CustomerDto;
import com.akagami.order.model.dto.ItemDto;
import com.akagami.order.model.dto.ItemGroupDto;
import com.akagami.order.model.dto.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {
    private OrderDto orderDto;
    private ItemGroupDto itemGroupDto;
    private ItemDto itemDto;
    private CustomerDto customerDto;

    @Autowired
    public OrderService(OrderDto orderDto, ItemGroupDto itemGroupDto, ItemDto itemDto, CustomerDto customerDto) {
        this.orderDto = orderDto;
        this.itemGroupDto = itemGroupDto;
        this.itemDto = itemDto;
        this.customerDto = customerDto;
    }

    public void addNewOrder(Order order){
        orderDto.insertOrder(order);
    }

    public Order getOrderById(UUID id){
       return orderDto.getOrderById(id);
    }
}
