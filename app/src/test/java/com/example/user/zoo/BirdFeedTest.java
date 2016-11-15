package com.example.user.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 15/11/2016.
 */

public class BirdFeedTest {

    BirdFeed birdFeed;

    @Before
    public void before() {
        birdFeed = new BirdFeed();
    }

    @Test
    public void testCanGetName() {
        assertEquals("Bird Feed", birdFeed.getName());
    }

    @Test
    public void testCanGetCost() {
        assertEquals(.15, birdFeed.getCost(), 0.1);
    }

    @Test
    public void testCanGetFoodType() {
        assertEquals(Diet.BIRD_FEED, birdFeed.getFoodType());
    }
}
