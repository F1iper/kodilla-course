package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(int n) {
        if (n <= shapes.size()) {
            shapes.remove(n);
            return true;
        } else {
            return false;
        }
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public void showFigures(List<Shape> shapes) {
        System.out.println(shapes);
    }
}