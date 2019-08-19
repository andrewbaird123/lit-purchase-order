package com.lit.purchaseorderapi.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Approval {

    private Person approver;
    private Date date;

}
