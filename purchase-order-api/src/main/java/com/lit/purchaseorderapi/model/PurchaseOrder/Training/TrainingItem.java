package com.lit.purchaseorderapi.model.PurchaseOrder.Training;

import com.lit.purchaseorderapi.model.Currency;
import com.lit.purchaseorderapi.model.Person;

import java.util.Date;
import java.util.Set;

public class TrainingItem {

    private String name;
    private Date startDte;
    private Date endDate;
    private String location;
    private boolean hotelIncInBookingFee;
    private Currency currency;
    private Double unitCost;
    private Set<Person> delegates;
    private String additionalInfo; // i.e. hotel name if hotelIncInBookingFee is true

}
