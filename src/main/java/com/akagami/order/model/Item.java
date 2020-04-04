package com.akagami.order.model;

import java.util.UUID;

public class Item {
    private final UUID idItem;
    private String name;
    private String description;
    private double price;
    private int amount;

    public Item(String name, String description, int amount, double price) {
        idItem = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.price = price;
    }

    public UUID getIdItem() {
        return idItem;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
