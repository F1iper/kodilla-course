package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDate;

public class Product {

    private final String name;
    private final double inPack;
    private final int packs;
    private final double weight;
    private final String idNumber;
    private final LocalDate expireAt;
    private final double price;

    public Product(final String name, final double inPack, final int packs, final double weight,
                   final String idNumber, final LocalDate expireAt, final double price) {
        this.name = name;
        this.inPack = inPack;
        this.packs = packs;
        this.weight = weight;
        this.idNumber = idNumber;
        this.expireAt = expireAt;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getInPack() {
        return inPack;
    }

    public int getPacks() {
        return packs;
    }

    public double getWeight() {
        return weight;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public LocalDate getExpireAt() {
        return expireAt;
    }

    public double getPrice() {
        return price;
    }
}