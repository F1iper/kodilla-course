package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Beginning of tests.");
    }

    @Before
    public void beforeEveryTest() {

        System.out.println("preparing test");
    }

    @After
    public void afterEveryTest() {
        System.out.println("Test done");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests done");
    }

    @Test
    public void testAddAndGetFigure() {
        //Given
        ShapeCollector underTest = new ShapeCollector();
        Shape figure = new Triangle("triangle", 2);

        //When
        underTest.addFigure(figure);
        Shape result = underTest.getFigure(0);

        //Then
        Assert.assertEquals(figure, result);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector underTest = new ShapeCollector();
        Shape figure = new Triangle("triangle", 0);

        //When
        underTest.addFigure(figure);
        boolean result = underTest.removeFigure(0);

        //Then
        Assert.assertTrue(result);
    }
}