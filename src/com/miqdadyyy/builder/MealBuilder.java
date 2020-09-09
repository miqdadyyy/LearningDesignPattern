package com.miqdadyyy.builder;

public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal = new Meal("Vegetarian Meal");
        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());

        return meal;
    }

    public Meal prepareChickenMeal(){
        Meal meal = new Meal("Chicken Meal");
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());

        return meal;
    }
}
