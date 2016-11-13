package com.example.user.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 12/11/2016.
 */

public class ZooTest {
    Zoo zoo;
    Enclosure enclosure1;
    Enclosure enclosure2;
    Population population1;
    Population population2;
    Elephant elephant;
    Tiger tiger;

    @Before
    public void before() {
        zoo = new Zoo("Edinburgh Zoo", 4000);
        enclosure1 = new Enclosure("Elephant Enclosure", Habitat.GRASSLAND, population1);
        enclosure2 = new Enclosure("Tiger Enclosure", Habitat.GRASSLAND, population2);
        elephant = new Elephant("Dumbo", 1);
        tiger = new Tiger("Tony", 6);
    }

    @Test
    public void testCanGetZooName() {
        assertEquals("Edinburgh Zoo", zoo.getName());
    }

    @Test
    public void testCanAddEnclosures() {
        zoo.addEnclosure(enclosure1);
        zoo.addEnclosure(enclosure2);
        assertEquals(2, zoo.getEnclosures().size());
    }

    @Test
    public void testCanRemoveRemoveEnclosures() {
        zoo.addEnclosure(enclosure1);
        zoo.addEnclosure(enclosure2);
        zoo.removeEnclosure(enclosure1);
        assertEquals(1, zoo.getEnclosures().size());
    }
}

