package com.lit.purchaseorderapi.model.PurchaseOrder;

import com.lit.purchaseorderapi.model.Currency;
import com.lit.purchaseorderapi.model.Status;
import com.lit.purchaseorderapi.model.Approval;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PurchaseOrder {

    /* PO */
    private String poNumber;
    private Date date;

    /* WORKFLOW */
    private Status status;

    /* COST */
    private Double netTotal;
    private Currency currency;

    /* APPROVAL */
    private Approval requistionedBy;
    private Approval authorisedBy;
    private Approval countersignedBy;

}
