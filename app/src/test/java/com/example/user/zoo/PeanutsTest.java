package com.example.user.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 15/11/2016.
 */

public class PeanutsTest {

    Peanuts peanuts;

    @Before
    public void before() {
        peanuts = new Peanuts();
    }

    @Test
    public void testCanGetName() {
        assertEquals("Peanuts", peanuts.getName());
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
