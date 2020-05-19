package com.kodilla.good.patterns.challenges.flights;

public class Flight {

    private final Destination departure;
    private final Destination arrival;

    public Flight(Destination departure, Destination arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public Destination getDeparture() {
        return departure;
    }

    public Destination getArrival() {
        return arrival;
    }

    @Override
    public String toString() {
        return "\nDeparture: |" + departure + "|, arrival: |" + arrival + "|";
    }
}