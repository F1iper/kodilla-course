package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop implements OrderService {


    @Override
    public boolean order(Shop shop, Product product) {
        System.out.println("Order by: " + shop.getName() + "product name: " + product.getName() +
                ", amount: " + product.getAmount() + ", at price: " + product.getPrice() +
                "\nTransport will weight: " + (product.getAmount() * product.getWeight() + " kg's"));
        if (product.getAmount() >= 1000) {
            System.out.println("This is regular customer, discount 10% provided.");
            return true;
        } else {
            System.out.println("Transport will need more trucks!");
            return true;
        }
    }
}