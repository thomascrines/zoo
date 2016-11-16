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
    Shark shark;
    ArrayList<Diet> test_array;

    @Before
    public void before() {
        elephant = new Elephant("Dumbo", 1);
        tiger = new Tiger("Shere Khan", 7);
        shark = new Shark("Jaws", 6);
        peanuts = new Peanuts();
        diet1 = Diet.PEANUTS;
        diet2 = Diet.MEAT;
        population = new Population();
        enclosure = new Enclosure("Elephant Enclosure", Habitat.GRASSLAND, population, false);
        test_array = new ArrayList<>();
        test_array.add(diet1);
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
    public void testCantAddAnimalToWrongHabitat() {
        enclosure.addAnimalToEnclosure(elephant);
        enclosure.addAnimalToEnclosure(shark);
        assertEquals(1, enclosure.getPopulation().returnPopulation().size());
    }

    @Test
    public void testCantAddAnimalToWrongDietPop() {
        enclosure.addAnimalToEnclosure(elephant);
        enclosure.addAnimalToEnclosure(tiger);
        assertEquals(1, enclosure.getPopulation().returnPopulation().size());
    }

    @Test
    public void testCanGetGetNecessaryDiet() {
        enclosure.addAnimalToEnclosure(elephant);
        enclosure.addAnimalToEnclosure(tiger);
        enclosure.addNecessaryDiet();
        assertEquals(test_array, enclosure.getNecessaryDiet());
    }

}
