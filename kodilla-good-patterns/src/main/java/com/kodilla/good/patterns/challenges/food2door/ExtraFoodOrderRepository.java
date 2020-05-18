package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodOrderRepository implements OrderRepository{

    @Override
    public void createOrder(Shop shop, Product product) {
        System.out.println("\nOrder by: " + shop.getName() + " created.\nProduct: " + product.getName() +
                ", total: " + product.getAmount() * product.getPrice() + " PLN.");
    }
}