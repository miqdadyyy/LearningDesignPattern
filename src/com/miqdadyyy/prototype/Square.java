package com.miqdadyyy.prototype;

public class Square extends Shape{

    public Square() {
        this.type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Drawing Square");
    }
}
