package com.lit.purchaseorderapi.model.PurchaseOrder;

import com.lit.purchaseorderapi.model.Currency;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PurchaseOrderItem {

    private int quantity;
    private String description;
    private double unitCost;
    private double totalCost;
    private Currency currency;

    public double getTotalCost() {
        return quantity * unitCost;
    }

}
