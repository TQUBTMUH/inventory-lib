package com.niafikra.dimension.inventory.dao;

import com.niafikra.dimension.inventory.entity.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {
//    @Query(value = "SELECT item.id FROM item INNER JOIN purchase_order_item ON " +
//            "item.id = purchase_order_item.item_id WHERE purchase_order_item.purchase_order_id = :poId",
//            nativeQuery = true)
//    Long findByItemId(@Param("poId") Long purchaseOrderId);

}

