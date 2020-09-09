package com.miqdadyyy.builder;

import java.util.ArrayList;
import java.util.Iterator;

public class Meal {
    private String name;
    private ArrayList<Item> items;

    public Meal(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public float getCost() {
        float total = 0F;
        for (Item item : this.items) {
            total += item.price();
        }

        return total;
    }

    public void showItems() {
        System.out.printf("Items on %s : \n", this.name);
        for (Item item : this.items) {
            System.out.printf("- %s ($%f) Packing with %s \n", item.name(), item.price(), item.packing().pack());
        }
        System.out.printf("Total Price : $%f\n", this.getCost());
        System.out.println("=================================");
    }
}
