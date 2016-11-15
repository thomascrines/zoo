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
        this.foodStorage = new FoodStorage();
        this.funds = funds;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getCapacityToString() {
        return Integer.toString(capacity);
    }

    public double getFunds() {
        return funds;
    }

    public String getFundsToString() {
        return Double.toString(funds);
    }

    public ArrayList<Enclosure> getEnclosures() {
        return enclosures;
    }

    public FoodStorage getFoodStorage() {
        return foodStorage;
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
            for (Diet foodType : enclosure.getNecessaryDiet()) {
                zooDailyDiet.add(foodType);
            }
        }
    }

    public void removeFoodFromStore() {
        for (Diet diet : zooDailyDiet) {
            Food food = foodStorage.findFoodByType(diet);
            foodStorage.removeFood(food);

        }
    }

    public void buyFood(Food food, int quantity) {
        foodStorage.addFood(food, quantity);
        for (int i = 0; i < quantity; i++) {
            funds -= food.getCost();
        }
    }

    public ArrayList<Diet> getNecessaryFoodForDay() {
        return this.zooDailyDiet;
    }


    public void sellTickets(Ticket ticket, int quantity) {
        for (int i = 0; i < quantity; i++) {
            funds += ticket.getPrice();
        }
        for (int i = 0; i < quantity; i++) {
            capacity -= ticket.getNumberOfVisitors();
        }
    }

    public void sellAnimal(Animal animal, Enclosure enclosure) {
        if (animal.getAge() <= 1) {
            funds += animal.getValue();
            enclosure.getPopulation().returnPopulation().remove(animal);
        }
    }

    public void animalEscape(Animal animal, Enclosure enclosure) {
        enclosure.getPopulation().returnPopulation().remove(animal);
        funds -= animal.getValue() * 2;
    }

    public String viewStockAsString() {
        int peanutsCounter = 0;
        int meatCounter = 0;
        int grainsCounter = 0;
        int birdFeedCounter = 0;

        for (Food food : foodStorage.getTotalFood()) {
            if (food.getFoodType() == Diet.PEANUTS) {
                peanutsCounter += 1;
            }
            if (food.getFoodType() == Diet.MEAT) {
                meatCounter += 1;
            }
            if (food.getFoodType() == Diet.GRAINS) {
                grainsCounter += 1;
            }
            if (food.getFoodType() == Diet.BIRD_FEED) {
                birdFeedCounter += 1;

            }
        }
        return "Peanuts: " + Integer.toString(peanutsCounter) + "\n" + "Meat: " + Integer.toString(meatCounter) + "\n" + "Grains: " + Integer.toString(grainsCounter) + "\n" + "Bird Feed: " + Integer.toString(birdFeedCounter);
    }
}
