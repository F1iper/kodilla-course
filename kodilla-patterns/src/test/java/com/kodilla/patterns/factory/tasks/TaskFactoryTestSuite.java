package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shopping = factory.createTask(TaskFactory.SHOPPING_TASK);

        //Then
        Assert.assertEquals("Do the shopping", shopping.getTaskName());
        Assert.assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.createTask(TaskFactory.PAINTING_TASK);

        //Then
        Assert.assertEquals("Paint some", painting.getTaskName());
        Assert.assertFalse(painting.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.createTask(TaskFactory.DRIVING_TASK);

        //Then
        Assert.assertEquals("From A to B", driving.getTaskName());
        Assert.assertTrue(driving.isTaskExecuted());
    }
}