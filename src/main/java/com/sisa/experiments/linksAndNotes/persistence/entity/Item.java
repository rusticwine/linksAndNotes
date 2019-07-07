package com.sisa.experiments.linksAndNotes.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

import java.io.Serializable;
import java.net.URI;
import java.util.Objects;
import java.util.Set;

@Entity
@Data
public class Item implements Serializable {

    @Id
    @GeneratedValue
//    @Setter(AccessLevel.NONE)
    private Long id;

    private String description;

    @JsonIgnore
//@JsonBackReference
//    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL)
    Set<Item> entityMap;

    public Set<? extends Item> getEntitySet() {
        return entityMap;
    }
//    @OneToOne(cascade = CascadeType.ALL)
//    private ItemReference itemReference;


//    @OneToMany(cascade= CascadeType.ALL, fetch = FetchType.EAGER)
//    private Set<String> tags;

    private URI url;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(description, item.description) &&
                Objects.equals(url, item.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, url);
    }
/*
    public Item() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    /**/
}
