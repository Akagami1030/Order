package com.akagami.order.model.dto;

import com.akagami.order.model.Item;
import com.akagami.order.model.ItemGroup;

import java.util.List;
import java.util.UUID;

public interface ItemGroupDto {
    void insertItemGroup(Item item);
    List<ItemGroup> getAllItemsGroup();
    void cleanTempDb();
}
