package com.example.user.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 15/11/2016.
 */

public class GrainsTest {

    Grains grains;

    @Before
    public void before() {
        grains = new Grains();
    }

    @Test
    public void testCanGetName() {
        assertEquals("Grains", grains.getName());
    }

    @Test
    public void testCanGetCost() {
        assertEquals(.15, grains.getCost(), 0.1);
    }

    @Test
    public void testCanGetFoodType() {
        assertEquals(Diet.GRAINS, grains.getFoodType());
    }

}
