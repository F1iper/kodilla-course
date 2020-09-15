package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class BoltNetworkOrderDecorator extends AbstractTaxiOrderDecorator {
    protected BoltNetworkOrderDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(20));
    }

    @Override
    public String getDescription() {
        return super.getDescription().concat(" because You worth IT!");
    }
}
