package com.miqdadyyy.bridge;

public class Circle extends Shape{

    private double radius;
    private int x;
    private int y;

    public Circle(double radius, int x, int y, DrawAPI drawAPI) {
        super(drawAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(this.radius, this.x, this.y);
    }
}
