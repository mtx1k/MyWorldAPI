package com.j24e01.MyWorldAPI.repositories;

import com.j24e01.MyWorldAPI.models.CountryLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, Long> {
}
