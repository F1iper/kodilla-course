package com.kodilla.patterns.strategy.customers;

import com.kodilla.patterns.strategy.predictions.AggressivePredictor;

public class IndividualYoungCustomer extends Customer {
    public IndividualYoungCustomer(String name) {
        super(name);
        this.buyPredictor = new AggressivePredictor();
    }
}