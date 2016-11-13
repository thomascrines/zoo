package com.example.user.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 13/11/2016.
 */

public class FoodTest {

    Food peanuts;
    Food grains;

    @Before
    public void before() {
        peanuts = new Food(0.55, Diet.PEANUTS);
        grains = new Food(0.42, Diet.GRAINS);
    }

    @Test
    public void testCanGetCost() {
        assertEquals(.55, peanuts.getCost(), 0.1);
    }

    @Test
    public void testCanGetFoodType() {
        assertEquals(Diet.PEANUTS, peanuts.getFoodType());
    }
}


