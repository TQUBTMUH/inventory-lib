package com.niafikra.dimension.inventory.dao;

import com.niafikra.dimension.inventory.entity.POItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface POItemRepository extends JpaRepository<POItem, Long> {
}
