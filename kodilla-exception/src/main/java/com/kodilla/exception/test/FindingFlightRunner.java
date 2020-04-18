package com.kodilla.exception.test;

import static com.kodilla.exception.test.FindFlight.search;

public class FindingFlightRunner {
    public static void main(String[] args) {

        try {
            search();

        } catch (RouteNotFoundException e) {
            System.out.println("Route is not possible!");

        }
    }
}