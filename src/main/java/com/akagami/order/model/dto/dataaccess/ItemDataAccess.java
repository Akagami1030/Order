package com.akagami.order.model.dto.dataaccess;

import com.akagami.order.model.Item;
import com.akagami.order.model.dto.ItemDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Repository
public class ItemDataAccess implements ItemDto {

    private List<Item> db = new ArrayList<>();

    @Override
    public void insertItem(Item item) {
        db.add(item);
    }

    @Override
    public Item getItemById(UUID id) {
        return db.stream().filter(item -> item.getIdItem().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<Item> getAllItems() {
        return db;
    }

    @Override
    public List<Item> getItemsAvailables() {
        return db.stream().filter(item -> item.getAmount() > 0).collect(Collectors.toList());
    }
}
