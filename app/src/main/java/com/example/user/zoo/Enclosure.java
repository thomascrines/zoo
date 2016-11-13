package com.example.user.zoo;


/**
 * Created by user on 13/11/2016.
 */

public class Enclosure {

    private String name;
    private Habitat habitat;
    private Population population;

    public Enclosure(String name, Habitat habitat, Population population) {
        this.name = name;
        this.habitat = habitat;
        this.population = population;
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

}
