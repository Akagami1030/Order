package com.akagami.order.model;

import java.util.UUID;

public class Item {
    private final UUID idItem;
    private String name;
    private String description;
    private int amount;

    public Item(String name, String description, int amount) {
        idItem = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.amount = amount;
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
}
