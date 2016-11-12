package com.example.user.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 12/11/2016.
 */

public class PopulationTest {

        Population population1;
        Population population2;
        Elephant elephant;

        @Before
        public void before() {
            population1 = new Population("Tropical Bird House", Habitat.BIRD_CAGE);
            population2 = new Population("Elephant Paddock", Habitat.GRASSLAND);
            elephant = new Elephant("Dumbo", 1);
        }

        @Test
        public void testCanGetEnclosureName() {
            assertEquals("Tropical Bird House", population1.getName());
        }

        @Test
        public void testCanGetHabitat() {
            assertEquals(Habitat.BIRD_CAGE, population1.getHabitat());
        }

    @Test
    public void testCanAddCaptives() {
        population2.addAnimal(elephant);
        assertEquals(1, population2.getCaptives().size());
    }

    @Test
    public void testCanRemoveAnimals() {
        population2.addAnimal(elephant);
        population2.removeAnimal(elephant);
        assertEquals(0, population2.getCaptives().size());
    }
    }


