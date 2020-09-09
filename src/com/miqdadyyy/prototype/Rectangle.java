package com.miqdadyyy.prototype;

public class Rectangle extends Shape{

    public Rectangle() {
        this.type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}
