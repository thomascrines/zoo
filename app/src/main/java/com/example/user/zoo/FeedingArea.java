package com.example.user.zoo;

import java.util.ArrayList;

/**
 * Created by user on 13/11/2016.
 */

public class FeedingArea {

    private ArrayList<Food> feedingArea;

    public FeedingArea() {

        this.feedingArea = new ArrayList<>();
    }

    public ArrayList<Food> getFeedingAreaContents() {
        return this.feedingArea;
    }

    public void addFood(Food food) {
        feedingArea.add(food);
    }

    public double getTotalCostOfFeedingArea() {
        double total_cost = 0;
        for (Food food : this.feedingArea)  {
        total_cost += (food.getCost());
        }
        return total_cost;
    }
}
