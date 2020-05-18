package com.kodilla.good.patterns.challenges.food2door;

public interface OrderRepository {

    void createOrder(Shop shop, Product product);
}