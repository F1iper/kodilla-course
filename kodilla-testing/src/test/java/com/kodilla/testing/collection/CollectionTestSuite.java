package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {

    static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beggining of tests.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing for test #" + testCounter);
    }

    @After
    public void afterEveryTest() {
        System.out.println("Test #" + testCounter + " finished.");
    }

    @AfterClass
    public static void afterEveryClass() {
        System.out.println("All tests finished.");
    }

    @Test
    public void testNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> expectedNumbers = new ArrayList<>();
        expectedNumbers.add(2);
        expectedNumbers.add(4);
        expectedNumbers.add(6);
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(expectedNumbers, result);
    }

    @Test
    public void testNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(emptyList);
        //Then
        Assert.assertEquals(result, emptyList);
    }
}
