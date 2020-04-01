package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> shapes = new ArrayList<>();


    public void addFigure(Shape shape) {
    shapes.add(0, getFigure(0));
    }

    public boolean removeFigure(int index) {
    return false;
    }

    public Shape getFigure(int n) {

        return null;
    }

    public void showFigures() {
    }

}
