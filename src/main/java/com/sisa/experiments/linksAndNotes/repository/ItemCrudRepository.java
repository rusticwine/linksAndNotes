package com.sisa.experiments.linksAndNotes.repository;

import com.sisa.experiments.linksAndNotes.persistence.entity.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemCrudRepository extends CrudRepository<Item, Long> {
}
