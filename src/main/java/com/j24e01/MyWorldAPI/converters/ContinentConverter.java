package com.j24e01.MyWorldAPI.converters;

import com.j24e01.MyWorldAPI.models.Continent;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true) // Automatically apply to all Continent fields
public class ContinentConverter implements AttributeConverter<Continent, String> {

    @Override
    public String convertToDatabaseColumn(Continent continent) {
        if (continent == null) {
            return null;
        }
        // Convert enum constant to string with spaces (e.g., NORTH_AMERICA -> "North America")
        return continent.name().replace('_', ' '); // Replace underscores with spaces
    }

    @Override
    public Continent convertToEntityAttribute(String dbData) {
        if (dbData == null) {
            return null;
        }
        // Convert string from database (e.g., "North America") to enum constant (e.g., NORTH_AMERICA)
        return Continent.valueOf(dbData.replace(' ', '_')); // Replace spaces with underscores
    }
}