package com.kodilla.testing.shape;

public class Square implements Shape {

    private String figureName;
    private double figureArea;

    public Square(String figureName, double figureArea) {
        this.figureName = figureName;
        this.figureArea = figureArea;
    }

    public String getFigureName() {
        return figureName;
    }

    public double getFigureArea() {
        return figureArea;
    }

    @Override
    public String getShapeName() {
        return "square";
    }

    @Override
    public double getField() {
        return 0;
    }
}
