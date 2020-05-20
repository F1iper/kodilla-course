package com.kodilla.spring.intro;

import com.kodilla.spring.intro.shape.Shape;

public class Drawer {

    final Shape shape;

    public Drawer(final Shape shape) {
        this.shape = shape;
    }

    public String doDrawing() {
        return shape.draw();
    }
}