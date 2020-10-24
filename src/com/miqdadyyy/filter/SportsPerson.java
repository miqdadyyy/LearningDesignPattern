package com.miqdadyyy.filter;

/**
 * This class will represent various renowned Sportsperson
 * across the globe alongwith their country details.
 * */
public class SportsPerson {
    private String name;
    private String country;
    private String sport;

    public SportsPerson(String name, String country, String sport){
        this.name = name;
        this.country = country;
        this.sport = sport;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getSport() {
        return sport;
    }

}


