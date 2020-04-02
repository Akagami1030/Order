package com.akagami.order.model;

import java.time.LocalDate;

public class ItemGroup {
    private Item selectedItem;
    private int amount;
    private LocalDate localDate;

    public ItemGroup(Item selectedItem, int amount) {
        this.selectedItem = selectedItem;
        this.amount = amount;
        this.localDate = LocalDate.now();
    }

    public Item getSelectedItem() {
        return selectedItem;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }
}
