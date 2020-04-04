package com.akagami.order.api;

import com.akagami.order.model.Customer;
import com.akagami.order.model.Item;
import com.akagami.order.model.ItemGroup;
import com.akagami.order.model.Order;
import com.akagami.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/order")
public class OrderController {
    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping(consumes = "application/json")
    void makeNewGroupItem(@RequestBody ItemGroup itemGroup){
        orderService.addNewItem(itemGroup);
    }
    @PostMapping(consumes = "application/json", produces = "application/json", path = "/myorder")
    public Order makeNewOrder(@RequestBody Customer customer){
        Order order = orderService.makeNewOrder(customer);
        return orderService.getOrderById(order.getIdOrder());

    }
    @GetMapping(produces = "application/json")
    public List<ItemGroup> getItemsGroup(){
       return orderService.getAllItemGroups();
    }
}
