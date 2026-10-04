package com.university.bridge;

import com.university.bridge.renderer.RasterRenderer;
import com.university.bridge.renderer.Renderer;
import com.university.bridge.renderer.VectorRenderer;
import com.university.bridge.shape.Circle;
import com.university.bridge.shape.Shape;
import com.university.bridge.shape.Square;

public class Main {
    public static void main(String[] args) {

        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle = new Circle(vectorRenderer, 5.0);
        System.out.print("Circle with Vector Renderer: ");
        circle.draw();

        Shape rasterCircle = new Circle(rasterRenderer, 5.0);
        System.out.print("Circle with Raster Renderer: ");
        rasterCircle.draw();

        Shape square = new Square(vectorRenderer, 10.0);
        System.out.print("Square with Vector Renderer: ");
        square.draw();

        square.resize(1.5);
        System.out.print("Resized Square with Vector Renderer: ");
        square.draw();
    }
}