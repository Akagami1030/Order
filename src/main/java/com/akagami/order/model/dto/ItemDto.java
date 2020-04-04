package com.akagami.order.model.dto;

import com.akagami.order.model.Item;
import com.akagami.order.model.ItemGroup;

import java.util.List;
import java.util.UUID;

public interface ItemDto {
    void insertItem(Item item);

    Item getItemById(UUID id);
    List<Item> getAllItems();
    List<Item> getItemsAvailables();
    void setStock(Item item);


}
