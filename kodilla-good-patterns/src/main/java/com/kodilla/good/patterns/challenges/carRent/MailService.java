package com.kodilla.good.patterns.challenges.carRent;

public class MailService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("Rent car to " + user.getName() + " " + user.getSurname());
    }
}
