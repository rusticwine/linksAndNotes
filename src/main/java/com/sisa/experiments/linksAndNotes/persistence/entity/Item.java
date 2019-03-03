package com.sisa.experiments.linksAndNotes.persistence.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Entity
@Data
public class Item {

    @Id
    @GeneratedValue
//    @Setter(AccessLevel.NONE)
    private Long id;

    private String description;

//    @JsonIgnore
@JsonBackReference
//    @JsonManagedReference
//    @ManyToMany(cascade = CascadeType.ALL)
//    Map<String, Item> entitytMap = new HashMap<String, Item>();
    @OneToOne(cascade = CascadeType.ALL)
//    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ItemReference itemReference;

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
