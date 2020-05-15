package com.kodilla.good.patterns.challenges.shop;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("John", "Kowalski");
        Product product1 = new Product("Coke");

        return new OrderRequest(user, product1, 2.99, 40);
    }
}