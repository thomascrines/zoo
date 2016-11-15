//package com.example.user.zoo;
//
//import java.util.ArrayList;
//
///**
// * Created by user on 15/11/2016.
// */
//
//public class ZooDemo {
//
//    Zoo zoo;
//    Enclosure enclosure1;
//    Enclosure enclosure2;
//    Enclosure enclosure3;
//    Enclosure enclosure4;
//    Enclosure enclosure5;
//    Population population1;
//    Population population2;
//    Population population3;
//    Population population4;
//    Population population5;
//    Elephant elephant;
//    Tiger tiger;
//    Shark shark;
//    FoodStorage foodStorage;
//    Food peanuts;
//    Food meat;
//    Ticket standard;
//    Ticket concession;
//    Ticket threeToFifteen;
//    Ticket underThree;
//    Ticket family;
//    Ticket group;
//    ArrayList<Diet> test_array;
//    Diet diet1;
//    Diet diet2;
//
//    public Zoo("Edinburgh Zoo", 4000, 500000) {
//        population1 = new Population();
//        population2 = new Population();
//        enclosure1 = new Enclosure("Elephant Enclosure", Habitat.GRASSLAND, population1, false);
//        enclosure2 = new Enclosure("Tiger Enclosure", Habitat.GRASSLAND, population2, true);
//        elephant = new Elephant("Dumbo", 0);
//        tiger = new Tiger("Tony", 6);
//        foodStorage = new FoodStorage();
//        peanuts = new Peanuts();
//        meat = new Meat();
//        standard = new Ticket(TicketType.STANDARD, 17.00, 1);
//        concession = new Ticket(TicketType.CONCESSION, 14.50, 1);
//        threeToFifteen = new Ticket(TicketType.CHILD_3_TO_15, 12.50, 1);
//        underThree = new Ticket(TicketType.CHILD_UNDER_3, 0.00, 1);
//        family = new Ticket(TicketType.FAMILY, 53.50, 4);
//        group = new Ticket(TicketType.GROUP, 210.00, 15);
//        test_array = new ArrayList<>();
//        diet1 = Diet.PEANUTS;
//        diet2 = Diet.MEAT;
//    }
//}
