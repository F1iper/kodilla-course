package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
//
//    @Test
//    public void testGetPeopleQuantity() {
//        //Given
//        Country germany = new Country("Germany", new BigDecimal("87264"));
//        Country kenia = new Country("Kenia", new BigDecimal("516535"));
//        Country china = new Country("China", new BigDecimal( "535135"));
//
//        Continent europe = new Continent("Europe");
//        Continent asia = new Continent("Asia");
//        Continent africa = new Continent("Africa");
//
//        europe.addCountry(germany);
//        asia.addCountry(china);
//        africa.addCountry(kenia);
//
//        World world = new World();
//
//        world.addContinent(europe);
//        world.addContinent(africa);
//        world.addContinent(asia);
//
//        //When
//        BigDecimal totalPeople = world.getPeopleQuantity();
//
//        //Then
//        BigDecimal expectedPeopleNumber = new BigDecimal("1138934");
//        Assert.assertEquals(expectedPeopleNumber, totalPeople);
//
//    }

    @Test
    public void testGetPeopleQuantityWithReduce() {
        //Given
        Country germany = new Country("Germany", new BigDecimal("80654345"));
        Country spain = new Country("Spain", new BigDecimal("4597894"));
        Country portugal = new Country("Portugal", new BigDecimal("5135136"));

        Country kenia = new Country("Kenia", new BigDecimal("5135136513"));
        Country nigeria = new Country("Nigeria", new BigDecimal("75819351"));
        Country ghana = new Country("Ghana", new BigDecimal("173850919"));

        Country iran = new Country("Iran", new BigDecimal("647134"));
        Country irak = new Country("Irak", new BigDecimal("5781903"));
        Country japan = new Country("Japan", new BigDecimal("12513905"));

        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");
        Continent asia = new Continent("Asia");

        europe.addCountry(germany);
        europe.addCountry(spain);
        europe.addCountry(portugal);
        africa.addCountry(kenia);
        africa.addCountry(nigeria);
        africa.addCountry(ghana);
        asia.addCountry(iran);
        asia.addCountry(irak);
        asia.addCountry(japan);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(asia);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleNumber = new BigDecimal("5494137100");
        Assert.assertEquals(expectedPeopleNumber, totalPeople);

    }
}