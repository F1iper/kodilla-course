package com.kodilla.good.patterns.challenges.shop;

interface OrderService {

    boolean order(final User user, final Product product, final double price, final int amount);
}