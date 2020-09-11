package com.miqdadyyy.bridge;

public class BlueCircle implements DrawAPI{
    @Override
    public void drawCircle(double radius, int x, int y) {
        System.out.printf("Drawing circle with radius %.2f on x: %d and y: %d with color BLUE\n", radius, x, y);
    }
}
