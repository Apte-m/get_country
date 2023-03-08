package com.country.get_country.controller;

import com.country.get_country.dao.CountryJson;
import com.country.get_country.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    private final CountryService cs;

    @Autowired
    public CountryController(CountryService cs) {
        this.cs = cs;
    }


    @GetMapping("/getCountry")
    public List<CountryJson> getCountry() {
        return cs.getAll();

    }
}
