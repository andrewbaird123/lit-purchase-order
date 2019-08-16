package com.lit.purchaseorderapi.service;

import com.lit.purchaseorderapi.model.PurchaseOrder.PurchaseOrder;

import java.util.Set;

public interface PurchaseOrderService<T extends PurchaseOrder> {

    T save(T purchaseOrder);

    Set<T> getAll();

    T getByPoNumber(String poNumber);

    Double getTotalValue(T purchaseOrder);
}
