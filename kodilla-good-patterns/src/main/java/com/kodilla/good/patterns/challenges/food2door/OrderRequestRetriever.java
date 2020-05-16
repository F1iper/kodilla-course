package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDate;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        Producer johnDoe = new Producer("John", "Doe", "Disney Land",
                "disney@land.fr", "+33 400 500 600");
        Product p1 = new Product("orange", 20, 40000, 55000,"1234567" , LocalDate.now().plusDays(30), 4.50);

        return new OrderRequest(johnDoe, p1);
    }
}