package com.miqdadyyy.bridge;

public class Demo {
    public static void start(){
        Shape redCircle = new Circle(10, 2, 5, new RedCircle());
        redCircle.draw();

        Shape blueCircle = new Circle(22, 4, 10, new BlueCircle());
        blueCircle.draw();
    }
}
