package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public String beautify(String str, PoemDecorator poemDecorator) {
        return poemDecorator.decorate(str);
    }
}