package com.miqdadyyy.singleton;

public class Coffee {
    public static final int MAX_PERCENTAGE = 100;
    private int currentPercentage;
    private int timesOfRefill;

    private static final Coffee instance = new Coffee();

    public Coffee() {
        this.currentPercentage = (int) (Math.random() * 100);
        this.timesOfRefill = 0;
    }

    public void drink() {
        this.currentPercentage -= (int) (Math.random() * this.currentPercentage);
    }

    public void refill() {
        this.currentPercentage = MAX_PERCENTAGE;
        this.timesOfRefill++;
        System.out.println("Coffee Refilled");
    }

    public void showStatus(){
        System.out.printf("Precentage of the coffee is : %d \n", this.currentPercentage);
        System.out.printf("This coffee already %d times fileed \n", this.timesOfRefill);
        System.out.println();
    }

    public static Coffee getInstance(){
        return instance;
    }
}
