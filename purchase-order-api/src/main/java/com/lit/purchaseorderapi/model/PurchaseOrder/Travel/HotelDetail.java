package com.lit.purchaseorderapi.model.PurchaseOrder.Travel;

import com.lit.purchaseorderapi.model.Currency;
import com.lit.purchaseorderapi.model.Person;

import java.util.Date;

public class HotelDetail {

    private String hotelName;
    private Date checkInDate;
    private Date checkOutDate;
    private Currency currency;
    private Double totalCost;
    private Person person;

}
