package com.kodilla.good.patterns.challenges.shop;

interface OrderRepository {

    void createOrder(User user, Product product, double price, int amount);
}