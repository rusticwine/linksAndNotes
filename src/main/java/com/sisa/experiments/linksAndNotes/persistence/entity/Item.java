package com.sisa.experiments.linksAndNotes.persistence.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sisa.experiments.linksAndNotes.ItemWrapper;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;

import java.io.Serializable;
import java.net.URI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Entity
@Data
public class Item implements Serializable {

    @Id
    @GeneratedValue
//    @Setter(AccessLevel.NONE)
    private Long id;

    private String description;

//    @JsonIgnore
//@JsonBackReference
//    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL)
    Set<ItemWrapper> entitytMap;

//    @OneToOne(cascade = CascadeType.ALL)
//    private ItemReference itemReference;


//    @OneToMany(cascade= CascadeType.ALL, fetch = FetchType.EAGER)
//    private Set<String> tags;

    private URI url;

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
