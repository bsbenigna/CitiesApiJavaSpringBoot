package com.github.bsbenigna.apicities.countries.repository;

import com.github.bsbenigna.apicities.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
