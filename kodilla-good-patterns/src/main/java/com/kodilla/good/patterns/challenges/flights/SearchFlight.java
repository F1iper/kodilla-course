package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.stream.Collectors;

public class SearchFlight {

    public static List<Flight> findFlightFrom(Destination departure) {
        return FlightSet.flights()
                .stream()
                .filter(f -> f.getDeparture() == departure)
                .collect(Collectors.toList());
    }

    public static List<Flight> findFlightTo(Destination arrival) {
        return FlightSet.flights()
                .stream()
                .filter(f -> f.getArrival() == arrival)
                .collect(Collectors.toList());
    }

    public static List<Flight> findFlightsVia(Destination from, Destination via, Destination to) {
        List<Flight> flightsWithChange1 = FlightSet.flights()
                .stream()
                .filter(f -> f.getDeparture() == from)
                .filter(f -> f.getArrival() == via)
                .collect(Collectors.toList());

        List<Flight> flightsWithChange2 = FlightSet.flights()
                .stream()
                .filter(f -> f.getDeparture() == via)
                .filter(f -> f.getArrival() == to)
                .collect(Collectors.toList());

        flightsWithChange1.addAll(flightsWithChange2);
        return flightsWithChange1;
    }
}