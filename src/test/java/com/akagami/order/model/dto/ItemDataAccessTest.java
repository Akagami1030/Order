package com.akagami.order.model.dto;

import com.akagami.order.model.Item;
import com.akagami.order.model.dto.dataaccess.ItemDataAccess;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemDataAccessTest {

    ItemDataAccess itemDataAccess;
    Item item1;
    Item item2;
    Item item3;

    @BeforeEach
    void setup(){
        itemDataAccess = new ItemDataAccess();
        item1 = new Item("Nike","Shoes for running",25,25);
        item2 = new Item("Adidas","Shoes for running",15,15);
        item3 = new Item("Reebok","Shoes for running",0,75);
        itemDataAccess.insertItem(item1);
        itemDataAccess.insertItem(item2);
        itemDataAccess.insertItem(item3);
    }

    @Test
    void isItemPresentIntTheDb(){
        Item actualItem = itemDataAccess.getItemById(item1.getIdItem());
        assertThat(item1.getIdItem()).isEqualTo(actualItem.getIdItem());
    }
    @Test
    void getAllItemsFromTheDb(){
        List<Item> actualList = itemDataAccess.getAllItems();
        assertThat(3).isEqualTo(actualList.size());
    }
    @Test
    void getAllItemsAvailablesFromTheDb(){
        List<Item> actualList = itemDataAccess.getItemsAvailables();
        assertThat(2).isEqualTo(actualList.size());
    }

}