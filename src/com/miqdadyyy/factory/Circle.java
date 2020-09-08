package com.miqdadyyy.factory;

public class Circle implements Shape{
    public static final String NAME = "CIRCLE";

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(int radius){
        this.radius = (double) radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
