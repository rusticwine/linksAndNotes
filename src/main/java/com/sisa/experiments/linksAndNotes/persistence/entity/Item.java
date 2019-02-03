package com.sisa.experiments.linksAndNotes.persistence.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;

import java.net.URI;
import java.util.Set;

@Entity
@Data
public class Item {

    @Id
    @GeneratedValue
//    @Setter(AccessLevel.NONE)
    private Long id;

    private String description;

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
