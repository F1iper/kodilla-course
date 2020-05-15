package com.kodilla.good.patterns.challenges.shop;

public class OrderDto {

    public boolean isOrdered;
    public User user;

    public OrderDto(User user, boolean isOrdered) {
        this.isOrdered = isOrdered;
        this.user = user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public User getUser() {
        return user;
    }
}