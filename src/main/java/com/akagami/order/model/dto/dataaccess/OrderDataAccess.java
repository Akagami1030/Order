package com.akagami.order.model.dto.dataaccess;

import com.akagami.order.model.Order;
import com.akagami.order.model.dto.OrderDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Repository
public class OrderDataAccess implements OrderDto {
    private List<Order> db = new ArrayList<>();


    @Override
    public void insertOrder(Order order) {
        db.add(order);
    }

    @Override
    public Order getOrderById(UUID id) {
      return db.stream().filter(order -> order.getIdOrder().equals(id)).findFirst().orElse(null);
    }
}
