package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemExecutor;

public class StreamMain {

    public static void main(String[] args) {

        PoemExecutor poemExecutor = new PoemExecutor();
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("7H15 15 w31rD 53n73nC3 7hA7 n33D5 b3Au71Fy", poemExecutor );
    }
}
