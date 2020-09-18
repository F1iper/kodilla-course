package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class MentorTestSuite {

  @Test
  public void testUpdate() {
    //Given
    TasksToCheckToday tasksToCheckToday = new TasksToCheckToday();
    TasksToCheckYesterday tasksToCheckYesterday = new TasksToCheckYesterday();
    Mentor mentor1 = new Mentor("Mentor 1");
    Mentor mentor2 = new Mentor("Mentor 2");
    tasksToCheckToday.registerObserver(mentor1);
    tasksToCheckToday.registerObserver(mentor2);
    tasksToCheckYesterday.registerObserver(mentor1);

    //When
    tasksToCheckToday.addTask("Task 22.3");
    tasksToCheckToday.addTask("Task 11.2");
    tasksToCheckToday.addTask("Task 21.1");
    tasksToCheckYesterday.addTask("Task 32.1");
    tasksToCheckYesterday.addTask("Task 2.4");

    //Then
    assertEquals(5, mentor1.getUpdateCount());
    assertEquals(3, mentor2.getUpdateCount());
  }

  @Test
  public void testRemoveObserverAndUpdate() {
    //Given
    TasksToCheckToday tasksToCheckToday = new TasksToCheckToday();
    TasksToCheckYesterday tasksToCheckYesterday = new TasksToCheckYesterday();
    Mentor mentor1 = new Mentor("Mentor 1");
    Mentor mentor2 = new Mentor("Mentor 2");
    tasksToCheckToday.registerObserver(mentor1);
    tasksToCheckToday.registerObserver(mentor2);
    tasksToCheckYesterday.registerObserver(mentor1);

    //When
    tasksToCheckYesterday.removeObserver(mentor2);
    tasksToCheckToday.removeObserver(mentor2);
    tasksToCheckToday.addTask("Task 22.3");
    tasksToCheckToday.addTask("Task 11.2");
    tasksToCheckYesterday.addTask("Task 32.1");
    tasksToCheckYesterday.addTask("Task 2.4");


    //Then
    assertEquals(4, mentor1.getUpdateCount());
    assertEquals(0, mentor2.getUpdateCount());
  }

}