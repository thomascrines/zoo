package com.example.user.zoo;

/**
 * Created by user on 12/11/2016.
 */

abstract class Animal {

    private String species;
    private Habitat habitat;
    private boolean carnivore;
    private Diet diet;

    public Animal(String species, Habitat habitat, boolean carnivore, Diet diet) {
        this.species = species;
        this.habitat = habitat;
        this.carnivore = carnivore;
        this.diet = diet;
    }

    public String getSpecies() {
        return this.species;
    }

    public Habitat getHabitat() {
        return this.habitat;
    }

    public boolean isCarnivorous() {
        return this.carnivore;
    }

    public Diet getDiet() {
        return this.diet;
    }

}
