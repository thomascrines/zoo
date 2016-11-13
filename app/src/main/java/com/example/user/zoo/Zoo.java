package com.example.user.zoo;

import java.util.ArrayList;

/**
 * Created by user on 12/11/2016.
 */

public class Zoo {

    private String name;
    private int capacity;
    private ArrayList<Enclosure> enclosures;
    private FoodStorage foodStorage;
    private double funds;

    public Zoo(String name, int capacity, double funds) {
        this.name = name;
        this.capacity = capacity;
        this.enclosures = new ArrayList<>();
        this.funds = funds;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getFunds() {
        return funds;
    }

    public ArrayList<Enclosure> getEnclosures() {
        return enclosures;
    }

    public void addEnclosure(Enclosure enclosure) {
        enclosures.add(enclosure);
    }

    public void removeEnclosure(Enclosure enclosure) {
        enclosures.remove(enclosure);
    }

//    public void feedAnimals() {
//        for (Enclosure enclosure : enclosures) {
//            for (Animal animal : enclosure.Population) {
//                for (Food food : foodStorage)
//                if (food.getFoodType() == animal.getDiet()) {
//                    foodStorage.removeFood(food);
//                }
//            }
//        }
//    }

    public void sellTickets (Ticket ticket, int quantity) {
        for (int i = 0; i < quantity; i++) {
            funds += ticket.getPrice();
        }
        for (int i = 0; i < quantity; i++) {
            capacity -= ticket.getNumberOfVisitors();
        }
    }
}
