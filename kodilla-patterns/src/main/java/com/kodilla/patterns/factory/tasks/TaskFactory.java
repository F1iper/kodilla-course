package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING_TASK = "SHOPPING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("Do the shopping", "oranges", 5.0);
            case PAINTING_TASK:
                return new PaintingTask("Paint some", "metallic", "everything");
            case DRIVING_TASK:
                return new DrivingTask("From A to B", "New York", "Shelby GT500");
            default:
                return null;
        }
    }
}