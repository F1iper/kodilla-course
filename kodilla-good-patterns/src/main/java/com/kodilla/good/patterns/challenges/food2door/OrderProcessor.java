package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.informationServices.InformationService;


public class OrderProcessor {

    private final InformationService informationService;
    private final OrderService orderService;
    private final OrderRepository orderRepository;
    private final ClientDatabase clientDatabase;

    public OrderProcessor(InformationService informationService,
                          OrderService orderService,
                          OrderRepository orderRepository,
                          ClientDatabase clientDatabase) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
        this.clientDatabase = clientDatabase;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getProducer(), orderRequest.getProduct());
        boolean isRegular = clientDatabase.isRegular(orderRequest.getProducer());

        if (isOrdered && !isRegular) {
            informationService.inform(orderRequest.getProducer());
            orderRepository.createOrder(orderRequest.getProducer(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getProducer(), true, false);
        } else if(isOrdered && isRegular){
            //todo : check conditions, and dependency -> OrderDto, orderRequest, returns OrderDto..
            return new OrderDto(orderRequest.getProducer(), true, true);
        } else {
            return new OrderDto(orderRequest.getProducer(), false, false);
        }
    }
}