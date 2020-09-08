package com.miqdadyyy.factory;

public class Demo {
    public static void start() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("circle");
        Shape shape2 = shapeFactory.getShape("rectangle");
        Shape shape3 = shapeFactory.getShape("square");

        System.out.println("Result : ");
        System.out.println("Area of Shape 1 : " + shape1.calculateArea());
        System.out.println("Area of Shape 2 : " + shape2.calculateArea());
        System.out.println("Area of Shape 3 : " + shape3.calculateArea());
        System.out.println();
        System.out.println("Perimeter of Shape 1 : " + shape1.calculatePerimeter());
        System.out.println("Perimeter of Shape 2 : " + shape2.calculatePerimeter());
        System.out.println("Perimeter of Shape 3 : " + shape3.calculatePerimeter());
    }
}
