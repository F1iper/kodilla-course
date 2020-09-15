package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class FunghiPizzaOrderDecorator extends AbstractPizzaOrderDecorator {
    protected FunghiPizzaOrderDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(9));
    }

    @Override
    public String getDescription() {
        return super.getDescription().concat(" + mushrooms + onion");
    }
}
