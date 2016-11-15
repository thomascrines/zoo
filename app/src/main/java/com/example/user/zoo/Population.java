package com.example.user.zoo;

import java.util.ArrayList;

/**
 * Created by user on 12/11/2016.
 */

public class Population {

    private ArrayList<Animal> population;

    public Population() {

        this.population = new ArrayList<>();
    }

    public ArrayList<Animal> returnPopulation() {
        return population;
    }

    public void addAnimal(Animal animal) {
        population.add(animal);
        }

    public void removeAnimal(Animal animal) {
        population.remove(animal);
    }

    @Override
    public String toString() {
        String displayText =  "";

        for (Animal animal : population) {
            displayText += animal.getName();
            displayText += " | ";
            displayText += animal.getSpecies();
            displayText += "\n";
        }

        return displayText;



    }

}
