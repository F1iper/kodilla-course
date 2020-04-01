package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String figureName;
    private double figureArea;

    public Triangle(String figureName, double figureArea) {
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
        return null;
    }

    @Override
    public double getField() {
        return 0;
    }
}
