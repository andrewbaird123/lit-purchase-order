package com.lit.purchaseorderapi.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents an LIT employee
 */
@Getter
@Setter
@Builder
public class Person {

    private String nNumber;
    private String firstName;
    private String lastName;
    private String email;

}
