package com.miqdadyyy.singleton;

public class Demo {
    public static void start() {
        Coffee coffee = Coffee.getInstance();
        coffee.drink();
        coffee.showStatus();
        coffee.refill();
        coffee.drink();
        coffee.showStatus();
        coffee.drink();
        coffee.showStatus();
    }
}
