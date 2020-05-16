package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequest {

    private final Producer producer;
    private final Product product;

    public OrderRequest(final Producer producer, final Product product) {
        this.producer = producer;
        this.product = product;
    }

    public Producer getProducer() {
        return producer;
    }

    public Product getProduct() {
        return product;
    }
}