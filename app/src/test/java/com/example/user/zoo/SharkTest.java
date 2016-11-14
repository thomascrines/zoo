package com.example.user.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 14/11/2016.
 */

public class SharkTest {

    Shark shark;

    @Before
    public void before(){
        shark = new Shark("Jaws", 6);
    }

    @Test
    public void testCanGetName(){
        assertEquals("Jaws", shark.getName());
    }

    @Test
    public void testCanGetAge() {
        assertEquals(6, shark.getAge());
    }

    @Test
    public void testCanGetSpecies() {
        assertEquals("Shark", shark.getSpecies());
    }

    @Test
    public void testCanGetHabitat(){
        assertEquals(Habitat.SALT_WATER, shark.getHabitat());
    }

    @Test
    public void animalCanBeCarnivorous() {
        assertEquals(true, shark.isCarnivorous());
    }

    @Test
    public void canGetDiet() {
        assertEquals(Diet.MEAT, shark.getDiet());
    }

    @Test
    public void testCanGetValue() {
        assertEquals(40000, shark.getValue(), 0.1);
    }
}

