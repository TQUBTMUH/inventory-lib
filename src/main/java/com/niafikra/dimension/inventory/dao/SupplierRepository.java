package com.niafikra.dimension.inventory.dao;

import com.niafikra.dimension.inventory.entity.Supplier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    Supplier findByName(String name);

    Long countAllByName(String name);
    Page<Supplier> findByNameContaining(String name, Pageable pageable);
}
