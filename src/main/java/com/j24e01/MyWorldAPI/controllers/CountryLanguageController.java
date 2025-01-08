package com.j24e01.MyWorldAPI.controllers;

import com.j24e01.MyWorldAPI.models.CountryLanguage;
import com.j24e01.MyWorldAPI.models.CountryLanguageId;
import com.j24e01.MyWorldAPI.services.CountryLanguageService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class CountryLanguageController {

    @Autowired
    private CountryLanguageService countryLanguageService;

    @GetMapping
    public List<CountryLanguage> getAllLanguages() {
        return countryLanguageService.getAllLanguages();
    }

    @GetMapping("/{countryCode}/{language}")
    public CountryLanguage getLanguageById(@PathVariable String countryCode, @PathVariable String language) {
        CountryLanguageId id = new CountryLanguageId();
        id.setCountryCode(countryCode);
        id.setLanguage(language);
        return countryLanguageService.getLanguageById(id);
    }

    @PostMapping
    public CountryLanguage createLanguage(@RequestBody CountryLanguage language) {
        return countryLanguageService.saveLanguage(language);
    }

    @DeleteMapping("/{countryCode}/{language}")
    public void deleteLanguage(@PathVariable String countryCode, @PathVariable String language) {
        CountryLanguageId id = new CountryLanguageId();
        id.setCountryCode(countryCode);
        id.setLanguage(language);
        countryLanguageService.deleteLanguage(id);
    }
}

