package com.kodilla.stash.string.intro;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class SoundProcessorTestSuite {

    @Test
    public void testMakeNoiseByCat() {
        //Given
        Cat cat = new Cat();

        //When
        SoundProcessor soundProcessor = new SoundProcessor(cat);
        String result = soundProcessor.makeNoise();

        //Then
        Assert.assertEquals("meow meow", result);
    }

    @Test
    public void testMakeNoiseByDog() {
        //Given
        Dog dog = new Dog();

        //When
        SoundProcessor soundProcessor = new SoundProcessor(dog);
        String result = soundProcessor.makeNoise();

        //Then
        Assert.assertEquals("woof woof", result);
    }
}
