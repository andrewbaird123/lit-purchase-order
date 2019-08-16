package com.lit.purchaseorderapi.service;

import com.lit.purchaseorderapi.model.PurchaseOrder.Infrastructure.InfrastructurePurchaseOrder;

import java.util.Set;

public class InfrastructurePurchaseOrderService implements PurchaseOrderService<InfrastructurePurchaseOrder> {
    @Override
    public InfrastructurePurchaseOrder save(InfrastructurePurchaseOrder purchaseOrder) {
        return null;
    }

    @Override
    public Set<InfrastructurePurchaseOrder> getAll() {
        return null;
    }

    @Override
    public InfrastructurePurchaseOrder getByPoNumber(String poNumber) {
        return null;
    }

    @Override
    public Double getTotalValue(InfrastructurePurchaseOrder purchaseOrder) {
        return null;
    }
}
