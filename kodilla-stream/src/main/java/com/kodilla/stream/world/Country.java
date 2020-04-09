package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String name;
    private final BigDecimal numberOfPeople;

    public Country(final String countryName, final BigDecimal numberOfPeople) {
        this.name = countryName;
        this.numberOfPeople = numberOfPeople;
    }

    public String getName() {
        return name;
    }
    public BigDecimal getPeopleQuantity() {
        return numberOfPeople;
    }

    @Override
    public String toString() {
        return "Country: " + name + ", number of people: " + numberOfPeople;
    }
}