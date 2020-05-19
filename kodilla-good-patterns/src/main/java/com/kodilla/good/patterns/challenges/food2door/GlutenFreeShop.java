package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop implements Shop {
    @Override
    public boolean processOrder(OrderDto orderDto) {
        System.out.println("Ordering " + orderDto.getProduct());
        return false;

    }
}