package com.github.bsbenigna.distancecalculator.countries.repository;

import com.github.bsbenigna.distancecalculator.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
