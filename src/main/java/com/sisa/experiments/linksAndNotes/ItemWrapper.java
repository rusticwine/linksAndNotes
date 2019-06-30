package com.sisa.experiments.linksAndNotes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sisa.experiments.linksAndNotes.persistence.entity.Item;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.net.URI;

@Entity
public class ItemWrapper {

    @Id
    @GeneratedValue
    private Long id;

    @JsonIgnore
    private Item item;

    protected ItemWrapper() {
    }

    public ItemWrapper(Item item) {
        this.item = item;
    }

    public String getDescription() {
        return item.getDescription();
    }

    public URI getUri() {
        return item.getUrl();
    }
}
