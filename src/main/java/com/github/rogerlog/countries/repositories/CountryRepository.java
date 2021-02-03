package com.github.rogerlog.countries.repositories;

import com.github.rogerlog.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
