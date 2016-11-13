package com.example.user.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 12/11/2016.
 */

public class ZooTest {
    Zoo zoo;
    Population population1;
    Population population2;
    Elephant elephant;
    Tiger tiger;

    @Before
    public void before() {
        zoo = new Zoo("Edinburgh Zoo");
        population1 = new Population();
        population2 = new Population();
        elephant = new Elephant("Dumbo", 1);
        tiger = new Tiger("Tony", 6);
    }

    @Test
    public void testCanGetZooName() {
        assertEquals("Edinburgh Zoo", zoo.getName());
    }

    @Test
    public void testCanAddEnclosures() {
        zoo.addEnclosure(population1);
        assertEquals(1, zoo.getEnclosures().size());
    }

    @Test
    public void testCanRemoveRemoveEnclosures() {
        zoo.addEnclosure(population1);
        zoo.addEnclosure(population2);
        zoo.removeEnclosure(population1);
        assertEquals(1, zoo.getEnclosures().size());
    }
}

