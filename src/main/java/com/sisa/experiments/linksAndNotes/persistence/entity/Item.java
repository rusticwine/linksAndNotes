package com.sisa.experiments.linksAndNotes.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonValue;
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


    @JsonIgnore
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

//    @JsonValue
//    public String getJsonChildren() {
//        System.out.println("test1");
//        return "test1:test1";
//    }

    @JsonRawValue
    public String getJsonChildren() {
        if (entityMap != null && entityMap.size() > 0) {
            StringBuilder sb = new StringBuilder(20 + (entityMap != null ? entityMap.size() : 0) * 30);
            sb.append("[");
            for (AbstractItem item : entityMap) {
                sb.append("{");
                sb.append("\"id\": \"").append(item.getId()).append("\"").append(",");
                sb.append("\"description\": \"").append(item.getDescription()).append("\"").append(",");
                sb.append("\"url\": \"").append(item.getUrl()).append("\"");
                sb.append("},");
            }
            sb.deleteCharAt(sb.length()-1);
            sb.append("]");
            return sb.toString();
        }
        System.out.println("test2");
        return "{}";
    }
}
