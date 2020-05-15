package com.kodilla.good.patterns.challenges.shop;

public class OrderRequest {
    private final User user;
    private final Product product;
    private final double price;
    private final int amount;

    public OrderRequest(final User user, final Product product, final double price, final int amount) {
        this.user = user;
        this.product = product;
        this.price = price;
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }
}