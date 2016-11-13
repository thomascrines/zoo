package com.example.user.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 12/11/2016.
 */

public class ZooTest {
    Zoo zoo;
    Enclosure enclosure1;
    Enclosure enclosure2;
    Population population1;
    Population population2;
    Elephant elephant;
    Tiger tiger;
    FoodStorage foodStorage;
    Food peanuts;
    Food meat;
    Ticket standard;
    Ticket concession;
    Ticket threeToFifteen;
    Ticket underThree;
    Ticket family;
    Ticket group;

    @Before
    public void before() {
        zoo = new Zoo("Edinburgh Zoo", 4000, 0);
        enclosure1 = new Enclosure("Elephant Enclosure", Habitat.GRASSLAND, population1);
        enclosure2 = new Enclosure("Tiger Enclosure", Habitat.GRASSLAND, population2);
        elephant = new Elephant("Dumbo", 1);
        tiger = new Tiger("Tony", 6);
        foodStorage = new FoodStorage();
        peanuts = new Food("Peanuts", 0.55, Diet.PEANUTS);
        meat = new Food("Meat", 2.35, Diet.MEAT);
        standard = new Ticket(TicketType.STANDARD, 17.00, 1);
        concession = new Ticket(TicketType.CONCESSION, 14.50, 1);
        threeToFifteen = new Ticket(TicketType.CHILD_3_TO_15, 12.50, 1);
        underThree = new Ticket(TicketType.CHILD_UNDER_3, 0.00, 1);
        family = new Ticket(TicketType.FAMILY, 53.50, 4);
        group = new Ticket(TicketType.GROUP, 210.00, 15);
    }

    @Test
    public void testCanGetZooName() {
        assertEquals("Edinburgh Zoo", zoo.getName());
    }

    @Test
    public void testCanGetCapacity() {
        assertEquals(4000, zoo.getCapacity());
    }

    @Test
    public void testCanAddEnclosures() {
        zoo.addEnclosure(enclosure1);
        zoo.addEnclosure(enclosure2);
        assertEquals(2, zoo.getEnclosures().size());
    }

    @Test
    public void testCanRemoveRemoveEnclosures() {
        zoo.addEnclosure(enclosure1);
        zoo.addEnclosure(enclosure2);
        zoo.removeEnclosure(enclosure1);
        assertEquals(1, zoo.getEnclosures().size());
    }

//    @Test
//    public void testCanFeedAllAnimals() {
//        zoo.addEnclosure(enclosure1);
//        zoo.addEnclosure(enclosure2);
//        enclosure1.getPopulation().addAnimal(elephant);
//        enclosure2.getPopulation().addAnimal(tiger);
//        foodStorage.addFood(peanuts, 6);
//        foodStorage.addFood(meat, 1);
//        zoo.feedAnimals();
//        assertEquals(5, foodStorage.getTotalFood().size());
//    }

    @Test
    public void testCanSellTickets() {
        zoo.sellTickets(standard, 2);
        zoo.sellTickets(concession, 2);
        zoo.sellTickets(threeToFifteen, 2);
        zoo.sellTickets(underThree, 2);
        zoo.sellTickets(family, 2);
        zoo.sellTickets(group, 2);
        assertEquals(615, zoo.getFunds(), 0.1);
        assertEquals(3069, zoo.getCapacity());
    }
}
