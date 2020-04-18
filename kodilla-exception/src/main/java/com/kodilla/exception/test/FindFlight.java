package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    static boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> possibleFlights = new HashMap<>();
        possibleFlights.put("BER", false);
        possibleFlights.put("EIN", true);
        possibleFlights.put("AMS", true);
        possibleFlights.put("PHX", false);
        possibleFlights.put("ABD", true);
        possibleFlights.put("BJS", false);

        if (possibleFlights.containsKey(flight.getArrivalAirport())) {
            return possibleFlights.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("Route is not possible!");
        }
    }

    static void search() throws RouteNotFoundException{
        Flight f1 = new Flight("WAW", "BER");
        Flight f2 = new Flight("WAW", "EIN");
        Flight f3 = new Flight("WAW", "AMS");
        Flight f4 = new Flight("WAW", "PHX");
        Flight f5 = new Flight("WAW", "ABD");
        Flight f6 = new Flight("WAW", "WAW");

        System.out.println(findFlight(f1));
        System.out.println(findFlight(f2));
        System.out.println(findFlight(f3));
        System.out.println(findFlight(f4));
        System.out.println(findFlight(f5));
        System.out.println(findFlight(f6));
    }
}