package com.kodilla.good.patterns.challenges.food2door;

public class ProductOrderRepository implements OrderRepository {

    @Override
    public void createOrder(Producer producer, Product product) {
        System.out.println("Producer: " + producer.getName() + " " + producer.getSurname() + " sending: " + product.getName()
                + ", at price: " + product.getPrice() + ", packs: " + product.getPacks() + " " + product.getInPack()
                + " in each pack, the transport weights: " + product.getWeight() + " kg's. The expire date is: "
                + product.getExpireAt() + ", product id: " + product.getIdNumber());
    }
}