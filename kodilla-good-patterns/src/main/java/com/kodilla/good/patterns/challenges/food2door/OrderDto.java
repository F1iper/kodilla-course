package com.kodilla.good.patterns.challenges.food2door;

public class OrderDto {

    public boolean isOrdered;
    public Shop shop;
    public boolean isGoodClient;

    public OrderDto(Shop shop, boolean isOrdered, boolean isGoodClient) {
        this.isOrdered = isOrdered;
        this.shop = shop;
        this.isGoodClient = isGoodClient;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public Shop getUser() {
        return shop;
    }

    public boolean isGoodClient() {
        return isGoodClient;
    }
}