package com.lit.purchaseorderapi.model.PurchaseOrder.Contractor;

import com.lit.purchaseorderapi.model.Person;
import com.lit.purchaseorderapi.model.PurchaseOrder.PurchaseOrderDetailed;

import java.util.Date;

public class ContractorPurchaseOrder extends PurchaseOrderDetailed {

    /* PURCHASE ORDER SPECIFIC PROPERTIES */

    private Person contractor;
    private Date contractStartDate;
    private Date contractEndDate;
    private Double contractWorkingDays; // TODO should this be calculated from start/end dates?

    private Date poStartDate;
    private Date poEndDate;
    private Double poWorkingDays; // TODO should this be calculated from start/end dates?

    private Double dollarConversionRate; // TODO - is this admin ref data?
    private Double workingHoursPerDay;
    private Double dailyCostToLit;
    private Double dailyChargeOutRate; // TODO - does currency need to be linked?
    private Double hourlyChargeOutRate; // TODO - does currency need to be linked?

    private String projectName;
    private Person sdl;
    private Person invoiceApprover;
}
