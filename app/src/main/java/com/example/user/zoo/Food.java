package com.example.user.zoo;


/**
 * Created by user on 13/11/2016.
 */

public class Food {

    private double cost;
    private Diet foodType;

    public Food(double cost, Diet foodType) {
        this.cost = cost;
        this.foodType = foodType;
    }

    public double getCost() {
        return this.cost;
    }

    public Diet getFoodType() {
        return this.foodType;
    }
}
