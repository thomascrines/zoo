package com.example.user.zoo;

import java.util.ArrayList;

/**
 * Created by user on 12/11/2016.
 */

public class Population {

    public ArrayList<Animal> population;

    public Population() {

        this.population = new ArrayList<>();
    }

    public ArrayList<Animal> returnPopulation() {
        return population;
    }

    public void addAnimal(Animal animal) {
        for (Animal residentAnimal : population) {
            if (animal.isCarnivorous() && population.contains(residentAnimal.isCarnivorous())) ;
            population.add(animal);
            if (!animal.isCarnivorous() && population.contains(!residentAnimal.isCarnivorous()));
            population.add(animal);
        }
    }

    public void removeAnimal(Animal animal) {
        population.remove(animal);
    }

}
