package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {


    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int even : numbers) {
            if (even % 2 == 0 && even > 0) {
                evenNumbers.add(even);
            }
        }
        return evenNumbers;
    }
}