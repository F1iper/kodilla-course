package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.FacebookPublisher;
import com.kodilla.patterns.strategy.social.users.Millenials;
import com.kodilla.patterns.strategy.social.users.User;
import com.kodilla.patterns.strategy.social.users.YGeneration;
import com.kodilla.patterns.strategy.social.users.ZGeneration;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John Wick");
        User steven = new YGeneration("Steven Gerard");
        User jacob = new ZGeneration("Jacob Weiss");

        //When
        String johnShares = john.sharePost();
        String stevenShares = steven.sharePost();
        String jacobShares = jacob.sharePost();
        System.out.println("John is sharing news via: " + johnShares);
        System.out.println("Steven is sharing news via: " + stevenShares);
        System.out.println("Jacob is sharing news via: " + jacobShares);

        //Then
        Assert.assertEquals("[Snapchat]", johnShares);
        Assert.assertEquals("[Facebook]", stevenShares);
        Assert.assertEquals("[Twitter]", jacobShares);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User john = new Millenials("John Wick");

        //When
        String johnShares = john.sharePost();
        System.out.println("John shares news via: " + johnShares);
        john.setPlatform(new FacebookPublisher());
        johnShares = john.sharePost();
        System.out.println("John changed platform to: " + johnShares);

        //Then
        Assert.assertEquals("[Facebook]", johnShares);
    }
}