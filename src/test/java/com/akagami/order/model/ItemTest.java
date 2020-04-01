package com.akagami.order.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    @Test
    public void newItemIsEqualTheInputValues(){
        Item item = new Item("Shoes","Smart shoes",45);
        String actualName = item.getName();
        assertThat(item.getName()).isEqualTo(actualName);
    }

}