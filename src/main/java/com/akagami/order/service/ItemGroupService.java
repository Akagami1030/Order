package com.akagami.order.service;

import com.akagami.order.model.ItemGroup;
import com.akagami.order.model.dto.ItemGroupDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ItemGroupService {
    private ItemGroupDto itemGroupDto;

    @Autowired
    public ItemGroupService(ItemGroupDto itemGroupDto) {
        this.itemGroupDto = itemGroupDto;
    }

    public void addANewItemGroup(ItemGroup itemGroup) {
        itemGroupDto.insertItemGroup(itemGroup);
    }

    public ItemGroup getItemGroupById(UUID id) {
        return itemGroupDto.getItemGroupById(id);
    }
}
