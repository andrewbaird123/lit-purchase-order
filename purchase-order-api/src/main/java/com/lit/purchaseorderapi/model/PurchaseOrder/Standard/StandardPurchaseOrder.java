package com.lit.purchaseorderapi.model.PurchaseOrder.Standard;

import com.lit.purchaseorderapi.model.PurchaseOrder.PurchaseOrderDetailed;
import com.lit.purchaseorderapi.model.PurchaseOrder.PurchaseOrderItem;
import com.lit.purchaseorderapi.model.UnitDetail;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class StandardPurchaseOrder extends PurchaseOrderDetailed {

    /* PURCHASE ORDER SPECIFIC */
    private Set<PurchaseOrderItem> items;

    private UnitDetail unitDetail;
}
