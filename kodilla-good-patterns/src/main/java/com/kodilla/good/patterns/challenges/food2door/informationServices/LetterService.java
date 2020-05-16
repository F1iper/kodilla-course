package com.kodilla.good.patterns.challenges.food2door.informationServices;

import com.kodilla.good.patterns.challenges.food2door.Producer;

public class LetterService implements InformationService {

    @Override
    public void inform(Producer producer) {
        System.out.println("Sending invoice to: " + producer.getName() + " " + producer.getSurname()
                + ", at address; " + producer.getAddress());
    }
}