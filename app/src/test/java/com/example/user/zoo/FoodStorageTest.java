package com.example.user.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 13/11/2016.
 */

public class FoodStorageTest {

    FoodStorage foodStorage;
    Peanuts peanuts;
    Grains grains;

    @Before
    public void before() {
        foodStorage = new FoodStorage();
        peanuts = new Peanuts();
        grains = new Grains();
    }

    @Test
    public void testCanAddFood() {
        foodStorage.addFood(peanuts, 3);
        foodStorage.addFood(grains, 1);
        assertEquals(4, foodStorage.getTotalFood().size());
    }

    @Test
    public void testCanRemoveFood() {
        foodStorage.addFood(peanuts, 3);
        foodStorage.addFood(grains, 1);
        foodStorage.removeFood(peanuts);
        assertEquals(3, foodStorage.getTotalFood().size());
    }

    @Test
    public void canRemoveFood() {
        foodStorage.addFood(peanuts, 6);
        foodStorage.addFood(grains, 3);
        foodStorage.removeMultipleFood(peanuts,2);
        foodStorage.removeMultipleFood(grains,1);
        assertEquals(6, foodStorage.getTotalFood().size());
    }
}
