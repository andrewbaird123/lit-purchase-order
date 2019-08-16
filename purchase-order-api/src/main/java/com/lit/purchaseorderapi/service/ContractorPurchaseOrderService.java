package com.lit.purchaseorderapi.service;

import com.lit.purchaseorderapi.model.PurchaseOrder.Contractor.ContractorPurchaseOrder;

import java.util.Set;

public class ContractorPurchaseOrderService implements PurchaseOrderService<ContractorPurchaseOrder> {
    @Override
    public ContractorPurchaseOrder save(ContractorPurchaseOrder purchaseOrder) {
        return null;
    }

    @Override
    public Set<ContractorPurchaseOrder> getAll() {
        return null;
    }

    @Override
    public ContractorPurchaseOrder getByPoNumber(String poNumber) {
        return null;
    }

    @Override
    public Double getTotalValue(ContractorPurchaseOrder purchaseOrder) {
        return null;
    }
}
