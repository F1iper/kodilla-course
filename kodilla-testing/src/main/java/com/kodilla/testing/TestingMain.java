package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Pierwszy test jednostkowy: ");

        Calculator calculator = new Calculator();
        if(calculator.add(2, 6) == 2 + 6){
            System.out.println("test add() OK");
        } else {
            System.out.println("Error!");
        }
        if(calculator.subtract(10, 2) == 10 -2){
            System.out.println("test subtract() OK");
        } else {
            System.out.println("Error!");
        }

    }
}