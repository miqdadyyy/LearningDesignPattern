package com.miqdadyyy.factory;

public class Square implements Shape {
    public static final String NAME = "SQUARE";
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square(int side){
        this.side = (double) side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return this.side * this.side;
    }

    @Override
    public double calculatePerimeter() {
        return this.side * 4;
    }
}
