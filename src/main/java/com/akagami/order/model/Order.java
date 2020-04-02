package com.akagami.order.model;

import java.util.List;
import java.util.UUID;

public class Order {
    private UUID idOrder;
    private List<ItemGroup> itemGroupList;
    private double totalPrice;
    private Customer customer;

    public Order(List<ItemGroup> itemGroupList,Customer customer) {
        this.idOrder = UUID.randomUUID();
        this.itemGroupList = itemGroupList;
        this.customer = customer;
    }

    public UUID getIdOrder() {
        return idOrder;
    }

    public List<ItemGroup> getItemGroupList() {
        return itemGroupList;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }
}
