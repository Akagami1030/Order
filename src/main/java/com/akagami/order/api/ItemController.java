package com.akagami.order.api;

import com.akagami.order.model.Item;
import com.akagami.order.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/items")
public class ItemController {

    private ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Item createItem(@RequestBody Item item) {
        itemService.addItemInTheDb(item);
        return itemService.getItemById(item.getIdItem());
    }


    @GetMapping(produces = "application/json", path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Item getItemByItem(@PathVariable UUID id) {
        return itemService.getItemById(id);
    }

    @GetMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @GetMapping(produces = "application/json", path = "/itemsAreAvailables")
    @ResponseStatus(HttpStatus.OK)
    public List<Item> getAvailablesItems() {
        return itemService.getAvailablesItems();
    }
}
