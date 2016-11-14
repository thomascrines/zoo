package com.example.user.zoo;

import java.util.ArrayList;

/**
 * Created by user on 13/11/2016.
 */

public class FoodStorage {

    public ArrayList<Food> totalFood;

    public FoodStorage() {

        this.totalFood = new ArrayList<>();
    }

    public ArrayList<Food> getTotalFood() {
        return totalFood;
    }

    public void addFood(Food food, int quantity) {
        for (int i = 0; i < quantity; i++) {
            totalFood.add(food);
        }
    }

    public void removeFood(Food food) {
        totalFood.remove(food);
    }

    public void removeMultipleFood(Food food, int quantity) {
        for (int i = 0; i < quantity; i++) {
            totalFood.remove(food);
        }
    }
}