package com.kodilla.good.patterns.challenges.shop;

public class ProductOrderRepository implements OrderRepository {

    @Override
    public void createOrder(User user, Product product, double price, int amount) {
        System.out.println("User " + user.getName() + " " + user.getSurname() + " ordered: " +
                product.getName() + " at price: " + price + ", " + amount + " pieces.");
    }
}