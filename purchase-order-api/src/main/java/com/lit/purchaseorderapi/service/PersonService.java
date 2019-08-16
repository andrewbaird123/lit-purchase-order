package com.lit.purchaseorderapi.service;

import com.lit.purchaseorderapi.model.Person;

import java.util.List;

public interface PersonService {

    /**
     * Get all persons.
     * @return
     */
    List<Person> getAll();

    /**
     * Get all persons who are SDL's
     * @return
     */
    List<Person> getSdls();

}
