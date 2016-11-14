package com.example.user.zoo;


import java.util.ArrayList;

/**
 * Created by user on 13/11/2016.
 */

public class Enclosure {

    private String name;
    private Habitat habitat;
    private Population population;
    private ArrayList<Diet> necessaryDiet;

    public Enclosure(String name, Habitat habitat, Population population) {
        this.name = name;
        this.habitat = habitat;
        this.population = population;
        this.necessaryDiet = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public Population getPopulation() {
        return population;
    }

    public void addAnimalToEnclosure(Animal animal) {
        if (animal.getHabitat() == habitat) {
            this.getPopulation().addAnimal(animal);
        }
    }

    public ArrayList<Diet> getNecessaryDiet() {
        return this.necessaryDiet;
    }

    public Diet addNecessaryDiet() {
        for (Animal animal : population.returnPopulation()) {
            necessaryDiet.add(animal.getDiet());
        }
        return null;
    }

}
