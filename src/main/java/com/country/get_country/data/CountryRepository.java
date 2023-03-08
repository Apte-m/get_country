package com.country.get_country.data;

import com.country.get_country.data.entity.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public interface CountryRepository extends JpaRepository<CountryEntity, UUID> {


}
