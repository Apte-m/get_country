package com.country.get_country.service;

import com.country.get_country.dao.CountryJson;
import com.country.get_country.data.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CountryService {

    private final CountryRepository cr;

    @Autowired
    public CountryService(CountryRepository cr) {
        this.cr = cr;
    }

    public List <CountryJson> getAll(){
        return cr.findAll()
                .stream()
                .map(CountryJson::fromEntity).
                collect(Collectors.toList());
    }
}
