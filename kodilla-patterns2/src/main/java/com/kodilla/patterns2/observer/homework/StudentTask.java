package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class StudentTask implements Observable {
    private final List<Observer> observers;
    private final String name;
    private final Deque<String> tasks;

    public StudentTask(String name) {
        observers = new ArrayList<>();
        tasks = new ArrayDeque<>();
        this.name = name;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    public String getName() {
        return name;
    }

    public Deque<String> getTasks() {
        return tasks;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
