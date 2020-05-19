package com.kodilla.good.patterns.challenges.food2door;

public class OrderDto {

    private String shop;
    private String product;

    public OrderDto(String shop, String product) {
        this.shop = shop;
        this.product = product;
    }

    public String getShop() {
        return shop;
    }

    public String getProduct() {
        return product;
    }
}