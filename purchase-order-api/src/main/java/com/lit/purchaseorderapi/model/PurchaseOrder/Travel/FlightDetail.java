package com.lit.purchaseorderapi.model.PurchaseOrder.Travel;

import com.lit.purchaseorderapi.model.Currency;
import com.lit.purchaseorderapi.model.Person;

import java.util.Date;

public class FlightDetail {

    private String hotelName;
    private String departAirport;
    private Date departDate;
    private String arrivalAirport;
    private Date arrivalDate;
    private Currency currency;
    private double totalCost;
    private Person person;

}
