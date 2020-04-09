package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    List<Continent> continents = new ArrayList<>();

    public void addContinent (Continent continent){
        continents.add(continent);
    }

    public World(){}

    final List<Continent> getContinents() {
        return continents;
    }

       final BigDecimal getPeopleQuantity() {
            return continents.stream()
                    .flatMap(continents -> continents.getCountries().stream())
                    .map(Country::getPeopleQuantity)
                    .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}