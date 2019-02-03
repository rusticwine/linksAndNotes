package com.sisa.experiments.linksAndNotes;

import com.sisa.experiments.linksAndNotes.persistence.entity.Item;
import com.sisa.experiments.linksAndNotes.repository.ItemCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
public class ItemController {

//    public List<>
    @Autowired
    ItemCrudRepository repo;

    @GetMapping
    public Iterable<Item> all() {
        System.out.println("Item#get all: ");
        Iterable<Item> items = repo.findAll();
        return items;
    }

    @PostMapping
    public Item post(@RequestBody final Item item) {
        System.out.println("Item#post: " + item.toString());
        repo.save(item);
        return item;
    }
}
