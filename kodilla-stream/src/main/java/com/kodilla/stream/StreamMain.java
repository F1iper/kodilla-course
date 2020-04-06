package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.beautifier.PoemExecutor;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
//        Processor processor = new Processor();
//        processor.execute(() -> System.out.println("This is example text"));
//
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//        expressionExecutor.executeExpression(12, 10, (a, b) -> a + b);
//        expressionExecutor.executeExpression(11, 110, (a, b) -> a - b);
//        expressionExecutor.executeExpression(224, 54, (a, b) -> a * b);
//        expressionExecutor.executeExpression(3653, 356, (a, b) -> a / b);
//        expressionExecutor.executeExpression(63, 34, (a, b) -> a % b);
//
//        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(7,12, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(765, 12, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(674,531, FunctionalCalculator::divisionAByB);


        PoemBeautifier poemBeautifier = new PoemBeautifier();
        PoemExecutor poemExecutor = new PoemExecutor();

        poemBeautifier.beautify(poemExecutor, "th15 15 wRoNg 53nT3nC3");

    }
}