package com.kodilla.good.patterns.challenges.food2door;

import java.util.Random;

public class HealthyShop implements Shop {
    @Override
    public boolean processOrder(OrderDto orderDto) {
        Random random = new Random();
        boolean result = random.nextBoolean();
        System.out.println("Ordering " + orderDto.getProduct() + ": " + result);
        return result;
    }
}
