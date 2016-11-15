package com.example.user.zoo;

import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

/**
 * Created by user on 15/11/2016.
 */

public class ZooDemo {

    public Zoo zoo;
    Enclosure enclosure1;
    Enclosure enclosure2;
    Enclosure enclosure3;
    Enclosure enclosure4;
    Population population1;
    Population population2;
    Population population3;
    Population population4;
    Elephant elephant1;
    Elephant elephant2;
    Tiger tiger;
    Shark shark1;
    Shark shark2;
    Shark shark3;
    Parrot parrot1;
    Parrot parrot2;
    Parrot parrot3;
    Parrot parrot4;
    FoodStorage foodStorage;
    Peanuts peanuts;
    Meat meat;
    Grains grains;
    BirdFeed birdFeed;
    Ticket standard;
    Ticket concession;
    Ticket threeToFifteen;
    Ticket underThree;
    Ticket family;
    Ticket group;

    public ZooDemo() {
        zoo = new Zoo("Edinburgh Zoo", 4000, 500000);
        population1 = new Population();
        population2 = new Population();
        enclosure1 = new Enclosure("Elephant Enclosure", Habitat.GRASSLAND, population1, false);
        enclosure2 = new Enclosure("Tiger Enclosure", Habitat.GRASSLAND, population2, true);
        enclosure3 = new Enclosure("Shark Tank", Habitat.SALT_WATER, population3, true);
        enclosure4 = new Enclosure("Parrot Cage", Habitat.BIRD_CAGE, population4, false);
        elephant1 = new Elephant("Dumbo", 0);
        elephant2 = new Elephant("Dumbo's Mum", 12);
        tiger = new Tiger("Tony", 6);
        shark1 = new Shark("Jaws 1", 14);
        shark2 = new Shark("Jaws 2", 13);
        shark3 = new Shark("Jaws 3", 12);
        parrot1 = new Parrot("Iago", 4);
        parrot2 = new Parrot("Parrot 2", 3);
        parrot3 = new Parrot("Parrot 3", 3);
        parrot4 = new Parrot("Parrot 4", 3);
        foodStorage = new FoodStorage();
        peanuts = new Peanuts();
        meat = new Meat();
        grains = new Grains();
        birdFeed = new BirdFeed();
        this.foodStorage.addFood(peanuts, 134);
        this.foodStorage.addFood(meat, 120);
        this.foodStorage.addFood(birdFeed, 22);
        this.foodStorage.addFood(grains, 31);
        standard = new Ticket(TicketType.STANDARD, 17.00, 1);
        concession = new Ticket(TicketType.CONCESSION, 14.50, 1);
        threeToFifteen = new Ticket(TicketType.CHILD_3_TO_15, 12.50, 1);
        underThree = new Ticket(TicketType.CHILD_UNDER_3, 0.00, 1);
        family = new Ticket(TicketType.FAMILY, 53.50, 4);
        group = new Ticket(TicketType.GROUP, 210.00, 15);
    }

}
