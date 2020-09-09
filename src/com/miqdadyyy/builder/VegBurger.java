package com.miqdadyyy.builder;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Vegetarian Burger";
    }

    @Override
    public double price() {
        return 3.0F;
    }
}
