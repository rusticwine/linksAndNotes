package com.sisa.experiments.linksAndNotes.persistence.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
@Data
public class Item {

    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private Long id;
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
