package com.kodilla.patterns.strategy.customers;

import com.kodilla.patterns.strategy.predictions.BalancedPredictor;

public class CorporateCustomer extends Customer {
    public CorporateCustomer(String name) {
        super(name);
        this.buyPredictor = new BalancedPredictor();
    }
}