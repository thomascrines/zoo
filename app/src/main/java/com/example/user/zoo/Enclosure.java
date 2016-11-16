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
    private boolean popIsCarnivorous;

    public Enclosure(String name, Habitat habitat, Population population, boolean popIsCarnivorous) {
        this.name = name;
        this.habitat = habitat;
        this.population = population;
        this.necessaryDiet = new ArrayList<>();
        this.popIsCarnivorous = popIsCarnivorous;
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

    public boolean checkIfAnimalIsSuitableForEnclosure(Animal animal) {
        if (animal.isCarnivorous() == popIsCarnivorous) return true;
        else return false;
    }

    public void addAnimalToEnclosure(Animal animal) {
        if (this.checkIfAnimalIsSuitableForEnclosure(animal)) {
            if (animal.getHabitat() == habitat) {
                this.getPopulation().addAnimal(animal);
            }
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

    public String viewDetailsAsString() {
        return "Enclosure name: " + name.toString() + "\nHabitat type: " + habitat.toString() + "\nPopulation: " + Integer.toString(population.returnPopulation().size()) + "\n";
    }

    public String viewPopulationAsString() {
        String total_population = "";
        for (Animal animal : population.returnPopulation()) {
            total_population += "Name: " + animal.getName() + "\nAge: " + Integer.toString(animal.getAge()) + "\nSpecies: " + animal.getSpecies() + "\nValue: " + Double.toString(animal.getValue()) + "\n \n";
        }
        return total_population;
    }

}
