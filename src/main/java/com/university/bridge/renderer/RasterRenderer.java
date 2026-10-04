package com.university.bridge.renderer;

public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(double radius) {
        System.out.println(String.format("Drawing a circle of radius %.2f as pixels (raster).", radius));
    }

    @Override
    public void renderSquare(double side) {
        System.out.println(String.format("Drawing a square of side %.2f as pixels (raster).", side));
    }
}