package com.kodilla.stream.beautifier;

public class PoemExecutor implements PoemDecorator {

    @Override
    public void decorate(String str) {
        String upgrade = str. toLowerCase().replace("1", "i")
                .replace("5", "s")
                .replace("7", "t")
                .replace("3", "e");
        System.out.println(upgrade);
        System.out.println(upgrade.toUpperCase());
        System.out.println("*** " + upgrade + " ***");
    }
}
