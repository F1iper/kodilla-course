package com.kodilla.patterns.strategy.customers;

import com.kodilla.patterns.strategy.predictions.BuyPredictor;

public class Customer {
    final private String name;
    protected BuyPredictor buyPredictor;

    public Customer(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String predict() {
        return buyPredictor.predictWhatToBuy();
    }

    public void setBuyStrategy(BuyPredictor buyPredictor) {
        this.buyPredictor = buyPredictor;
    }
}