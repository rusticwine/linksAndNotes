package com.sisa.experiments.linksAndNotes;

import com.sisa.experiments.linksAndNotes.persistence.entity.Item;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
public class ItemController {

//    public List<>

    @GetMapping
    public String all() {
        System.out.println("Item#get all: ");
        return "Items";
    }

    @PostMapping
    public Item post(@RequestBody final Item item) {
        System.out.println("Item#post: " + item.toString());
        return item;
    }
}
