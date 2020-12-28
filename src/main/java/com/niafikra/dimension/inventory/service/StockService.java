package com.niafikra.dimension.inventory.service;

import com.niafikra.dimension.inventory.entity.Item;
import com.niafikra.dimension.inventory.entity.Stock;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StockService {
    List<Stock> findAll();

    // auto increment item quantity with value from received PO items
    void customeStockUpdate(Long theId);

    void deleteById(Long theId);

    void save(Stock stock);

    Page<Stock> findAll(Pageable pageable);

    Page<Stock> findAll(StockServiceImp.StockFilter filter, Pageable pageable);

//    List<Stock> findAll(StockFilter filter);

    Long count();

    Long count(StockServiceImp.StockFilter stockFilter);

    // used by filter
    Item findByItemName(String name);
}
