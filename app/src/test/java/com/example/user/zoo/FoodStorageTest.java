package com.example.user.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 13/11/2016.
 */

public class FoodStorageTest {

    FoodStorage foodStorage;
    Food peanuts;
    Food grains;

    @Before
    public void before() {
        foodStorage = new FoodStorage();
        peanuts = new Food("Peanuts", 0.55, Diet.PEANUTS);
        grains = new Food("Grains", 0.42, Diet.GRAINS);
    }

    @Test
    public void testCanAddFood() {
        foodStorage.addFood(peanuts, 3);
        foodStorage.addFood(grains, 1);
        assertEquals(4, foodStorage.getTotalFood().size());
    }

    @Test
    public void canRemoveFood() {
        foodStorage.addFood(peanuts, 6);
        foodStorage.addFood(grains, 3);
        foodStorage.removeFood(peanuts,2);
        foodStorage.removeFood(grains,1);
        assertEquals(6, foodStorage.getTotalFood().size());
    }
}
