package com.kodilla.stash.string.intro;

public class Dog implements Animal{

    @Override
    public String makeSound() {
        System.out.println("Woof woof");
        return "woof woof";
    }
}