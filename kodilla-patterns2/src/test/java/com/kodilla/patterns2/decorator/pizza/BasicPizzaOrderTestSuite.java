package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BasicPizzaOrderTestSuite {

    @Test
    void testBasicPizzaGetCost() {
        //Given
        Pizza thePizza = new BasicPizzaOrder();

        //When
        BigDecimal cost = thePizza.getCost();

        //Then
        assertEquals(new BigDecimal(15), cost);
    }

    @Test
    void testBasicPizzaGetDescription() {
        //Given
        Pizza thePizza = new BasicPizzaOrder();

        //When
        String description = thePizza.getDescription();

        //Then
        assertEquals("Prepairing basic pizza with cheese and tomato sauce", description);
    }

    @Test
    public void testHawaiiPizzaOrderGetCost() {
        //Given
        Pizza pizza = new BasicPizzaOrder();
        pizza = new HawaiiPizzaOrderDecorator(pizza);

        //When
        BigDecimal cost = pizza.getCost();

        //Then
        assertEquals(new BigDecimal(20), cost);
    }

    @Test
    public void testHawaiiPizzaOrderGetDescription() {
        //Given
        Pizza pizza = new BasicPizzaOrder();
        pizza = new HawaiiPizzaOrderDecorator(pizza);

        //When
        String description = pizza.getDescription();

        //Then
        assertEquals("Prepairing basic pizza with cheese and tomato sauce + ham + ananas", description);
    }

    @Test
    public void testHawaiiPizzaOrderWithAdditionalSalamiGetCost() {
        //Given
        Pizza pizza = new BasicPizzaOrder();
        pizza = new HawaiiPizzaOrderDecorator(pizza);
        pizza = new SalamiDecorator(pizza);

        //When
        BigDecimal cost = pizza.getCost();

        //Then
        assertEquals(new BigDecimal(27), cost);
    }
    @Test
    public void testHawaiiPizzaOrderWithAdditionalSalamiGetDescription() {
        //Given
        Pizza pizza = new BasicPizzaOrder();
        pizza = new HawaiiPizzaOrderDecorator(pizza);
        pizza = new SalamiDecorator(pizza);

        //When
        String description = pizza.getDescription();

        //Then
        assertEquals("Prepairing basic pizza with cheese and tomato sauce + ham + ananas + salami", description);
    }

    @Test
    public void testFunghiPizzaOrderGetCost() {
        //Given
        Pizza pizza = new BasicPizzaOrder();
        pizza = new FunghiPizzaOrderDecorator(pizza);

        //When
        BigDecimal cost = pizza.getCost();

        //Then
        assertEquals(new BigDecimal(24), cost);
    }

    @Test
    public void testFunghiPizzaOrderGetDescription() {
        //Given
        Pizza pizza = new BasicPizzaOrder();
        pizza = new FunghiPizzaOrderDecorator(pizza);

        //When
        String description = pizza.getDescription();

        //Then
        assertEquals("Prepairing basic pizza with cheese and tomato sauce + mushrooms + onion", description);
    }

    @Test
    public void testBasicPizzaOrderWithDoubleCheeseAndOnionGetCost() {
        //Given
        Pizza pizza = new BasicPizzaOrder();
        pizza = new CheeseDecorator(pizza);
        pizza = new OnionDecorator(pizza);

        //When
        BigDecimal cost = pizza.getCost();

        //Then
        assertEquals(new BigDecimal(22), cost);
    }

    @Test
    public void testBasicPizzaOrderWithDoubleCheeseAndOnionGetDescription(){
        //Given
        Pizza pizza = new BasicPizzaOrder();
        pizza = new CheeseDecorator(pizza);
        pizza = new OnionDecorator(pizza);

        //When
        String description = pizza.getDescription();

        //Then
        assertEquals("Prepairing basic pizza with cheese and tomato sauce + extra cheese + onion", description);
    }
}