package com.niafikra.dimension.inventory.service;

import com.niafikra.dimension.inventory.entity.POItem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface POItemService {
    List<POItem> findAll();

    void deleteById(Long theId);

    void save(POItem poItem);

    Long count();

    Page<POItem> findAll(Pageable pageable);
}
