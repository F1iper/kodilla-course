package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShopOrderRepository implements OrderRepository{

    @Override
    public void createOrder(Shop shop, Product product) {
        System.out.println("Order by: " + shop.getName() + " created\nProduct: " + product.getName() +
                "amount: " + product.getAmount() + ", at price: " + product.getPrice());
    }
}