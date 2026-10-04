package com.university.bridge.shape;

import com.university.bridge.renderer.Renderer;
import java.util.Objects;

public abstract class Shape {
    protected final Renderer renderer; // Композиция — мост к реализации

    protected Shape(Renderer renderer) {
        this.renderer = Objects.requireNonNull(renderer, "Renderer cannot be null");
    }

    public abstract void draw();
    public abstract void resize(double factor);
}