package com.akagami.order.service;

import com.akagami.order.model.Customer;
import com.akagami.order.model.Item;
import com.akagami.order.model.ItemGroup;
import com.akagami.order.model.Order;
import com.akagami.order.model.dto.CustomerDto;
import com.akagami.order.model.dto.ItemDto;
import com.akagami.order.model.dto.ItemGroupDto;
import com.akagami.order.model.dto.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrderService {
    private CustomerDto customerDto;
    private ItemDto itemDto;
    private ItemGroupDto itemGroupDto;
    private OrderDto orderDto;

    @Autowired
    public OrderService(CustomerDto customerDto, ItemDto itemDto, ItemGroupDto itemGroupDto, OrderDto orderDto) {
        this.customerDto = customerDto;
        this.itemDto = itemDto;
        this.itemGroupDto = itemGroupDto;
        this.orderDto = orderDto;
    }

    public Order makeNewOrder(Customer customer){
        Customer userById = customerDto.getUserById(customer.getIdCustomer());
        Order newOrder = new Order(getAllItemGroups(),userById);
        orderDto.insertOrder(newOrder);
        itemGroupDto.cleanTempDb();
        return newOrder;

    }

    public void addNewItem(Item item){
        itemGroupDto.insertItemGroup(item);
    }

    public List<ItemGroup> getAllItemGroups(){
        return itemGroupDto.getAllItemsGroup();
    }

    public Order getOrderById(UUID idOrder){
       return orderDto.getOrderById(idOrder);
    }

}
