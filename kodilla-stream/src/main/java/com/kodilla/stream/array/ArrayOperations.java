package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
<<<<<<< HEAD
        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        double result = IntStream.range(0, numbers.length)
                .mapToDouble(n -> numbers[n])
=======
        double result = IntStream.range(0, numbers.length)
                .map(num -> {
                    System.out.println(num);
                    return num;
                })
>>>>>>> 2790f625dba4bbd9649e9db8daddc981b9567bbd
                .average()
                .getAsDouble();
        return result;
    }
}