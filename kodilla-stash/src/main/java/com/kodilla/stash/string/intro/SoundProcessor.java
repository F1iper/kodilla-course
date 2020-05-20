package com.kodilla.stash.string.intro;

public class SoundProcessor {

    final Animal animal;

    public SoundProcessor (final Animal animal){
        this.animal = animal;
    }

    public String makeNoise(){
        return animal.makeSound();
    }
}