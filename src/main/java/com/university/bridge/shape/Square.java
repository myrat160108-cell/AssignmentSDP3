package com.university.bridge.shape;

import com.university.bridge.renderer.Renderer;

public class Square extends Shape {
    private double side;

    public Square(Renderer renderer, double side) {
        super(renderer);
        if (side <= 0) {
            throw new IllegalArgumentException("Side length must be positive");
        }
        this.side = side;
    }

    @Override
    public void draw() {
        renderer.renderSquare(side);
    }

    @Override
    public void resize(double factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("Resize factor must be positive");
        }
        this.side *= factor;
    }
}