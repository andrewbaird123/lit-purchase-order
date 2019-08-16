package com.lit.purchaseorderapi.model.PurchaseOrder;

import com.lit.purchaseorderapi.model.Contact;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PurchaseOrderContact extends PurchaseOrder {

    /* CONTACT DETAILS */
    private Contact contact;

}
