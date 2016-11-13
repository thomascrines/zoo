package com.example.user.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 13/11/2016.
 */

public class FeedingAreaTest {

    Food peanuts;
    Food grains;
    FeedingArea feedingArea;

    @Before
    public void before() {
        peanuts = new Food(0.55, Diet.PEANUTS);
        grains = new Food(0.42, Diet.GRAINS);
        feedingArea = new FeedingArea();
    }

    @Test
    public void testCanGetAddFood() {
        feedingArea.addFood(grains);
        feedingArea.addFood(peanuts);
        assertEquals(2, feedingArea.getAllFoodInFeedingArea().size());
    }
}
