package com.country.get_country.dao;

import com.country.get_country.data.entity.CountryEntity;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class CountryJson {

    private String name;
    private String code;
    public static CountryJson fromEntity(CountryEntity countryEntity) {
        return  new CountryJson(countryEntity.getName(),countryEntity.getCode());
    }
}
