package com.sisa.experiments.linksAndNotes.persistence.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
@Data
public class ItemReference {

    @Id
    @GeneratedValue
    private Long id;

    @JsonBackReference
    @OneToMany(cascade = CascadeType.ALL)
    Map<String, Item> entitytMap = new HashMap<String, Item>();
}
