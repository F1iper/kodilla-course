package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String str, PoemDecorator poemDecorator){
        poemDecorator.decorate(str);
        
    }
}
