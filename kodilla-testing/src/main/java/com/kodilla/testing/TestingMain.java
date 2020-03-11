package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int addResult = calculator.add(10, 15);
        int subResult = calculator.subtract(100, 75);
        if(addResult == 25 && subResult == 25){
            System.out.println("calculator test OK");
        } else {
            System.out.println("calculator Error!");
        }

    }
}