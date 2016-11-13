package com.example.user.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 12/11/2016.
 */

public class PopulationTest {

        Population population;
        Elephant elephant;
        Tiger tiger;

        @Before
        public void before() {
            population = new Population();
            elephant = new Elephant("Dumbo", 1);
            tiger = new Tiger("Tony", 6);
        }

    @Test
    public void testCanAddCaptives() {
        population.addAnimal(elephant);
        assertEquals(1, population.getPopulation().size());
    }

    @Test
    public void testCanRemoveAnimals() {
        population.addAnimal(elephant);
        population.addAnimal(tiger);
        population.removeAnimal(elephant);
        assertEquals(1, population.getPopulation().size());
    }
    }


