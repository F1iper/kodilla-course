package com.kodilla.good.patterns.challenges.flights;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Flight> flightsFrom = SearchFlight.findFlightFrom(Destination.GYD);
        List<Flight> flightsTo = SearchFlight.findFlightTo(Destination.TXL);
        List<Flight> flightsVia1 = SearchFlight.findFlightsVia(Destination.GYD, Destination.WAW, Destination.MXP);
        List<Flight> flightsVia2 = SearchFlight.findFlightsVia(Destination.DUB, Destination.LHR, Destination.KRK);

        System.out.println("Flights from: " + Destination.GYD.getCityName() + " |" + Destination.GYD + "| " + flightsFrom);
        System.out.println("\nFlights to: " + Destination.TXL.getCityName() + " |" + Destination.TXL + "| " + flightsTo);
        System.out.println("\nFlight from: " + Destination.GYD.getCityName() + " |" + Destination.GYD + "| to: " +
                Destination.MXP + " |" + Destination.MXP.getCityName() + "| , connection airport: |" + Destination.WAW + "| " + Destination.WAW.getCityName() + " " + flightsVia1);

        System.out.println("\nFlight from: " + Destination.DUB.getCityName() + " |" + Destination.DUB + "| to: " +
                Destination.KRK + " |" + Destination.KRK.getCityName() + "| , connection airport: |" + Destination.LHR + "| " + Destination.LHR.getCityName() + " " + flightsVia2);
    }
}