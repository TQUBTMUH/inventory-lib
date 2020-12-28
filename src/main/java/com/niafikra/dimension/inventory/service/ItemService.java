package com.niafikra.dimension.inventory.service;

import com.niafikra.dimension.inventory.entity.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ItemService {
    List<Item> findAll();

    Item save(Item newItem);

    Item findById(Long theId);

    Item update(Item newItem);

    void delete(Item item);

    Long count();

    Page<Item> findAll(Pageable pageable);

    Page<Item> findAll(ItemServiceImp.ItemFilter itemFilter, Pageable pageable);

    Long count(ItemServiceImp.ItemFilter itemFilter);
}
