package com.kodilla.good.patterns.challenges.food2door;

public class OrderDto {

    public Producer producer;
    public boolean isOrdered;
    public boolean isRegular;

    public OrderDto(Producer producer, boolean isOrdered, boolean isRegular) {
        this.producer = producer;
        this.isOrdered = isOrdered;
        this.isRegular = isRegular;
    }

    public Producer getProducer() {
        return producer;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public boolean isRegular() {
        return isRegular;
    }
}