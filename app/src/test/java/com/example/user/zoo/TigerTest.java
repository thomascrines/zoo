package com.example.user.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 12/11/2016.
 */

public class TigerTest {

    Tiger tiger;

    @Before
    public void before(){
        tiger = new Tiger("Tony", 6);
    }

    @Test
    public void testCanGetName(){
        assertEquals("Tony", tiger.getName());
    }

    @Test
    public void testCanGetAge() {
        assertEquals(0, tiger.getAge());
    }

    @Test
    public void testCanSetAge() {
        tiger.setAge();
        assertEquals(6, tiger.getAge());
    }

    @Test
    public void testCanGetSpecies() {
        assertEquals("Tiger", tiger.getSpecies());
    }

    @Test
    public void testCanGetHabitat(){
        assertEquals(Habitat.GRASSLAND, tiger.getHabitat());
    }

    @Test
    public void animalCanBeCarnivorous() {
        assertEquals(true, tiger.isCarnivorous());
    }

    @Test
    public void canGetDiet() {
        assertEquals(Diet.MEAT, tiger.getDiet());
    }

    @Test
    public void testCanGetValue() {
        assertEquals(75000, tiger.getValue(), 0.1);
    }
}
