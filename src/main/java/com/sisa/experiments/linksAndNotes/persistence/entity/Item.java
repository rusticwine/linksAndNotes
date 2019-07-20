package com.sisa.experiments.linksAndNotes.persistence.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sisa.experiments.linksAndNotes.AbstractItem;
import com.sisa.experiments.linksAndNotes.ItemWrapper;
import com.sisa.experiments.linksAndNotes.ItemWrapper2;
import lombok.AccessLevel;
import lombok.Setter;
import lombok.Data;

import javax.persistence.*;

import java.io.Serializable;
import java.net.URI;
import java.util.*;

@Entity
@Data
public class Item extends AbstractItem implements Serializable {


//    @JsonIgnore
//@JsonBackReference
//    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL)
    Set<AbstractItem> entityMap;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        if (!super.equals(o)) return false;
        Item item = (Item) o;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }
}
