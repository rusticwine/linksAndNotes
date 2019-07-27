package com.sisa.experiments.linksAndNotes.persistence.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sisa.experiments.linksAndNotes.AbstractItem;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

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
//
//    @Override
//    public Set<AbstractItem> getEntityMap() {
//        return entityMap;
//    }
}
