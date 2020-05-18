package com.kodilla.good.patterns.challenges.food2door;

public class Shop {

    private final String name;
    private final String address;
    private final String email;

    public Shop(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Shop name: " + getName() + ", address: " + getAddress() + ", email: |" + getEmail() + "|";
    }
}