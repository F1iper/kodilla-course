package com.kodilla.good.patterns.challenges.food2door.informationServices;

import com.kodilla.good.patterns.challenges.food2door.Producer;

public class SmsService implements InformationService {

    @Override
    public void inform(Producer producer) {
        System.out.println("Sending SMS to: " + producer.getName() + " " + producer.getSurname()
                + ", number: " + producer.getPhone());
    }
}