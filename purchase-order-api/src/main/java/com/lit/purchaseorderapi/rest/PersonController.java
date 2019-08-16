package com.lit.purchaseorderapi.rest;

import com.lit.purchaseorderapi.model.Person;
import com.lit.purchaseorderapi.service.PersonService;
import com.lit.purchaseorderapi.service.PersonServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(PersonController.class);

    private PersonService personService;

    public PersonController(PersonServiceImpl personService) {
        this.personService = personService;
    }

    @GetMapping
    private List<Person> getAll() {
        log.debug("Returning persons");
        return this.personService.getAll();
    }
}
