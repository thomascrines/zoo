package com.example.user.zoo;

import java.util.ArrayList;

/**
 * Created by user on 12/11/2016.
 */

public class Zoo {

    private String name;
    private int capacity;
    private ArrayList<Enclosure> enclosures;
    private ArrayList<Diet> zooDailyDiet;
    private FoodStorage foodStorage;
    private double funds;

    public Zoo(String name, int capacity, double funds) {
        this.name = name;
        this.capacity = capacity;
        this.enclosures = new ArrayList<>();
        this.zooDailyDiet = new ArrayList<>();
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

    public void addNecessaryFoodForDay() {
        for (Enclosure enclosure : enclosures) {
            enclosure.addNecessaryDiet();
            for (Diet foodType : enclosure.getNecessaryDiet())
            zooDailyDiet.add(foodType);
        }
    }

    public ArrayList<Diet> getNecessaryFoodForDay() {
        return this.zooDailyDiet;
    }

//    public void removeNecessaryFoodFromFoodStorage() {
//        for (Food food : foodStorage)
//            if (food.getFoodType() == animal.getDiet()) {
//                foodStorage.removeFood(food);
//            }
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
