package com.j24e01.MyWorldAPI.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "city")
public class City {

    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "Name", nullable = false, length = 35)
    private String name;

    @Column(name = "District", nullable = false, length = 20)
    private String district;

    @Column(name = "Population", nullable = false)
    private Integer population;

    @ManyToOne
    @JoinColumn(name = "CountryCode", nullable = false)
    private Country countryCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Country getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Country countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(id, city.id) && Objects.equals(name, city.name) && Objects.equals(district, city.district) && Objects.equals(population, city.population) && Objects.equals(countryCode, city.countryCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, district, population, countryCode);
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                ", countryCode=" + countryCode +
                '}';
    }
}
