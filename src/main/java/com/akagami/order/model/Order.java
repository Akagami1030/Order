package com.akagami.order.model;

import java.util.List;
import java.util.UUID;

public class Order {
    private final UUID idOrder;
    private final Customer idCustomer;
    private List<ItemGroup> listOfItemsGroup;
    private double price;

    public Order(Customer idCustomer, List<ItemGroup> listOfItemsGroup) {
        this.idOrder = UUID.randomUUID();
        this.idCustomer = idCustomer;
        this.listOfItemsGroup = listOfItemsGroup;
    }

    public UUID getIdOrder() {
        return idOrder;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    public List<ItemGroup> getListOfItemsGroup() {
        return listOfItemsGroup;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
