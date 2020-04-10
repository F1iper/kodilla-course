package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayOperationTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(9.5, average, 0.01);
    }
}