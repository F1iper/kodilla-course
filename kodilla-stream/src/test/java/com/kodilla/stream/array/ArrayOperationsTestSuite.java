package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite implements ArrayOperations {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {5, 4, 6, 12, 17, 21, 56, 23, 6, 9, 22, 31, 19};
        int[] numbers2 = {5, 6, 7, 8, 9, 11, 24, 56};

        //When
        double result = ArrayOperations.getAverage(numbers);
        double result2 = ArrayOperations.getAverage(numbers2);

        //Then
        Assert.assertEquals(17.7, result, 0.1);
        Assert.assertEquals(15.7, result2, 0.1);
    }
}