package com.example.user.zoo;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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
    ArrayList<Diet> test_array;
    Diet diet1;
    Diet diet2;

    @Before
    public void before() {
        zoo = new Zoo("Edinburgh Zoo", 4000, 500000);
        population1 = new Population();
        population2 = new Population();
        enclosure1 = new Enclosure("Elephant Enclosure", Habitat.GRASSLAND, population1);
        enclosure2 = new Enclosure("Tiger Enclosure", Habitat.GRASSLAND, population2);
        elephant = new Elephant("Dumbo", 0);
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
        test_array = new ArrayList<>();
        diet1 = Diet.PEANUTS;
        diet2 = Diet.MEAT;
        test_array.add(diet1);
        test_array.add(diet2);
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

    @Test
    public void testCanAddNecessaryFoodForDay() {
        zoo.addEnclosure(enclosure1);
        zoo.addEnclosure(enclosure2);
        enclosure1.getPopulation().addAnimal(elephant);
        enclosure2.getPopulation().addAnimal(tiger);
        zoo.addNecessaryFoodForDay();
        assertEquals(test_array, zoo.getNecessaryFoodForDay());
    }

//    @Test
//    public void testCanRemoveDailyFoodFromStore() {
//        FoodStorage testFoodStore= new FoodStorage();
//        testFoodStore.addFood(peanuts, 3);
//        testFoodStore.addFood(meat, 3);
//
//        foodStorage.addFood(peanuts, 4);
//        foodStorage.addFood(meat, 4);
//        zoo.addEnclosure(enclosure1);
//        zoo.addEnclosure(enclosure2);
//        enclosure1.getPopulation().addAnimal(elephant);
//        enclosure2.getPopulation().addAnimal(tiger);
//        zoo.addNecessaryFoodForDay();
//        zoo.removeNecessaryFoodFromFoodStorage();
//
////        assertEquals(testFoodStore.getTotalFood(), foodStorage.getTotalFood());
////        assertEquals(9997.10, zoo.getFunds(), 0.1);
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
        assertEquals(3954, zoo.getCapacity());
    }

    @Test
    public void testCanSellBabyElephant() {
        zoo.addEnclosure(enclosure1);
        enclosure1.getPopulation().addAnimal(elephant);
        zoo.sellElephant(elephant, enclosure1);
        assertEquals(0, enclosure1.getPopulation().returnPopulation().size());
        assertEquals(60000, zoo.getFunds(), 0.1);
    }

    @Test
    public void testAnimalCanEscape() {
        zoo.addEnclosure(enclosure1);
        enclosure1.getPopulation().addAnimal(tiger);
        zoo.animalEscape(tiger, enclosure1);
        assertEquals(350000, zoo.getFunds(), 0.1);
    }
}