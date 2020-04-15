package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        try {
            if (a == 0 || b == 0) {
                throw new ArithmeticException();
            }

        } catch (ArithmeticException e) {

            System.out.println("You can't divide by 0! Error: " + e);

        } finally {

            System.out.println("Always here");
        }
        return a / b;
    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}