package com.lit.purchaseorderapi.data;

import com.lit.purchaseorderapi.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class DummyDataConfig {

    @Bean(name = "persons")
    public List<Person> function() {
        List<Person> persons = new ArrayList<>();
        persons.add(Person.builder().nNumber("n1111111").firstName("Steve").lastName("Jobs").email("steve@apple.com").build());
        persons.add(Person.builder().nNumber("n2222222").firstName("Bill").lastName("Gates").email("bill@microsoft.com").build());
        return persons;
    }

}
