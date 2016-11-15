package com.example.user.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 15/11/2016.
 */

public class ParrotTest {

    Parrot parrot;

    @Before
    public void before(){
        parrot = new Parrot("Iago", 4);
    }

    @Test
    public void testCanGetName(){
        assertEquals("Iago", parrot.getName());
    }

    @Test
    public void testCanGetAge() {
        assertEquals(4, parrot.getAge());
    }

    @Test
    public void testCanGetSpecies() {
        assertEquals("Parrot", parrot.getSpecies());
    }

    @Test
    public void testCanGetHabitat(){
        assertEquals(Habitat.BIRD_CAGE, parrot.getHabitat());
    }

    @Test
    public void animalCanBeCarnivorous() {
        assertEquals(false, parrot.isCarnivorous());
    }

    @Test
    public void canGetDiet() {
        assertEquals(Diet.GRAINS, parrot.getDiet());
    }

    @Test
    public void testCanGetValue() {
        assertEquals(300, parrot.getValue(), 0.1);
    }
}
