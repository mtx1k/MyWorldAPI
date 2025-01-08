package com.j24e01.MyWorldAPI.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "countrylanguage")
public class CountryLanguage {

    @EmbeddedId
    private CountryLanguageId id;

    @MapsId("countryCode")
    @ManyToOne
    @JoinColumn(name = "CountryCode", nullable = false)
    private Country countryCode;

    @Column(name = "IsOfficial", nullable = false)
    private Boolean isOfficial;

    @Column(name = "Percentage", nullable = false, precision = 4, scale = 1)
    private Double percentage;

    public CountryLanguageId getId() {
        return id;
    }

    public void setId(CountryLanguageId id) {
        this.id = id;
    }

    public Country getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Country countryCode) {
        this.countryCode = countryCode;
    }

    public Boolean getOfficial() {
        return isOfficial;
    }

    public void setOfficial(Boolean official) {
        isOfficial = official;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CountryLanguage that = (CountryLanguage) o;
        return Objects.equals(id, that.id) && Objects.equals(countryCode, that.countryCode) && Objects.equals(isOfficial, that.isOfficial) && Objects.equals(percentage, that.percentage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, countryCode, isOfficial, percentage);
    }

    @Override
    public String toString() {
        return "CountryLanguage{" +
                "id=" + id +
                ", countryCode=" + countryCode +
                ", isOfficial=" + isOfficial +
                ", percentage=" + percentage +
                '}';
    }
}

