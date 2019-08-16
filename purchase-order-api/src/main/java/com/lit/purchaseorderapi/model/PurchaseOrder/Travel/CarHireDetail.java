package com.lit.purchaseorderapi.model.PurchaseOrder.Travel;

import com.lit.purchaseorderapi.model.Currency;

import java.util.Date;

public class CarHireDetail {
    private CarHireType type;
    private Date collectDate;
    private Date returnDate;
    private Currency currency;
    private Double totalCost;
}
