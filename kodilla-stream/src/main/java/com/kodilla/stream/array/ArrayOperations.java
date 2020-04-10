package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        double result = IntStream.range(0, numbers.length)
                .map(num -> {
                    System.out.println(num);
                    return num;
                })
                .average()
                .getAsDouble();
        return result;
    }
}