package com.sisa.experiments.linksAndNotes;

import com.sisa.experiments.linksAndNotes.persistence.entity.Item;
import com.sisa.experiments.linksAndNotes.repository.ItemCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.PathParam;


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

    @PostMapping("/{id}/link")
    public Item linkByItem(@PathParam("id") final Long id, @RequestBody final Item itemToAdd) {
        System.out.println("AddItemByItem#post, id, item: " + id + ", " + itemToAdd.toString());
        Item item = repo.findById(id).get();
        item.getEntitytMap().put(itemToAdd.getDescription(), itemToAdd);
//        repo.save(item);
        return item;
    }
    @PostMapping("/{id}/link/{idToAdd}")
    public Item linkById(@PathVariable("id") final Long id, @PathVariable("idToAdd") final Long idToAdd) {
        System.out.println("AddItemById#post, id, idToAdd: " + id + ", " + idToAdd);
        /**/
        Item item = repo.findById(id).get();
        Item itemToAdd = repo.findById(idToAdd).get();
        item.getEntitytMap().put(itemToAdd.getDescription(), itemToAdd);
        repo.save(item);
        return item;
        /**/
//        return null;
    }
}
