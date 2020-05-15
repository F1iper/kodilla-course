package com.kodilla.good.patterns.challenges.carRent;

public class RentalDto {
    public boolean isRented;
    public User user;

    public RentalDto(final User user, final boolean isRented) {
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