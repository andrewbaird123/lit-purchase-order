package com.lit.purchaseorderapi.service;

import com.lit.purchaseorderapi.model.Person;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Resource(name = "persons")
    private List<Person> persons;

    @Override
    public List<Person> getAll() {
        return persons;
    }

    @Override
    public List<Person> getSdls() {
        return null;
    }
}
