package com.university.bridge.shape;

import com.university.bridge.renderer.Renderer;

public class Circle extends Shape {
    private double radius;

    public Circle(Renderer renderer, double radius) {
        super(renderer);
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        this.radius = radius;
    }

    @Override
    public void draw() {
        renderer.renderCircle(radius);
    }

    @Override
    public void resize(double factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("Resize factor must be positive");
        }
        this.radius *= factor;
    }
}