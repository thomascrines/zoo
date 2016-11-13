package com.example.user.zoo;

import java.util.ArrayList;

/**
 * Created by user on 13/11/2016.
 */

public class FeedingArea {

    private ArrayList<Food> feedingArea;

    public FeedingArea() {

        this.feedingArea = new ArrayList<Food>();
    }

    public ArrayList<Food> getAllFoodInFeedingArea() {
        return this.feedingArea;
    }

    public void addFood(Food food) {
        feedingArea.add(food);
    }
}
