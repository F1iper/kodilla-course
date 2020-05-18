package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements OrderService {

    @Override
    public boolean order(Shop shop, Product product) {
        System.out.println("Order by: " + shop.getName() + ", product name: " + product.getName() +
                ", amount: " + product.getAmount() + ", at price: " + product.getPrice() +
                "PLN. \nWeight of transport: " + (product.getAmount() * product.getWeight() + " kg's"));
        return true;
    }
}