package com.kodilla.good.patterns.challenges.carRent;

public class RentalDto {
    public boolean isRented;
    public User user;

    public RentalDto(User user, boolean isRented) {
        this.user = user;
        this.isRented = isRented;
    }

    public boolean isRented() {
        return isRented;
    }

    public User getUser() {
        return user;
    }
}