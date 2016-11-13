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

    public ArrayList<Animal> getInhabitants() {
        return this.population;
    }

    public void addAnimal(Animal animal) {
        population.add(animal);
    }

    public void removeAnimal(Animal animal) {
        population.remove(animal);
    }

}
