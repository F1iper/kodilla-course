package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequestRetriever {

    Shop shop1 = new Shop("ExtraFoodShop", "Polna 10", "extra@food.pl");
    Product product1 = new Product("Rice", 2, 2.99, 2000);


    public OrderRequest retrieve() {
        return new OrderRequest(shop1, product1);
    }
}