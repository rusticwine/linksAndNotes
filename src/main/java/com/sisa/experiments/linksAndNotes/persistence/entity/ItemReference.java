package com.sisa.experiments.linksAndNotes.persistence.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Entity
@Data
public class ItemReference implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String koma;
//    @JsonManagedReference
    @JsonBackReference
    @OneToMany(cascade = CascadeType.ALL)
    Map<String, Item> entitytMap = new HashMap<String, Item>();
}
