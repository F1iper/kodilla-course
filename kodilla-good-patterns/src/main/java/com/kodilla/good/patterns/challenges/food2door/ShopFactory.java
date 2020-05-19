package com.kodilla.good.patterns.challenges.food2door;

public class ShopFactory {

    public static final String EXTRA_FOOD_SHOP = "ExtraFoodShop";
    public static final String HEALTHY_SHOP = "HealthyShop";
    public static final String GLUTEN_FREE_SHOP = "GlutenFreeShop";

    public static Shop getShop(String shop) {
        if (shop.equals(EXTRA_FOOD_SHOP)) return new ExtraFoodShop();
        if (shop.equals(HEALTHY_SHOP)) return new HealthyShop();
        if (shop.equals(GLUTEN_FREE_SHOP)) return new GlutenFreeShop();
        return null;
    }
}