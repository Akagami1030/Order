package com.akagami.order.model.dto;

import com.akagami.order.model.ItemGroup;

import java.util.UUID;

public interface ItemGroupDto {
    void insertItemGroup(ItemGroup itemGroup);
    ItemGroup getItemGroupById(UUID itemGroup);

}
