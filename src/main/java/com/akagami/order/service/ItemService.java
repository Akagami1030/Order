package com.akagami.order.service;

import com.akagami.order.model.Item;
import com.akagami.order.model.dto.ItemDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ItemService {
    private ItemDto itemDto;

    @Autowired
    public ItemService(ItemDto itemDto) {
        this.itemDto = itemDto;
    }

    public void addItemInTheDb(Item item) {
        itemDto.insertItem(item);
    }

    public Item getItemById(UUID id) {
        return itemDto.getItemById(id);
    }

    public List<Item> getAllItems() {
        return itemDto.getAllItems();
    }

    public List<Item> getAvailablesItems() {
        return itemDto.getItemsAvailables();
    }
}
