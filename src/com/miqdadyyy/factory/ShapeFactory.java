package com.miqdadyyy.factory;

public class ShapeFactory {
    public static final double SCALE = 100;

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        } else if (shapeType.equalsIgnoreCase(Circle.NAME)) {
            return new Circle(generateRandomNumber());
        } else if (shapeType.equalsIgnoreCase(Rectangle.NAME)) {
            return new Rectangle(generateRandomNumber(), generateRandomNumber());
        } else if (shapeType.equalsIgnoreCase(Square.NAME)) {
            return new Square(generateRandomNumber());
        } else {
            return null;
        }
    }

    private double generateRandomNumber() {
        return Math.random() * SCALE;
    }
}
