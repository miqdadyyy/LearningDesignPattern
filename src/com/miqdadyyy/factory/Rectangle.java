package com.miqdadyyy.factory;

public class Rectangle implements Shape {
    public static final String NAME = "RECTANGLE";
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height) {
        this.width = (double) width;
        this.height = (double) height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.height * this.width;
    }

    @Override
    public double calculatePerimeter() {
        return (this.height * 2) + (this.width * 2);
    }
}
