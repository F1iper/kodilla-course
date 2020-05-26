package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;
    @Test
    public void testCalculations() {
        //Given
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
//        Calculator calculator = (Calculator) context.getBean(Calculator.class);

        //When
        double addResult = calculator.add(10, 10);
        double subResult = calculator.sub( 10, 9);
        double mulResult = calculator.mul( 9,10);
        double divResult = calculator.div(80, 20);

        //Then
        Assert.assertEquals(20, addResult, 0.01);
        Assert.assertEquals(1, subResult, 0.01);
        Assert.assertEquals(90, mulResult, 0.01);
        Assert.assertEquals(4, divResult, 0.01);
    }
}