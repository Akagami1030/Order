package com.akagami.order.model;

import java.time.LocalDate;
import java.util.UUID;

public class ItemGroup {
    private final UUID idItemGroup;
    private UUID itemId;
    private int amount;
    private LocalDate shippingDate;

    public ItemGroup(UUID item, int amount) {
        this.idItemGroup = UUID.randomUUID();
        this.itemId = item;
        this.amount = amount;
        this.shippingDate = LocalDate.now();
    }

    public UUID getIdItemGroup() {
        return idItemGroup;
    }

    public UUID getItemId() {
        return itemId;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDate getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(LocalDate shippingDate) {
        this.shippingDate = shippingDate;
    }
}
