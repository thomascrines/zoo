package com.example.user.zoo;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 12/11/2016.
 */

public class EnclosureTest {

        Enclosure enclosure1;
        Enclosure enclosure2;

        @Before
        public void before() {
            enclosure1 = new Enclosure("Tropical Bird House", Habitat.BIRD_CAGE);
            enclosure2 = new Enclosure("Elephant Paddock", Habitat.GRASSLAND);
        }

        @Test
        public void testCanGetEnclosureName() {
            assertEquals("Tropical Bird House", enclosure1.getName());
        }

        @Test
        public void testCanGetHabitat() {
            assertEquals(Habitat.BIRD_CAGE, enclosure1.getHabitat());
        }

    @Test
    public void testCanAddCaptives() {
        enclosure2.addAnimal(new Elephant("Dumbo", 1));
        assertEquals(1, enclosure2.getCaptives().size());
    }
    }


