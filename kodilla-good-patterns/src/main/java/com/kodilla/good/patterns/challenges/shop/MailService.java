package com.kodilla.good.patterns.challenges.shop;

public class MailService implements InformationService {
    public void inform(User user) {
        System.out.println("Order accepted, sending to: " + user.getName() + " " + user.getSurname());
    }
}