package com.kodilla.testing.shape;

public class Circle implements Shape {

    private String figureName;
    private double figureArea;

    public Circle(String figureName, double figureArea) {
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
        return "circle";
    }

    @Override
    public double getField() {
        return 0;
    }
}
