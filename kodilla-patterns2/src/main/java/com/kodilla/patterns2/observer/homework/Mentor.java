package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
  private final String name;
  private int updateCount;

  public Mentor(String name) {
    this.name = name;
  }

  @Override
  public void update(StudentTask studentTask) {
    System.out.println(name + ": New task in queue: " + studentTask.getName() + "\n" +
            " (total: " + studentTask.getTasks().size() + " tasks)");
    updateCount++;
  }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
