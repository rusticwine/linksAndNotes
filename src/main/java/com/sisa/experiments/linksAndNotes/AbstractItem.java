package com.sisa.experiments.linksAndNotes;

import lombok.Data;

import javax.persistence.*;
import java.net.URI;
import java.util.Set;

@Entity
@Data
public abstract class AbstractItem {

    @Id
    @GeneratedValue
//    @Setter(AccessLevel.NONE)
    private Long id;

    private String description;


//    @OneToOne(cascade = CascadeType.ALL)
//    private ItemReference itemReference;


//    @OneToMany(cascade= CascadeType.ALL, fetch = FetchType.EAGER)
//    private Set<String> tags;

    private URI url;
}
