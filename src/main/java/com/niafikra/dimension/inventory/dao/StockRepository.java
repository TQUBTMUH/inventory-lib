package com.niafikra.dimension.inventory.dao;

import com.niafikra.dimension.inventory.entity.Item;
import com.niafikra.dimension.inventory.entity.Stock;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
    Stock findByItem_Id(Long theId);

    Page<Stock> findByItemContaining(Item item, Pageable pageable);
    Page<Stock> findByQuantityContaining(Integer quantity, Pageable pageable);
    Page<Stock> findByItemAndQuantityContaining(Item item, Integer quantity, Pageable pageable);

    Long countAllByQuantity(Integer quantity);
    Long countAllByItem(Item item);
    Long countAllByItemAndQuantity(Item item, Integer integer);

    // for refresh() in StockView.class
    List<Stock> findByItemContaining(Item item);
    List<Stock> findByQuantityContaining(Integer quantity);
    List<Stock> findByItemAndQuantityContaining(Item item, Integer quantity);
}
