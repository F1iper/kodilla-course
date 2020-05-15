package com.kodilla.good.patterns.challenges.carRent;

import java.time.LocalDateTime;

public class RentRequestRetriever {

    public RentRequest retrieve() {
        User user = new User("John", "Wick");

        LocalDateTime rentFrom = LocalDateTime.of(2020, 2,15,12,0);
        LocalDateTime rentTo = LocalDateTime.of(2020, 2,20,12,0);
        return new RentRequest(user, rentFrom, rentTo);
    }
}
