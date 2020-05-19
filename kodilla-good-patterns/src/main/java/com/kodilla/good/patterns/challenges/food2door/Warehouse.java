package com.kodilla.good.patterns.challenges.food2door;

public class Warehouse {
    public boolean processOrder(OrderDto orderDto) {
        Shop shop = ShopFactory.getShop(orderDto.getShop());
        return shop.processOrder(orderDto);
    }
}
