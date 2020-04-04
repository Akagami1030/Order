package com.akagami.order.model;

import java.time.LocalDate;

public class ItemGroup {
    private Item selectedItem;
    private int amount;
    private LocalDate shippingdate;

    public ItemGroup(Item selectedItem, int amount) {
        this.selectedItem = selectedItem;
        this.amount = amount;
        this.shippingdate = verifyStock();
    }

    public Item getSelectedItem() {
        return selectedItem;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDate getShippingdate() {
        return shippingdate;
    }

    private LocalDate verifyStock() {
        if (selectedItem.getAmount() < amount) {
            return LocalDate.now().plusDays(7);
        }
        return LocalDate.now().plusDays(1);
    }
}
