package com.akagami.order.model.dto.dataaccess;

import com.akagami.order.model.Item;
import com.akagami.order.model.ItemGroup;
import com.akagami.order.model.dto.ItemDto;
import com.akagami.order.model.dto.ItemGroupDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class ItemGroupDataAccess implements ItemGroupDto {

    private List<ItemGroup> db = new ArrayList<>();
    private ItemDto itemDto;

    @Autowired
    public ItemGroupDataAccess(ItemDto itemDto) {
        this.itemDto = itemDto;
    }


    @Override
    public void insertItemGroup(Item item) {
        Item itemById = itemDto.getItemById(item.getIdItem());
        db.add(new ItemGroup(itemById, item.getAmount()));
    }

    @Override
    public List<ItemGroup> getAllItemsGroup() {
        return db;
    }

    @Override
    public void cleanTempDb() {
        db.clear();
    }

}
