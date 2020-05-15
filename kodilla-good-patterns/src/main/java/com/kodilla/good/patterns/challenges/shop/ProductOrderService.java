package com.kodilla.good.patterns.challenges.shop;

public class ProductOrderService implements OrderService {
    @Override
    public boolean order(User user, Product product, double price, int amount) {
        System.out.println("User: " + user.getName() + " " + user.getSurname() +
                " ordered: " + product.getName() + ", price per 1: " + price + " amount: " + amount);
        return true;
    }
}