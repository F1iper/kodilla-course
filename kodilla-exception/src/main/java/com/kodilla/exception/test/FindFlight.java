
package com.kodilla.exception.test;

import java.util.HashMap;

public class FindFlight {

    HashMap<String, Boolean> findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> possibleFlights = new HashMap<>();
        possibleFlights.put("BER", false);
        possibleFlights.put("EIN", true);
        possibleFlights.put("AMS", true);
        possibleFlights.put("PHX", false);
        possibleFlights.put("ABD", true);
        possibleFlights.put("BJS", false);

        try {
            if (possibleFlights.get(flight.getArrivalAirport()))
                System.out.println("This flight is possible!");

            else
                throw new RouteNotFoundException("Route is not possible...");

        } catch (RouteNotFoundException e) {
            System.out.println("Route is not possible!");
        }
        return new HashMap<>(possibleFlights);
    }

    public static void main(String[] args) throws RouteNotFoundException {
        Flight f1 = new Flight("WAW", "BER");
        Flight f2 = new Flight("WAW", "EIN");
        Flight f3 = new Flight("WAW", "AMS");
        Flight f4 = new Flight("WAW", "PHX");
        Flight f5 = new Flight("WAW", "ABD");
        Flight f6 = new Flight("WAW", "BJS");

        FindFlight searchFlight = new FindFlight();

        System.out.println(searchFlight.findFlight(f1));
        System.out.println(searchFlight.findFlight(f2));
        System.out.println(searchFlight.findFlight(f4));
    }
}