package com.kodilla.good.patterns.challenges.food2door.informationServices;

import com.kodilla.good.patterns.challenges.food2door.Producer;

public class MailService implements InformationService {

    @Override
    public void inform(Producer producer) {
        System.out.println("Sending mail to: " + producer.getName() + " " + producer.getSurname()
         + ", at: " + producer.getEmail());
    }
}