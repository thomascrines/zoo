package com.example.user.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 15/11/2016.
 */

public class MeatTest {

    Meat meat;

    @Before
    public void before() {
        meat = new Meat();
    }

    @Test
    public void testCanGetName() {
        assertEquals("Meat", meat.getName());
    }

    @Test
    public void testCanGetCost() {
        assertEquals(2.35, meat.getCost(), 0.1);
    }

    @Test
    public void testCanGetFoodType() {
        assertEquals(Diet.MEAT, meat.getFoodType());
    }

}

