package com.lit.purchaseorderapi.model.PurchaseOrder.Infrastructure;

import com.lit.purchaseorderapi.model.Person;
import com.lit.purchaseorderapi.model.PurchaseOrder.PurchaseOrderDetailed;

import java.util.Set;

public class InfrastructurePurchaseOrder extends PurchaseOrderDetailed {

    /* PURCHASE ORDER SPECIFIC */
    private Set<InfrastructureItem> items;

    private String projectName = "Systems Infrastructure";
    private Person projectManager;

}
