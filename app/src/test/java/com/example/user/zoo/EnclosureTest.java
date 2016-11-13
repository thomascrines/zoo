package com.example.user.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 13/11/2016.
 */

public class EnclosureTest {

    Enclosure enclosure;
    Population population;
    FeedingArea feedingArea;
    Food peanuts;
    Elephant elephant;

    @Before
    public void before() {
        elephant = new Elephant("Dumbo", 1);
        peanuts = new Food("Peanuts", 0.55, Diet.PEANUTS);
        feedingArea = new FeedingArea();
        population = new Population();
        enclosure = new Enclosure("Elephant Enclosure", Habitat.GRASSLAND, population, feedingArea);
    }

    @Test
    public void testCanGetEnclosureName() {
        assertEquals("Elephant Enclosure", enclosure.getName());
    }

    @Test
    public void testCanGetHabitatType() {
        assertEquals(Habitat.GRASSLAND, enclosure.getHabitat());
    }

    @Test
    public void testCanGetPopulation() {
        assertEquals(population, enclosure.getPopulation());
    }

    @Test
    public void testCanGetFeedingArea() {
        assertEquals(feedingArea, enclosure.getFeedingArea());
    }
}
