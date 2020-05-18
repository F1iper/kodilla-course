package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {

    InfoService infoService;
    OrderService orderService;
    OrderRepository orderRepository;


    public OrderProcessor(InfoService infoService,
                          OrderService orderService,
                          OrderRepository orderRepository) {
        this.infoService = infoService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getShop(), orderRequest.getProduct());

        if (isOrdered) {
            infoService.inform(orderRequest.getShop());
            orderRepository.createOrder(orderRequest.getShop(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getShop(), true, false);
        } else {
            infoService.inform(orderRequest.getShop());
            orderRepository.createOrder(orderRequest.getShop(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getShop(), true, true);
        }
    }
}