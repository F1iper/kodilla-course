package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.informationServices.LetterService;

public class Application {

    public static void main(String[] args) {

    OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
    OrderRequest orderRequest = orderRequestRetriever.retrieve();

    OrderProcessor orderProcessor = new OrderProcessor(new LetterService(),
            new ProductOrderService(), new ProductOrderRepository(), new RegularClient());
    orderProcessor.process(orderRequest);
    // todo: check why not printing, check repository of product + add repository of producer.
    }
}