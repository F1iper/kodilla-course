package com.kodilla.good.patterns.challenges.food2door;

public class ProductOrderService implements OrderService {

    @Override
    public boolean order(Producer producer, Product product) {
        System.out.println("Producer: " + producer.getName() + " " + producer.getSurname() + " sending: " + product.getName()
        + ", at price: " + product.getPrice() + ", packs: " + product.getPacks() + " in each pack: " + product.getInPack()
                + ", the transport weights: " + product.getWeight() + " kg's. The expire date is: "
                + product.getExpireAt() + ", product id: " + product.getIdNumber());
        return true;

    }
}