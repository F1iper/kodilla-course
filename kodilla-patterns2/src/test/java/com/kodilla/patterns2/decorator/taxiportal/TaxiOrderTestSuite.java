package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class TaxiOrderTestSuite {

    @Test
    public void testBasicTaxiOrderGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();

        //When
        BigDecimal calculatedCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(5), calculatedCost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();

        //When
        String theDescription = theOrder.getDescription();

        //Then
        assertEquals("Drive a course", theDescription);
    }

    @Test
    public void testTaxiNetworkGetCost() {
        //Given
        TaxiOrder theOrder = new TaxiNetworkOrderDecorator(new BasicTaxiOrder());

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(40), theCost);
    }

    @Test
    public void testTaxiNetworkGetDescription() {
        //Given
        TaxiOrder theOrder = new TaxiNetworkOrderDecorator(new BasicTaxiOrder());

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Drive a course by Taxi Network", description);
    }

    @Test
    public void testMyTaxiWithChildSeatGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(37), theCost);
    }

    @Test
    public void testMyTaxiWithChildSeatGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Drive a course by MyTaxi Network + child seat", description);
    }

    @Test
    public void testBoltNetworkOrderDecoratorGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new BoltNetworkOrderDecorator(theOrder);

        //When
        BigDecimal cost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(25), cost);
    }

    @Test
    public void testBoltNetworkOrderDecoratorGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new BoltNetworkOrderDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Drive a course because You worth IT!", description);
    }

    @Test
    public void testBoltNetworkOrderDecoratorGetCostWithChildSeat() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new BoltNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        //When
        BigDecimal cost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(29), cost);
    }

    @Test
    public void testBoltNetworkOrderDecoratorGetDescriptionWithChildSeat() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new BoltNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Drive a course because You worth IT! + child seat", description);
    }

    @Test
    public void testBoltNetworkOrderDecoratorGetDescriptionWith2ChildSeats() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new BoltNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Drive a course because You worth IT! + child seat + child seat", description);

    }

    @Test
    public void testBasicTaxiNetworkOrderGetCostWithVip() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new VipDecorator(theOrder);

        //When
        BigDecimal cost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(15), cost);
    }

    @Test
    public void testBasicTaxiNetworkOrderGetDescriptionWithVip() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new VipDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Drive a course + variant VIP + child seat", description);
    }
}