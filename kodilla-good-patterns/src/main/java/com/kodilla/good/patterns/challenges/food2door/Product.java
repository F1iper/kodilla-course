package com.kodilla.good.patterns.challenges.food2door;

public class Product {

    private final String name;
    private final double weight;
    private final double price;
    private final double amount;

    public Product(final String name, final double weight, final double price, final double amount) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public double getAmount() {
        return amount;
    }
}