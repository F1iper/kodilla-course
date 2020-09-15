package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SalamiDecorator extends AbstractPizzaOrderDecorator {
    protected SalamiDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(7));
    }

    @Override
    public String getDescription() {
        return super.getDescription().concat(" + salami");
    }
}
