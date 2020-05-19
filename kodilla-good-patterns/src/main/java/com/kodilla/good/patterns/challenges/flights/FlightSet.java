package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightSet {

    public static List<Flight> flights() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight(Destination.DUB, Destination.LHR));
        flights.add(new Flight(Destination.TXL, Destination.GYD));
        flights.add(new Flight(Destination.WAW, Destination.MXP));
        flights.add(new Flight(Destination.KRK, Destination.MAD));
        flights.add(new Flight(Destination.LHR, Destination.KRK));
        flights.add(new Flight(Destination.GYD, Destination.WAW));
        flights.add(new Flight(Destination.MAD, Destination.TXL));
        flights.add(new Flight(Destination.MXP, Destination.DUB));
        flights.add(new Flight(Destination.KRK, Destination.LHR));
        flights.add(new Flight(Destination.GYD, Destination.TXL));
        return new ArrayList<>(flights);
    }
}