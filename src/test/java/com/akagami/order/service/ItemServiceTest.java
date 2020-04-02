package com.akagami.order.service;

import com.akagami.order.model.Item;
import com.akagami.order.model.dto.dataaccess.ItemDataAccess;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemServiceTest {

    ItemDataAccess itemDataAccess = new ItemDataAccess();
    ItemService itemService;
    Item item1;
    Item item2;
    Item item3;

    @BeforeEach
    void setup() {
        itemService = new ItemService(itemDataAccess);
        item1 = new Item("Nike", "Shoes for running", 25,36);
        item2 = new Item("Adidas", "Shoes for running", 15,25);
        item3 = new Item("Reebok", "Shoes for running", 0,12.5);
        itemService.addItemInTheDb(item1);
        itemService.addItemInTheDb(item2);
        itemService.addItemInTheDb(item3);
    }

    @Test
    void verifyIfAddToTheDb() {
        Item actualItem = itemService.getItemById(item1.getIdItem());
        List<Item> actualItems = itemService.getAllItems();
        List<Item> actualAvailablesItems = itemService.getAvailablesItems();

        assertThat(item1.getIdItem()).isEqualTo(actualItem.getIdItem());
        assertThat(3).isEqualTo(actualItems.size());
        assertThat(2).isEqualTo(actualAvailablesItems.size());
    }


}