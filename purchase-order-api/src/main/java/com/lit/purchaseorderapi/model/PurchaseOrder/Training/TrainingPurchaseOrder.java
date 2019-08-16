package com.lit.purchaseorderapi.model.PurchaseOrder.Training;

import com.lit.purchaseorderapi.model.Person;
import com.lit.purchaseorderapi.model.PurchaseOrder.PurchaseOrderContact;

import java.util.Set;

public class TrainingPurchaseOrder extends PurchaseOrderContact {

    /* PURCHASE ORDER SPECIFIC PROPERTIES */
    private Set<BookingMethod> bookingMethods;

    private Set<TrainingItem> trainingItems;

    private Person director;

}
