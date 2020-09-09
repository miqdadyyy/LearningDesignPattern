package com.miqdadyyy.builder;

public class Demo {
    public static void start() {
        MealBuilder mealBuilder = new MealBuilder();

        Meal mealVegan = mealBuilder.prepareVegMeal();
        mealVegan.showItems();

        Meal mealChicken = mealBuilder.prepareChickenMeal();
        mealChicken.showItems();
    }
}
