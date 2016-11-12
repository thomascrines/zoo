package com.example.user.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 12/11/2016.
 */

public class AnimalTest {
    Animal animal1;
    Animal animal2;

    @Before
    public void before(){
        animal1 = new Animal("African Elephant", Habitat.DESERT, false, Diet.PEANUTS);
        animal2 = new Animal("Siberian Tiger", Habitat.GRASSLAND, true, Diet.MEAT);
    }

    @Test
    public void testCanGetSpecies(){
        assertEquals("African Elephant", animal1.getSpecies());
    }

    @Test
    public void testCanGetHabitat(){
        assertEquals(Habitat.DESERT, animal1.getHabitat());
    }

    @Test
    public void animalCanBeCarnivorous() {
        assertEquals(false, animal1.isCarnivorous());
        assertEquals(true, animal2.isCarnivorous());
    }

    @Test
    public void canGetDiet() {
        assertEquals(Diet.PEANUTS, animal1.getDiet());
        assertEquals(Diet.MEAT, animal2.getDiet());
    }

}



