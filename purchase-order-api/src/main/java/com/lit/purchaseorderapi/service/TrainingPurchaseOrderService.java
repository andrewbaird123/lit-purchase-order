package com.lit.purchaseorderapi.service;

import com.lit.purchaseorderapi.model.PurchaseOrder.Training.TrainingPurchaseOrder;

import java.util.Set;

public class TrainingPurchaseOrderService implements PurchaseOrderService<TrainingPurchaseOrder> {
    @Override
    public TrainingPurchaseOrder save(TrainingPurchaseOrder purchaseOrder) {
        return null;
    }

    @Override
    public Set<TrainingPurchaseOrder> getAll() {
        return null;
    }

    @Override
    public TrainingPurchaseOrder getByPoNumber(String poNumber) {
        return null;
    }

    @Override
    public Double getTotalValue(TrainingPurchaseOrder purchaseOrder) {
        return null;
    }
}
