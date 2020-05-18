package com.kodilla.good.patterns.challenges.food2door;

public class MailService implements InfoService {

    @Override
    public void inform(Shop shop) {
        System.out.println("\nConfirmation of purchase sent to: " + shop.getEmail());
    }
}