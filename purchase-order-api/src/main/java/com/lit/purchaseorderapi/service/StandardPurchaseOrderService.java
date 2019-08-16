package com.lit.purchaseorderapi.service;

import com.lit.purchaseorderapi.model.PurchaseOrder.Standard.StandardPurchaseOrder;

import java.util.Set;

public class StandardPurchaseOrderService implements PurchaseOrderService<StandardPurchaseOrder> {
    @Override
    public StandardPurchaseOrder save(StandardPurchaseOrder purchaseOrder) {
        return null;
    }

    @Override
    public Set<StandardPurchaseOrder> getAll() {
        return null;
    }

    @Override
    public StandardPurchaseOrder getByPoNumber(String poNumber) {
        return null;
    }

    @Override
    public Double getTotalValue(StandardPurchaseOrder purchaseOrder) {
        return null;
    }
}
