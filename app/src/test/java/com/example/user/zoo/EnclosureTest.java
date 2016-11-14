package com.example.user.zoo;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 13/11/2016.
 */

public class EnclosureTest {

    Enclosure enclosure;
    Population population;
    Food peanuts;
    Diet diet1;
    Diet diet2;
    Elephant elephant;
    Tiger tiger;
    ArrayList<Diet> test_array;

    @Before
    public void before() {
        elephant = new Elephant("Dumbo", 1);
        tiger = new Tiger("Shere Khan", 7);
        peanuts = new Food("Peanuts", 0.55, Diet.PEANUTS);
        diet1 = Diet.PEANUTS;
        diet2 = Diet.MEAT;
        population = new Population();
        enclosure = new Enclosure("Elephant Enclosure", Habitat.GRASSLAND, population);
        test_array = new ArrayList<>();
        test_array.add(diet1);
        test_array.add(diet2);
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
    public void testCanGetGetNecessaryDiet() {
        enclosure.getPopulation().addAnimal(elephant);
        enclosure.getPopulation().addAnimal(tiger);
        enclosure.addNecessaryDiet();
        assertEquals(test_array, enclosure.getNecessaryDiet());
    }
}
