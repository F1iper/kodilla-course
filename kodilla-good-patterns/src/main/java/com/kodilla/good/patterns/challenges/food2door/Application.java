package com.kodilla.good.patterns.challenges.food2door;

public class Application {

    public static void main(String[] args) {
        OrderDto orderDto = new OrderDto(ShopFactory.HEALTHY_SHOP, "milk");
        Warehouse warehouse = new Warehouse();
        System.out.println(warehouse.processOrder(orderDto));

    }
}