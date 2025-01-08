package com.j24e01.MyWorldAPI.services;

import com.j24e01.MyWorldAPI.models.CountryLanguage;
import com.j24e01.MyWorldAPI.models.CountryLanguageId;
import com.j24e01.MyWorldAPI.repositories.CountryLanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryLanguageService {

    @Autowired
    private CountryLanguageRepository countryLanguageRepository;

    public List<CountryLanguage> getAllLanguages() {
        return countryLanguageRepository.findAll();
    }

    public CountryLanguage getLanguageById(CountryLanguageId id) {
        return countryLanguageRepository.findById(id).orElse(null);
    }

    public CountryLanguage saveLanguage(CountryLanguage language) {
        return countryLanguageRepository.save(language);
    }

    public void deleteLanguage(CountryLanguageId id) {
        countryLanguageRepository.deleteById(id);
    }
}
