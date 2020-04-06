package com.kodilla.stream.beautifier;

public class PoemExecutor implements PoemDecorator {

    @Override
    public void decorate(String str) {
        String result = str.toLowerCase().replace("1", "i").replace("5", "s")
                .replace("3", "e");
        System.out.println("Original: " + str);
        System.out.println("#1. *** " + result + " ***");
        System.out.println("#2. " + result.toUpperCase());
        String reverse = "";

        for(int i = result.length() -1 ; i >= 0; i--){
            reverse += result.charAt(i);
        }
        System.out.println("#3. *** " + reverse + " reversed ***");
    }
}