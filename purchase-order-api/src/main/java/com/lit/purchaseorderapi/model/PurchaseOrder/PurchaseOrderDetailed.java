package com.lit.purchaseorderapi.model.PurchaseOrder;

import com.lit.purchaseorderapi.model.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PurchaseOrderDetailed extends PurchaseOrderContact {

    /* PAYMENT DETAILS */
    private PaymentMethod paymentMethod;
    private String creditCardName;

}
