package com.lit.purchaseorderapi.model.PurchaseOrder.Travel;

import com.lit.purchaseorderapi.model.PaymentMethod;
import com.lit.purchaseorderapi.model.Person;
import com.lit.purchaseorderapi.model.PurchaseOrder.PurchaseOrder;
import com.lit.purchaseorderapi.model.PurchaseOrder.PurchaseOrderContact;
import com.lit.purchaseorderapi.model.UnitDetail;

import java.util.Set;

public class TravelPurchaseOrder extends PurchaseOrder {

    private String email;

    /* PAYMENT DETAILS */
    private PaymentMethod paymentMethod;
    private String creditCardName;

    /* PURCHASE ORDER SPECIFIC PROPERTIES */
    private TravelType reasonForTravel;
    private String additionalInfo;

    private Set<Person> travellers;
    private Set<FlightDetail> flightDetails;
    private Set<HotelDetail> hotelDetails;
    private Set<CarHireDetail> carHireDetails;

    private UnitDetail unitDetail;
}
