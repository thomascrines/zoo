package com.example.user.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 12/11/2016.
 */

public class ElephantTest {

        Elephant elephant;

        @Before
        public void before(){
            elephant = new Elephant("Dumbo", 1);
        }

        @Test
        public void testCanGetName(){
            assertEquals("Dumbo", elephant.getName());
        }

         @Test
        public void testCanGetAge() {
            assertEquals(1, elephant.getAge());
        }

        @Test
        public void testCanGetSpecies() {
            assertEquals("Elephant", elephant.getSpecies());
        }

    @Test
    public void testCanGetHabitat(){
        assertEquals(Habitat.GRASSLAND, elephant.getHabitat());
    }

    @Test
    public void animalCanBeCarnivorous() {
        assertEquals(false, elephant.isCarnivorous());
    }

    @Test
    public void canGetDiet() {
        assertEquals(Diet.PEANUTS, elephant.getDiet());
    }

    @Test
    public void testCanGetValue() {
        assertEquals(50000, elephant.getValue(), 0.1);
    }
}
