package com.example.user.zoo;


/**
 * Created by user on 13/11/2016.
 */

public class Food {

    private String name;
    private double cost;
    private Diet foodType;

    public Food(String name, double cost, Diet foodType) {
        this.name = name;
        this.cost = cost;
        this.foodType = foodType;
    }

    public String getName() {
        return this.name;
    }

    public double getCost() {
        return this.cost;
    }

    public Diet getFoodType() {
        return this.foodType;
    }
}
