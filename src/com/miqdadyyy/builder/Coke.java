package com.miqdadyyy.builder;

public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "Coca Cola";
    }

    @Override
    public double price() {
        return 1.3F;
    }
}
