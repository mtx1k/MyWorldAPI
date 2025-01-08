package com.j24e01.MyWorldAPI.repositories;

import com.j24e01.MyWorldAPI.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
}
