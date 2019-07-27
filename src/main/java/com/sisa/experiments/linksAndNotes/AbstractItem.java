package com.sisa.experiments.linksAndNotes;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.net.URI;
import java.util.Objects;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractItem)) return false;
        AbstractItem that = (AbstractItem) o;
        return Objects.equals(getDescription(), that.getDescription()) &&
                Objects.equals(getUrl(), that.getUrl());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescription(), getUrl());
    }

    @JsonBackReference
    public abstract Set<AbstractItem> getEntityMap();
}
