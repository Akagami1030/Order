package com.akagami.order.model.dto.dataaccess;

import com.akagami.order.model.ItemGroup;
import com.akagami.order.model.dto.ItemGroupDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class ItemGroupDataAccess implements ItemGroupDto {
    private List<ItemGroup> db = new ArrayList<>();

    @Override
    public void insertItemGroup(ItemGroup itemGroup) {
        db.add(itemGroup);
    }

    @Override
    public ItemGroup getItemGroupById(UUID itemGroup) {
        return db.stream().filter(item -> item.getIdItemGroup().equals(itemGroup)).findFirst().orElse(null);
    }
}
